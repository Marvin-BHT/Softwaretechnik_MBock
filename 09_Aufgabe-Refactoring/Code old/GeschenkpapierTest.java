package Geschenkpapier;

import java.util.Scanner;
/**
 * Dateiname: GeschenkpapierTest.java 
 * Beschreibung: Ein Test Programmm zum testen der Klasse Geschenkpapier.
 *
 * @author Marvin B. (mabo3343@bht-berlin.de)
 * @version 1.0, 12/2024
 */
public class GeschenkpapierTest {


	public static void main(String[] args) {
		
		//Variablen
		int spalten;
		int zeilen;
		String muster;
		String yn = "y";
		Scanner tastatur;
        tastatur = new Scanner(System.in);
		
		//Muster Auswahl
		System.out.println("Sie können zwischen Muster 1: '** ' mit 'M1'\noder \nMuster 2: ':-) / )-:' mit 'M2' wählen");
			//Start Programmschleife
			do {
			System.out.print("Bitte wählen Sie jetzt zwischen 'M1' und 'M2': ");
			muster = tastatur.next();
				// If Prüfung der Eingabe
        		if (!muster.equals("M1") && !muster.equals("M2")) {
        		System.out.println("fehlerhafte Eingabe");
        		//Schleifenabbruch bei fehlerhafter Eingabe
        		continue;
        		}
        	//Eingabe der Spalten und Zeilen
        	System.out.print("Geben Sie nun die Anzahl der Spalten und der Zeilen an\nSpaltenanzahl: ");
        	spalten = tastatur.nextInt();
        
        	System.out.print("Zeilenanzahl: ");
        	zeilen = tastatur.nextInt();
        
        	//Aufruf Klasse Geschenkpapier und übergabe der Parameter, Musterart, Zeilenanzahl, Spaltenanzahl
        	Geschenkpapier.muster(muster, zeilen, spalten);
        	
        	//Wiederholung des Programmes gewünscht?
        	System.out.println("Möchten sie das Programm wiederholen? y/n");
        	yn = tastatur.next();
       		}   while (yn.equals("y"));
		
		//Scanner schließen
		tastatur.close();
	}

}
