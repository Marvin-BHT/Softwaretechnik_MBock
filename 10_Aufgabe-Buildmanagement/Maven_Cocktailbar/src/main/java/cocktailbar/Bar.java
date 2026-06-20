package cocktailbar;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Bar {

	private ArrayList<Cocktail> cocktails = new ArrayList<>();
	
	public void addCocktail(Cocktail cocktail) {
		cocktails.add(cocktail);
	}
	
	public int getAnzahlCocktails() {
		return cocktails.size();
	}
	
	public void printMenu() {
		for (Cocktail c : cocktails) {
			System.out.println("- " + c.getName() + "\n  " + c.getAnleitung() + "\n");
		//	System.out.println(c.getAnleitung());
		}
	}
	
	
	//Erweiterung
	
    public ArrayList<Cocktail> getCocktails() {
        return cocktails;
    }
	public void speichereRezepte (String dateiPfad) throws IOException{
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(dateiPfad))){
			for (Cocktail cocktail : cocktails) {
                StringBuilder zeile = new StringBuilder();
                zeile.append(cocktail.getName());

                for (Map.Entry<Zutat, Double> eintrag : cocktail.getRezept().entrySet()) {
                    Zutat z = eintrag.getKey();
                    double menge = eintrag.getValue();
                    zeile.append("; ").append(z.getName()).append(", ").append(menge).append(", ").append(z.getIstAlkoholisch());
                }

                writer.write(zeile.toString());
                writer.newLine();
            }
        }
    }
	
    public void ladeRezepte(String dateiPfad) throws IOException {
        ArrayList<Cocktail> geladeneCocktails = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(dateiPfad))) {
            String zeile;

            while ((zeile = reader.readLine()) != null) {
                String[] teile = zeile.split(";");
                String name = teile[0];

                HashMap<Zutat, Double> rezept = new HashMap<>();

                for (int i = 1; i < teile.length; i++) {
                    String[] zutatenInfo = teile[i].split(",");
                    String zName = zutatenInfo[0];
                    double menge = Double.parseDouble(zutatenInfo[1]);
                    boolean istAlk = Boolean.parseBoolean(zutatenInfo[2]);

                    rezept.put(new Zutat(zName, istAlk), menge);
                }

                geladeneCocktails.add(new Cocktail(name, rezept));
            }
        }
        
        this.cocktails = geladeneCocktails;
        
    }
		
    public ArrayList<Cocktail> filtereRezepte(RezeptFilter filter){
    	ArrayList<Cocktail> gefiltert = new ArrayList<>();
    	
    	for (Cocktail c : cocktails) {
    		if (filter.teste(c)) {
    			gefiltert.add(c);
    		}
    	}
    	
    	return gefiltert;
    }
    
    public List<Cocktail> getAlkoholfreieCocktails(){
    	return cocktails.stream().filter(x -> x.getRezept().keySet().stream()
    			.allMatch(z -> !z.getIstAlkoholisch())).collect(Collectors.toList());
    }
		
	public List<String> getCocktailNamenMitMaxZutaten(int maxAnzahl){
		return cocktails.stream().filter(x -> x.getRezept().size() <= maxAnzahl)
				.map(cocktail -> cocktail.getName()).collect(Collectors.toList());
	}
	
}
