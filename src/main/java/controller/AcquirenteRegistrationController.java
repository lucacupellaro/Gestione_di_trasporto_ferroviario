package controller;

import exception.DAOException;
import model.dao.AcquirenteRegisterProcedureDAO;
import model.domain.Acquirente;
import model.domain.Credentials;
import view.AcquirenteRegistrazione;

import java.io.IOException;

public class AcquirenteRegistrationController {

    private Boolean flag;
    private Credentials cred = null;
    private Acquirente user;

    public AcquirenteRegistrationController() {
    }


    public void start() {
        try {
            this.cred = AcquirenteRegistrazione.register();
            this.user = AcquirenteRegistrazione.setUserInfo(this.cred);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }

        try {
            AcquirenteRegisterProcedureDAO registerProcedureDAO = AcquirenteRegisterProcedureDAO.getInstance();
            this.flag = registerProcedureDAO.execute(new Object[]{this.user});
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

    public Acquirente getUser() {
        return this.user;
    }
}
