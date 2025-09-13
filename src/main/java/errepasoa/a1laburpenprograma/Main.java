package errepasoa.a1laburpenprograma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{

    static Scanner teklatua = new Scanner(System.in);

    // Sesio egoera
    static boolean logeatuta = false;

    public static void main(String[] args) 
    {

        // Metodoak klaseko instantzia
        Metodoak laguntzailea = new Metodoak();

        boolean exekutatzen = true;

        while (exekutatzen) 
        {
            System.out.println("\n============================");
            if (!logeatuta) 
            {

                // Erregistratu, saioa hasi edo irten aukera ematen du
                System.out.println("      MENUA (Saio gabe)");
                System.out.println("============================");
                System.out.println(" 1. Erregistratu");
                System.out.println(" 2. Saioa hasi");
                System.out.println(" 3. Irten");
                System.out.println("============================");
                System.out.print(" Aukeratu aukera bat: ");

                // Irakurtzen ditugu aukera zenbakiak eta haien arabera egiten dugu ekintza
                int aukera = irakurriZenbaki();
                switch (aukera) 
                {
                    case 1 -> Metodoak.Erregistratu(); // statiko metodoa, erregistroa sortu
                    case 2 -> logeatuta = Metodoak.SaioaHasi(); // saioa hasi
                    case 3 -> exekutatzen = false; // programaren itxi
                    default -> System.out.println(" Aukera ez da zuzena.");
                }
            } else 
            {

                // Menu honetan metodo eta adibide desberdinak probatu ditzakegu
                System.out.println("      MENUA (Saioan)");
                System.out.println("============================");
                System.out.println(" 1. Kontua ikusi");
                System.out.println(" 2. Ikasleen notak ikusi");
                System.out.println(" 3. Ikasleen nota taula ikusi");
                System.out.println(" 4. Salbuespena probatu");
                System.out.println(" 0. Saioa itxi");
                System.out.println("============================");
                System.out.print(" Aukeratu aukera bat: ");

                // Aukera zenbakien irakurketa eta exekuzioa
                int aukera = irakurriZenbaki();
                switch (aukera) 
                {
                    case 1 -> Metodoak.KontuaIkusi();
                    case 2 -> laguntzailea.arrayUnidimentsionala();
                    case 3 -> laguntzailea.arrayBidimentsionala();
                    case 4 -> 
                    {
                        // Salbuespena kanpora bideratzea erakusten du: hemen jasotzen dugu
                        try 
                        {
                            laguntzailea.salbuProbatu();
                        } catch (Exception e) 
                        {
                            System.out.println(" Kanpora bideratutako salbuespena: " + e.getMessage());
                        }
                    }
                    case 0 -> 
                    {
                        // Saioa itxi eta egoera eguneratu
                        Metodoak.SaioaItxi();
                        logeatuta = false;
                    }
                    default -> System.out.println(" Aukera ez da zuzena.");
                }
            }
        }
        System.out.println("\nPrograma bukatu da. Eskerrik asko erabiltzeagatik!");
    }

    private static int irakurriZenbaki() 
    {
        // Laguntzaile metodoa zenbakia modu seguruan irakurtzeko aukera oker gisa
        // identifika dezake
        try 
        {
            return teklatua.nextInt();
        } catch (InputMismatchException e) 
        {
            teklatua.next();
            return -1;
        }
    }
}
