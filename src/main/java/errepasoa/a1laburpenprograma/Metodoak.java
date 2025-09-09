/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package errepasoa.a1laburpenprograma;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Achraf Allach Chahboun & Hegoi Urrutia Castano
 */
public class Metodoak {

    static Scanner sc = new Scanner(System.in);

    public static boolean Erregistratu(String izena, String pasahitza, Boolean Logeatuta) {

        int zenbakiKop;

        ArrayList<String> Izenak = new ArrayList<>();
        
        do {
            System.out.println("Sortu izen bat");
            izena = sc.next();

            char[] letrak = izena.toCharArray();
            char azkena = izena.charAt(izena.length() - 1);

            System.out.println("Zure izenaren lehen letra: " + letrak[0]);
            System.out.println("Zure izenaren azken letra: " + azkena);
            System.out.println("Zure izenaren letra kopurua: " + letrak.length);

            System.out.println("Zure izena letraz letra: ");
            for (int i = 0; i < letrak.length; i++) {
                System.out.println(letrak[i]);
            }

            System.out.println();

            Izenak.add(izena);

            System.out.println("Sortu pasahitza bat (Minimo 6 karaktere eta 3 zenbaki):");
            pasahitza = sc.next();

            // Zenbat zenbaki dauden pasahitzan zenbatzeko
            zenbakiKop = 0;
            for (int i = 0; i < pasahitza.length(); i++) {
                char c = pasahitza.charAt(i);
                zenbakiKop += (c >= '0' && c <= '9') ? 1 : 0;
            }

        } while (pasahitza.length() < 6 || zenbakiKop < 3);

        System.out.println("Pasahitza egokia da:");

        Logeatuta = true;

        if (Logeatuta == true) {
            System.out.println("Kontu sortu da, saioa hasten.");
            return true;
        }
        else if (Logeatuta == false) {
            System.out.println("Errorea logeatzerakoan, saioa ez dago hasita.");
            return false;
        } else {
            System.out.println("Errore ezezaguna");
        }
        
        return true;
    }
}
