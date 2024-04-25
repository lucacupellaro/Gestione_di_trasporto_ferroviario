package model.dao;

import exception.DAOException;

import java.sql.SQLException;

public interface GenericProcedureDAO<P> {
    P execute(Object... var1) throws DAOException, SQLException;
}
