package errepasoa.a1laburpenprograma;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodoak 
{

    static Scanner sc = new Scanner(System.in);

    // Erabiltzaile erregistroa (izenak, adina, pasahitza)
    static ArrayList<String> Izenak = new ArrayList<>();
    static int adina;
    static String pasahitza;

    /**
     * Zenbaki bat irakurtzen du, balio zuzena izan arte
     */
    public static void Erregistratu() 
    {
        System.out.println("\n--- ERREGISTROA ---");
        System.out.print(" Sortu izen bat: ");
        String izena = sc.next();
        System.out.print(" Zein da zure adina? ");
        adina = sc.nextInt();
        Izenak.add(izena);

        String p;
        int zenbakiKop;
        do 
        {
            System.out.print(" Sortu pasahitza (6 karaktere eta 3 zenbaki gutxienez): ");
            p = sc.next();
            zenbakiKop = 0;
            for (char c : p.toCharArray()) 
            {
                if (Character.isDigit(c))
                    zenbakiKop++;
            }
            if (p.length() < 6 || zenbakiKop < 3) 
            {
                System.out.println(" Pasahitzak ez du baldintzak betetzen!");
            }
        } while (p.length() < 6 || zenbakiKop < 3);
        pasahitza = p;
        System.out.println(" Kontua sortu da!");
    }

    /**
     * Saioa hasi, izena eta pasahitza egiaztatuz
     * 
     * @return true balio itzultzen du saioa ongi hasi bada
     */
    public static boolean SaioaHasi() 
    {
        System.out.println("\n--- SAIOA HASI ---");
        if (Izenak.isEmpty()) 
        {
            System.out.println(" Ez dago erabiltzaile erregistraturik.");
            return false;
        }
        System.out.print(" Sartu zure izena: ");
        String izena = sc.next();
        System.out.print(" Sartu pasahitza: ");
        String pass = sc.next();
        if (Izenak.contains(izena) && pass.equals(pasahitza)) 
        {
            System.out.println(" Ongi etorri, " + izena + "!");
            return true;
        } else 
        {
            System.out.println(" Izena edo pasahitza okerra.");
            return false;
        }
    }

    /**
     * Erabiltzailearen kontua ikusi
     */
    public static void KontuaIkusi() 
    {
        System.out.println("\n--- KONTUA ---");
        System.out.println(" Izenak: " + String.join(", ", Izenak));
        System.out.println(" Adina: " + adina);
        System.out.println(" Pasahitza: " + pasahitza);
    }

    /**
     * Saioa itxi
     */
    public static void SaioaItxi() 
    {
        System.out.println("\n Saioa itxi da.");
    }

    /**
     * Array unidimentsionala sortzen du
     */
    public void arrayUnidimentsionala() 
    {
        System.out.println("\n--- IKASLEEN NOTAK (ARRAY UNIDIMENTSIONALA) ---");
        int[] notak = 
        { 7, 8, 5, 9, 6 };
        String[] ikasleak = 
        { "Ane", "Jon", "Mikel", "Irati", "Leire" };
        for (int i = 0; i < notak.length; i++) 
        {
            System.out.println(ikasleak[i] + ": " + notak[i]);
        }
    }

    /**
     * Array bidimentsionala sortzen du
     */
    public void arrayBidimentsionala() 
    {
        System.out.println("\n--- IKASLEEN NOTA TAULA (ARRAY BIDIMENTSIONALA) ---");
        String[] ikasleak = 
        { "Ane", "Jon", "Mikel" };
        int[][] notak = 
        {
                
            { 7, 8, 9 }, // Ane-ren notak
                
                { 6, 5, 7 }, // Jon-en notak
                
                { 8, 9, 10 } // Mikel-en notak
        };
        System.out.println("\tMatematika\tEuskara\tGaztelania");
        for (int i = 0; i < ikasleak.length; i++) 
        {
            System.out.print(ikasleak[i] + "\t");
            for (int j = 0; j < notak[i].length; j++) 
            {
                System.out.print(notak[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    /**
     * Salbuespena probatu
     * 
     * @throws Exception
     */
    public void salbuProbatu() throws Exception 
    {
        System.out.println("\n--- SALBUESPEN PROBA ---");
        System.out.print(" Zenbaki bat sartu (0 sartzen baduzu, errorea gertatuko da): ");
        int zenb = sc.nextInt();
        if (zenb == 0)
            throw new Exception("Zero ez da baliozkoa!");
        System.out.println(" Zenbakia zuzena da: " + zenb);
    }
}
