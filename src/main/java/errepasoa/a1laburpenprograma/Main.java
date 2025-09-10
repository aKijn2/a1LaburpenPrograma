package errepasoa.a1laburpenprograma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aukera;
        int aukera2;

        do {
            // Menua
            System.out.println("\n---------------------------------");
            System.out.println("Aukeratu zer egin nahi duzu:");
            System.out.println("1. Erregistratu");
            System.out.println("0. Irten");
            System.out.print("Aukera: ");

            while (!sc.hasNextInt()) {
                System.out.print("Zenbaki bat sartu mesedez: ");
                sc.next();
            }
            aukera = sc.nextInt();
            sc.nextLine();

            switch (aukera) 
            {
                case 1:
                    System.out.println("\n--- Erregistroa ---");
                    boolean emaitza = Metodoak.Erregistratu(); // ← devuelve boolean
                    if (emaitza) {
                        System.out.println("Erregistro arrakastatsua!");

                        do {
                            // Menua
                            System.out.println("\n---------------------------------");
                            System.out.println("Aukeratu zer egin nahi duzu:");
                            System.out.println("1. Profila Ikusi");
                            System.out.println("0. Irten");
                            System.out.print("Aukera: ");

                            while (!sc.hasNextInt()) {
                                System.out.print("Zenbaki bat sartu mesedez: ");
                                sc.next();
                            }
                            aukera2 = sc.nextInt();
                            sc.nextLine();

                            switch (aukera2) {
                                case 1:
                                    System.out.println("\n--- Profila Ikusi ---");
                                    Metodoak.ProfilaIkusi();
                                    break;
                                case 0:
                                    Metodoak.SaioaItxi(); // arraylista garb itu errorerik ez egoteko
                                    break;
                                default:
                                    System.out.println("Aukera okerra. Saiatu berriro.");
                                    break;
                            }
                        } while (aukera2 != 0);

                    } else {
                        System.out.println("Erregistroa huts egin du.");
                    }
                case 0:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
                    break;
            }
        } while (aukera != 0);

        sc.close();
    }
}
