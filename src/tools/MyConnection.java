/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 * 
 * @author kresna bayu
 */
public class MyConnection {
    private Connection connection;
    /**
     * fungsi untuk memanggil koneksi database
     * @return koneksi database system dengan schema bengkel
     */
    public Connection getConnection(){
    try{
        OracleDataSource ods = new OracleDataSource();
        ods.setDriverType("thin");
        ods.setServerName("localhost");
        ods.setPortNumber(1521);
        ods.setServiceName("XE");
        ods.setUser("system");
        ods.setPassword("k1R3aw5G");
        connection = ods.getConnection();
        connection.createStatement().execute("alter session set "+"current_schema=bengkel");
    }
    catch(SQLException e){
        e.fillInStackTrace();
    }
    return connection;
    }
}
