package view;

import java.util.Scanner;

public class RegistrationView {
    public static int getTypeOfRegistration(){

        int type;
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Come ti vuoi registrare: ");
        System.out.println("1) Acquirente");
        System.out.println("2) Lavoratore");
        System.out.println("3) Gestore del servizio");
        System.out.println("");
        System.out.println("Inserisci il tipo di utente:");
        type = input.nextInt();

        if(type < 1 || type > 3){
            System.out.println("Scelta invalida!");
            System.exit(1);
        }

        return type;
    }
}
