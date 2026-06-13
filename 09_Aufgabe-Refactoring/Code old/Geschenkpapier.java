package Geschenkpapier;
/**
 * Dateiname: Geschenkpapier.java 
 * Beschreibung: Eine Klasse zur Erstellung eines Musters in der Ausgabe mit Vorgaben vom Benutzer
 *
 * @author Marvin B. (mabo3343@bht-berlin.de)
 * @version 1.0, 12/2024
 * @param Zeilen = Anzahl der gewünschten Zeilen, spalten = Anzahl der gewünschten Spalten, art = Art des Musters Case M1 oder M2
 */
 
public class Geschenkpapier {

	public static void muster (String art, int zeilen, int spalten) {
				
		switch (art) {
			//Muster 1 "** "
			case "M1" -> {
				//Zeilen schleife
				for (int z=1; z <= zeilen; z++) {
					// Spalen schleife
					for (int i=1; i <= spalten; i++) {
					System.out.print("** ");
					}
				System.out.println();	
			
				}
			}
			//Muster 2
			case "M2" -> {
				int z = 1;
				int s = 1;
				int s2 =1;
				//Zeilen schleife
				while (zeilen >= z) {
					//If Unterscheidung gerade Zeile oder ungerade Zeile
					if	(z % 2== 0) {
						//Spalten schleife
						while (spalten >= s) {
						System.out.print(" )-:");
						s++;
						}
					} else {
						while (spalten >= s2){
						System.out.print(":-) ");
						s2++;
						}
					
					}
				System.out.println();
				z++;
				s = 1;
				s2 = 1;
				}
			}
			
		}
	}
}
