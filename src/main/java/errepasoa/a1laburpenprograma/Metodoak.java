package errepasoa.a1laburpenprograma;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodoak {

    // metodoak static izan behar dira main-etik deitu ahal izateko
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> Izenak = new ArrayList<>();
    static int adina;
    static String pasahitza;

    // Erregistratzeko metodoa
    public static boolean Erregistratu() {
        String izena;
        int zenbakiKop;
        boolean Logeatuta = false;

        do {
            System.out.println("Sortu izen bat");
            izena = sc.next();

            System.out.println("Zein da zure adina?");
            adina = sc.nextInt();

            char[] letrak = izena.toCharArray();
            char azkena = izena.charAt(izena.length() - 1);

            System.out.println("Zure izenaren lehen letra: " + letrak[0]);
            System.out.println("Zure izenaren azken letra: " + azkena);
            System.out.println("Zure izenaren letra kopurua: " + letrak.length);

            System.out.println("Zure izena letraz letra: ");
            for (char letra : letrak) {
                System.out.println(letra);
            }

            Izenak.add(izena); // izena gorde

            System.out.println("Sortu pasahitza bat (Minimo 6 karaktere eta 3 zenbaki):");
            pasahitza = sc.next();

            // Zenbaki kopurua pasahitzean
            zenbakiKop = 0;
            for (int i = 0; i < pasahitza.length(); i++) {
                char c = pasahitza.charAt(i);
                if (Character.isDigit(c)) {
                    zenbakiKop++;
                }
            }

        } while (pasahitza.length() < 6 || zenbakiKop < 3); // pasahitzaren baldintzak egin

        System.out.println("Pasahitza egokia da.");
        Logeatuta = true;

        if (Logeatuta) {
            System.out.println("Kontua sortu da, saioa hasten.");
            return true; // saioa hasi da
        } else {
            System.out.println("Errorea logeatzerakoan, saioa ez dago hasita.");
            return false; // saioa ez dago hasita
        }
    }

    // saioa hasitakoan zure profila ikusteko metodoa
    public static void ProfilaIkusi() {
        System.out.println("Zure izena: " + String.join(" ", Izenak)); // ArrayList bat string bihurtu
        System.out.println("Zure adina: " + adina);
        System.out.println("Zure pasahitza: " + pasahitza);
    }

    public static void SaioaItxi() {
        Izenak.clear(); // arraylista garbitu
        pasahitza = null;
        adina = 0;
        System.out.println("Saioa itxi da.");
    }
}
