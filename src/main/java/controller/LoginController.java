package controller;

import exception.DAOException;
import model.dao.LoginProcedureDAO;
import model.domain.Credentials;
import view.LoginView;

import java.io.IOException;

public class LoginController implements Controller {

    Credentials cred = null;

    @Override
    public void start(){

        try {
            cred = LoginView.authenticate();
        }catch(IOException var3){
            IOException e = var3;
            throw new RuntimeException(e);
        }

        try {
            LoginProcedureDAO login = LoginProcedureDAO.getInstance();
            cred = login.execute(cred.getUsername(), cred.getPassword());
        } catch (DAOException var2){
            DAOException e = var2;
            throw new RuntimeException(e);
        }

    }

    public Credentials getCred(){
        return this.cred;
    }

}
