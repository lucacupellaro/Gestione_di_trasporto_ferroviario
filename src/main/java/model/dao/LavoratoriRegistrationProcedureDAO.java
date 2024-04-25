package model.dao;

import exception.DAOException;
import model.domain.Lavoratore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class LavoratoriRegistrationProcedureDAO implements GenericProcedureDAO<Boolean> {
    public static LavoratoriRegistrationProcedureDAO instance = null;
    private LavoratoriRegistrationProcedureDAO(){

    }

    public static LavoratoriRegistrationProcedureDAO getInstance(){
        if(instance == null){
            instance = new LavoratoriRegistrationProcedureDAO();
        }
        return instance;
    }

    @Override
    public Boolean execute(Object... params) throws DAOException {

        Lavoratore lavoratore = (Lavoratore) params[0];

        try {

            Connection connection = ConnectionFactory.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call registrazioneLavoratore(?,?,?,?,?,?)}");
            callableStatement.setString(1, lavoratore.getCodiceFiscale());
            callableStatement.setString(2, lavoratore.getNome());
            callableStatement.setString(3, lavoratore.getCognome());
            callableStatement.setDate(4, lavoratore.getDataDiNascita());
            callableStatement.setString(5,lavoratore.getUsername());
            callableStatement.setString(6, lavoratore.getPassword());


            callableStatement.executeQuery();

        } catch (SQLException sqlException) {
            throw new DAOException("Error : " + sqlException.getMessage());
        }

        return true;
    }
}
