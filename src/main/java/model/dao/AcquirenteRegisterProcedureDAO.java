package model.dao;

import exception.DAOException;
import model.domain.Acquirente;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class AcquirenteRegisterProcedureDAO implements GenericProcedureDAO<Boolean>{
    private static AcquirenteRegisterProcedureDAO registerDAO = null;

    private AcquirenteRegisterProcedureDAO() {
    }

    public static AcquirenteRegisterProcedureDAO getInstance() {
        if (registerDAO == null) {
            registerDAO = new AcquirenteRegisterProcedureDAO();
        }

        return registerDAO;
    }

    public Boolean execute(Object... params) throws DAOException {
        Acquirente user = (Acquirente)params[0];

        try {
            Connection connection = ConnectionFactory.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call registrazione(?,?,?,?,?,?,?,?)}");
            callableStatement.setString(1, user.getCodiceFiscale());
            callableStatement.setString(2, user.getNome());
            callableStatement.setString(3, user.getCognome());
            callableStatement.setDate(4, user.getDataDiNascita());
            callableStatement.setString(5, user.getNumeroCartaDiCredito());
            callableStatement.setString(6, user.getCvv());
            callableStatement.setString(7, user.getUsername());
            callableStatement.setString(8, user.getPassword());
            callableStatement.executeQuery();
        } catch (SQLException var5) {
            throw new DAOException("Error: " + var5.getMessage());
        }

        return true;
    }
}
