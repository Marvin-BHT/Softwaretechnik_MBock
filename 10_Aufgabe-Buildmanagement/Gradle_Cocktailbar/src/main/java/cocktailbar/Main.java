package cocktailbar;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
	
		Bar bar = new Bar();
		
		// Zutaten Alkohol
		Zutat weißerRum = new Zutat("wei�er Rum",true);
		Zutat braunerRum = new Zutat("brauner Rum", true);
		
		
		
		//Zutaten Alkoholfrei
		Zutat zucker = new Zutat("Zuckersirup",false);
		Zutat limettensaft = new Zutat("Limettensaft",false);
		Zutat soda = new Zutat("Sodawasser", false);
		Zutat mandelsirup = new Zutat("Mandelsirup", false);
		Zutat ananassaft = new Zutat("Ananassaft", false);
		Zutat orangenlikoer = new Zutat("Orangenlikör", false);
		Zutat orangensaft = new Zutat("Orangensaft", false);
		Zutat maracujasirup = new Zutat("Maracujasirup", false);
		
		
		//Mai Tai
		HashMap<Zutat, Double> maiTaiRezept = new HashMap<>();
		maiTaiRezept.put(braunerRum, 6.0);
		maiTaiRezept.put(mandelsirup, 1.0);
		maiTaiRezept.put(zucker, 1.0);
		maiTaiRezept.put(ananassaft, 5.0);
		maiTaiRezept.put(orangenlikoer,2.0);
		maiTaiRezept.put(limettensaft, 2.0);
		
		//Mojito
	    HashMap<Zutat, Double> mojitoRezept = new HashMap<>();
	    mojitoRezept.put(weißerRum, 5.0);
	    mojitoRezept.put(limettensaft, 2.0);
	    mojitoRezept.put(zucker, 1.0);
	    mojitoRezept.put(soda, 3.0);
	    
	    //Hurricane
	    HashMap<Zutat, Double> hurricaneRezept = new HashMap<>();
	    hurricaneRezept.put(weißerRum, 3.0);
	    hurricaneRezept.put(braunerRum, 1.0);
	    hurricaneRezept.put(orangensaft, 5.0);
	    hurricaneRezept.put(maracujasirup, 1.0);
	    hurricaneRezept.put(ananassaft, 5.0);
	    hurricaneRezept.put(limettensaft, 2.0);
	    
		
		Cocktail mojito = new Cocktail("Mojito", mojitoRezept);
		Cocktail hurricane = new Cocktail("Hurricane", hurricaneRezept);
		Cocktail maiTai = new Cocktail("Mai Tai", maiTaiRezept);
		
		bar.addCocktail(mojito);
		bar.addCocktail(maiTai);
		bar.addCocktail(hurricane);
		
		bar.printMenu();
	}

}
