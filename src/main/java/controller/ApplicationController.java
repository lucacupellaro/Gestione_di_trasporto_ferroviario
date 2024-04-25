package controller;

import model.domain.Acquirente;
import model.domain.Credentials;
import model.domain.GestoriDelServizio;
import model.domain.Lavoratore;
import view.ApplicationView;
import view.RegistrationView;

public class ApplicationController implements Controller
{

    Credentials cred;
    Acquirente user;
    Lavoratore lavoratore;
    GestoriDelServizio gestore;

    @Override
    public void start() {
        while(true) {
            int choise = ApplicationView.showApplicationView();
            switch (choise) {
                case 1 -> this.registration();
                case 2 -> this.login();
                default -> throw new RuntimeException("Scelta non valida!");
            }
        }
    }

    private void registration(){

        int type;
        type = RegistrationView.getTypeOfRegistration();
        if(type == 1){

            AcquirenteRegistrationController userRegistrationController = new AcquirenteRegistrationController();
            userRegistrationController.start();
            user = userRegistrationController.getUser();
            cred = userRegistrationController.getCred();
            AcquirenteController acquirenteController = new AcquirenteController();
            acquirenteController.start();

        }if(type==2){
            LavoratoreRegistrationController lavoratoreRegistrationController = new LavoratoreRegistrationController();
            lavoratoreRegistrationController.start();
            lavoratore = lavoratoreRegistrationController.getLavoratore();
            cred = lavoratoreRegistrationController.getCred();
            LavoratoreController lavoratoreController = new LavoratoreController();
            lavoratoreController.start();

        }
        if(type==3){
            GestoreDelServizioRegistrationController gestoriDelServizioRegistrationController = new GestoreDelServizioRegistrationController();
            gestoriDelServizioRegistrationController.start();
            gestore = gestoriDelServizioRegistrationController.getLavoratore();
            cred = gestoriDelServizioRegistrationController.getCred();
            GestoreController gestoreController = new GestoreController();
            gestoreController.start();

        }


    }

    private void login(){

        LoginController loginController = new LoginController();
        loginController.start();
        this.cred = loginController.getCred();
        if (this.cred.getRole() == null) {
            throw new RuntimeException("Invalid Credentials");
        } else {
            switch (this.cred.getRole()) {
                case ACQUIRENTE -> (new AcquirenteController()).start();
                case GESTORI_DEL_SERVIZIO -> (new GestoreController()).start();
                case LAVORATORI ->(new LavoratoreController()).start();
                default -> throw new RuntimeException("Invalid Credentials");
            }



        }
    }



}
