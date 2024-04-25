package controller;

import exception.DAOException;
import model.dao.GestoreDelServizioRegistrationProcedureDao;
import model.domain.Credentials;
import model.domain.GestoriDelServizio;

import view.GestoreDelServizioRegistrationView;

import java.io.IOException;

public class GestoreDelServizioRegistrationController {
    private Boolean flag;
    private Credentials cred = null;
    private GestoriDelServizio gestoriDelServizio;

    public GestoreDelServizioRegistrationController() {
    }


    public void start() {
        try {
            this.cred = GestoreDelServizioRegistrationView.register();
            this.gestoriDelServizio = GestoreDelServizioRegistrationView.setGestoreInfo(this.cred);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }

        try {
            GestoreDelServizioRegistrationProcedureDao registerProcedureDAO = GestoreDelServizioRegistrationProcedureDao.getInstance();
            this.flag = registerProcedureDAO.execute(new Object[]{this.gestoriDelServizio});
        } catch (DAOException var2) {
            throw new RuntimeException(var2);
        }

        if (this.flag) {
            System.out.println("Registrazione avvenuta con successo!");
        }

    }

    public Credentials getCred() {
        return this.cred;
    }

    public GestoriDelServizio getLavoratore() {
        return this.gestoriDelServizio;
    }

}
