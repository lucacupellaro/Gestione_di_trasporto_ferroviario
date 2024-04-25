package view;

import java.io.IOException;
import java.util.Scanner;

public class LavoratoreHomeView {
    public static int showHomeScreen() throws IOException {

        int choise;
        System.out.println("");
        System.out.println("Benvenuto nella tua home screen!");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1) generare il repot dei tuoi turni ");
        System.out.println("2) Visualizza i tuoi turni");
        System.out.println("5) Esci");
        System.out.println("");
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Inserisci il codice: ");
            choise = input.nextInt();
            if(choise >= 1 && choise <= 5){
                break;
            }
            System.out.println("Codice non valido");
        }

        return choise;
    }

    public static void exit(){
        System.out.println("");
        System.out.println("A presto!");
    }


}
