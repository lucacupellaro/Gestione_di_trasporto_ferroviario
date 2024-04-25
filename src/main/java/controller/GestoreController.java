package controller;

import model.dao.ConnectionFactory;
import model.domain.Role;
import view.AcquirenteHomeScreenView;
import view.GestoreServizioHomeView;

import java.io.IOException;
import java.sql.SQLException;

public class GestoreController {
    public void start(){

        try{
            ConnectionFactory.changeRole(Role.GESTORI_DEL_SERVIZIO);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        gestoreOption();

    }

    private void gestoreOption(){

        System.out.println("ti sei loggato come Gestore scegli cosa vuoi fare");

        while(true){

            int scelta;

            try {
                scelta = GestoreServizioHomeView.showHomeScreen();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            switch(scelta){

                case 1 -> vediAste();
                case 2 -> inserisciOggetto();
                case 3 -> vediCategorie();
                case 4 -> inserisciCategoria();
                case 5 -> modificaNomeCategoria();
                case 6 -> modificaMacrocategoria();
                case 7 -> eliminaMacrocategoria();
                case 8 -> eliminaCategoria();
                case 9 -> exit();

            }



        }


    }

    public void visualizzaPrenotazioni(){
        System.out.println("visualizza prenotazioni:");
    }

    public void visualizzaTratteDisponibili(){
        System.out.println("visualizza prenotazioni:");
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
