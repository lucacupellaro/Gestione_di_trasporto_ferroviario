package controller;

import exception.DAOException;
import model.dao.ConnectionFactory;
import model.domain.Acquirente;
import model.domain.Credentials;
import model.domain.Role;
import view.AcquirenteHomeScreenView;

import java.io.IOException;
import java.sql.SQLException;

import static java.lang.System.exit;


public class AcquirenteController {
    public void start(){

        try{
            ConnectionFactory.changeRole(Role.ACQUIRENTE);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        acquirenteOption();



    }

    private void acquirenteOption(){

        System.out.println("ti sei loggato come acquirente scegli cosa vuoi fare");

        while(true){

            int scelta;

            try {
                scelta = AcquirenteHomeScreenView.showHomeScreen();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            switch (scelta) {
                case 1:
                    this.visualizzaPrenotazioni();
                    break;
                case 2:
                    this.visualizzaTratteDisponibili();
                    break;
                case 3:
                    this.acquistaPrenotazioni();
                    break;
                case 4:
                    this.cancellaPrenotazioni();
                    break;
                case 5:
                    this.exit();
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
