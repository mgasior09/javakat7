package com.klb.dbservice;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Symulacja dostepu do bazy danych
 */
public class DBConnector {

    private final static Logger logger  = Logger.getLogger(DBConnector.class.getName());

    String getContent(String tableName, int RowId,  String columnName) {
        logger.log(Level.INFO, "Reading data from table " + tableName);

        return "this is the test aaa bbb test wwww 123 hh";
    }
}
