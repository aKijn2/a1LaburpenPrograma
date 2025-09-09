package errepasoa.a1laburpenprograma;

import static errepasoa.a1laburpenprograma.Metodoak.Erregistratu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aukera;
        int aukeraLogeatuta = 0;
        
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

            switch (aukera) {
                case 1:
                    System.out.println("\n--- Erregistroa ---");
                    Metodoak.Erregistratu();
                    break;
                case 0:
                    System.out.println("Agur!");
                    break;

                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
                    break;
            }

            if (Erregistratu(null)) {
                          switch (aukeraLogeatuta) {
                case 1:
                    System.out.println("\n--- Erregistroa ---");
                    Metodoak.Erregistratu();
                    break;
                case 0:
                    System.out.println("Agur!");
                    break;

                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
                    break;
            }  
            }


        } while (aukera != 0);

        sc.close();
    }
}
