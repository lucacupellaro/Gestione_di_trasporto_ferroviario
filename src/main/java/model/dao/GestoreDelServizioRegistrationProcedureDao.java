package model.dao;

import exception.DAOException;
import model.domain.GestoriDelServizio;
import model.domain.Lavoratore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class GestoreDelServizioRegistrationProcedureDao implements GenericProcedureDAO<Boolean> {
    public static GestoreDelServizioRegistrationProcedureDao instance = null;
    private GestoreDelServizioRegistrationProcedureDao(){

    }

    public static GestoreDelServizioRegistrationProcedureDao getInstance(){
        if(instance == null){
            instance = new GestoreDelServizioRegistrationProcedureDao();
        }
        return instance;
    }

    @Override
    public Boolean execute(Object... params) throws DAOException {

        GestoriDelServizio gestoriDelServizio = (GestoriDelServizio) params[0];

        try {

            Connection connection = ConnectionFactory.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call registrazioneGestoreDelServizio(?,?)}");
            callableStatement.setString(1,gestoriDelServizio.getUsername());
            callableStatement.setString(2, gestoriDelServizio.getPassword());
            callableStatement.executeQuery();

        } catch (SQLException sqlException) {
            throw new DAOException("Error : " + sqlException.getMessage());
        }

        return true;
    }
}
