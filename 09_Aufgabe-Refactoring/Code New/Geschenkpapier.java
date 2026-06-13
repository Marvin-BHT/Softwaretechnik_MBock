package Geschenkpapier;

/**
 * Dateiname: Geschenkpapier.java
 * Beschreibung: Eine Klasse zur Erstellung eines Musters in der Ausgabe mit Vorgaben vom Benutzer
 *
 * @author Marvin B.
 * @version 1.1, 06/2026
 */

public class Geschenkpapier {

    public static void muster(String art, int zeilen, int spalten) {

        switch (art) {
            case "M1" -> druckeMuster1(zeilen, spalten);
            case "M2" -> druckeMuster2(zeilen, spalten);
        }
    }

    public static void druckeMuster1(int zeilen, int spalten) {
        // Zeilen schleife
        for (int z = 1; z <= zeilen; z++) {
            // Spalten schleife
            for (int i = 1; i <= spalten; i++) {
                System.out.print("** ");
            }
            System.out.println();
        }
    }

    public static void druckeMuster2(int zeilen, int spalten) {
        int z = 1;
        int s = 1;
        int s2 = 1;
        // Zeilen schleife
        while (zeilen >= z) {
            // If Unterscheidung gerade Zeile oder ungerade Zeile
            if (z % 2 == 0) {
                // Spalten schleife
                while (spalten >= s) {
                    System.out.print(" )-:");
                    s++;
                }
            } else {
                while (spalten >= s2) {
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