package view;

import java.util.Scanner;

public class ApplicationView {
    public ApplicationView() {
    }

    public static int showApplicationView() {
        System.out.println("Gestione Trasporto Ferroviario");
        System.out.println("");
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Cova vuoi fare?");
            System.out.println("1) Registrazione");
            System.out.println("2) Login");
            System.out.println("");
            System.out.println("Inserisci il codice: ");
            int choice = input.nextInt();
            if (choice == 1 || choice == 2) {
                return choice;
            }

            System.out.println("Operazione invalida!");
        }
    }

    public static void printError(Exception e) {
        System.out.println(e.getMessage());
    }
}
