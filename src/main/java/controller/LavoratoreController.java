package controller;

import model.dao.ConnectionFactory;
import model.domain.Role;
import view.AcquirenteHomeScreenView;
import view.LavoratoreHomeView;

import java.io.IOException;
import java.sql.SQLException;

public class LavoratoreController {
    public void start(){

        try{
            ConnectionFactory.changeRole(Role.LAVORATORI);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        lavoratoreOption();

    }

    private void lavoratoreOption(){

        System.out.println("ti sei loggato come lavoratore scegli cosa vuoi fare");

        while(true){

            int scelta;

            try {
                scelta = LavoratoreHomeView.showHomeScreen();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            switch(scelta){

                case 1 -> generaReport();
                case 2 -> visualizzaTurni();
                case 3 -> exit();

            }



        }


    }


    public void generaReport(){
        System.out.println("Genera Report:");
    }

    public void visualizzaTurni(){
        System.out.println("Visualizza Turni:");
    }

    public void acquistaPrenotazioni(){
        System.out.println("acquista prenotazioni:");
    }
    public void cancellaPrenotazioni(){
        System.out.println("acquista prenotazioni:");
    }


    private void exit() {
        AcquirenteHomeScreenView.exit();
        System.exit(0);
    }

}
