package cocktailbar;

import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BarTest {

    private Bar bar;
    
	// Zutaten Alkohol
	private Zutat weißerRum = new Zutat("wei�er Rum",true);
	private Zutat braunerRum = new Zutat("brauner Rum", true);
	
	//Zutaten Alkoholfrei
	private Zutat zucker = new Zutat("Zuckersirup",false);
	private Zutat limettensaft = new Zutat("Limettensaft",false);
	private Zutat soda = new Zutat("Sodawasser", false);
	private Zutat mandelsirup = new Zutat("Mandelsirup", false);
	private Zutat ananassaft = new Zutat("Ananassaft", false);
	private Zutat orangenlikör = new Zutat("Orangenlik�r", false);
	private Zutat orangensaft = new Zutat("Orangensaft", false);
	private Zutat maracujasirup = new Zutat("Maracujasirup", false);
	
	//Cocktails
	private Cocktail mojito, maiTai, hurricane, virginMojito;
		
	@BeforeAll
	public void rezepte() {
		//Mai Tai
		HashMap<Zutat, Double> maiTaiRezept = new HashMap<>();
		maiTaiRezept.put(braunerRum, 6.0);
		maiTaiRezept.put(mandelsirup, 1.0);
		maiTaiRezept.put(zucker, 1.0);
		maiTaiRezept.put(ananassaft, 5.0);
		maiTaiRezept.put(orangenlikör,2.0);
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
		
		//Virgin Mojito
		HashMap<Zutat, Double> virginMojitoRezept = new HashMap<>();
		virginMojitoRezept.put(limettensaft, 3.0);
		virginMojitoRezept.put(zucker, 2.0);
		virginMojitoRezept.put(soda, 6.0);
			    
				
		mojito = new Cocktail("Mojito", mojitoRezept);
		hurricane = new Cocktail("Hurricane", hurricaneRezept);
		maiTai = new Cocktail("Mai Tai", maiTaiRezept);
		virginMojito = new Cocktail("Virgin Mojito", virginMojitoRezept);
				
	}
	
    @BeforeEach
    public void setUp() {
        bar = new Bar();
        
        bar.addCocktail(mojito);
       	bar.addCocktail(maiTai);
    	bar.addCocktail(hurricane);
    	bar.addCocktail(virginMojito);
    }

    @Test
    public void testAddCocktail() {
 
        // Test: Anzahl der Cocktails soll 1 sein
        assertEquals(4, bar.getAnzahlCocktails());
    }
    
    @Test
    public void testSpeichernUndLaden() throws IOException {
    			
        String dateiPfad = "test_cocktails.txt";

        // Speichern
        bar.speichereRezepte(dateiPfad);

        // Neue Bar laden
        Bar bar2 = new Bar();
        bar2.ladeRezepte(dateiPfad);

        // Assert
        assertEquals(bar.getAnzahlCocktails(), bar2.getAnzahlCocktails());
        assertEquals(bar.getCocktails(), bar2.getCocktails());

        // Datei nach dem Test l�schen
       // new File(dateiPfad).delete();
    }
    
    @Test
    public void testFiltereRezepte_findetAlkoholfreie() {
    	ArrayList<Cocktail> alkoholfreie = bar.filtereRezepte(
    			cocktail -> cocktail.getRezept().keySet().stream()
    			.allMatch(z -> !z.getIstAlkoholisch()));
    	
    	assertEquals(1, alkoholfreie.size());
    	assertTrue(alkoholfreie.contains(virginMojito));
    }
    
    @Test
    public void testFiltereRezepte_findetAlkohol() {
    	ArrayList<Cocktail> alkohol = bar.filtereRezepte(
    			cocktail -> cocktail.getRezept().keySet().stream()
    			.anyMatch(x -> x.getIstAlkoholisch()));
    	
    	assertEquals(3, alkohol.size());
    	assertTrue(alkohol.contains(mojito));
    	assertTrue(alkohol.contains(maiTai));
    	assertTrue(alkohol.contains(hurricane));
    	
    }
    
    @Test
    public void testGetAlkoholfreieCocktailsMitStreamApi() {
    	List<Cocktail> alkoholfrei = bar.getAlkoholfreieCocktails();
    	
    	assertEquals(1, alkoholfrei.size());
    	assertEquals("Virgin Mojito", alkoholfrei.get(0).getName());
    	
    }
    
    @Test
    public void testGetCocktailNamenMitMaxZutaten() {
    	List<String> liste = bar.getCocktailNamenMitMaxZutaten(4);
    	System.out.println(liste);
    	assertTrue(liste.contains("Virgin Mojito"));
    	assertTrue(liste.contains("Mojito"));
    	
    }
}