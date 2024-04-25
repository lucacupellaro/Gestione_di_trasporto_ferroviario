package model.dao;

import exception.DAOException;
import model.domain.Credentials;
import model.domain.Role;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginProcedureDAO {
    private static LoginProcedureDAO instance = null;

    private LoginProcedureDAO() {
    }

    public static LoginProcedureDAO getInstance() {
        if (instance == null) {
            instance = new LoginProcedureDAO();
        }

        return instance;
    }

    public Credentials execute(Object... params) throws DAOException {
        String username = (String)params[0];
        String password = (String)params[1];

        int role;
        try {
            Connection connection = ConnectionFactory.getConnection();
            CallableStatement cs = connection.prepareCall("{call login(?,?,?)}");
            cs.setString(1, username);
            cs.setString(2, password);
            cs.registerOutParameter(3, 2);
            cs.executeQuery();
            role = cs.getInt(3);
            System.out.println(role);
        } catch (SQLException var7) {
            throw new DAOException("Login error: " + var7.getMessage());
        }

        return new Credentials(username, password, Role.fromInt(role));
    }
}
