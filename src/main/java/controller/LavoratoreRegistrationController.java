package controller;

import exception.DAOException;
import model.dao.LavoratoriRegistrationProcedureDAO;
import model.domain.Credentials;
import model.domain.Lavoratore;
import view.LavoratoreRegistrazione;

import java.io.IOException;

public class LavoratoreRegistrationController {
    private Boolean flag;
    private Credentials cred = null;
    private Lavoratore lavoratore;

    public LavoratoreRegistrationController() {
    }


    public void start() {
        try {
            this.cred = LavoratoreRegistrazione.register();
            this.lavoratore = LavoratoreRegistrazione.setLavoratoreInfo(this.cred);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }

        try {
            LavoratoriRegistrationProcedureDAO registerProcedureDAO = LavoratoriRegistrationProcedureDAO.getInstance();
            this.flag = registerProcedureDAO.execute(new Object[]{this.lavoratore});
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

    public Lavoratore getLavoratore() {
        return this.lavoratore;
    }
}
