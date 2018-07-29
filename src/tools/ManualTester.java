/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author budiarti
 */
public class ManualTester {
    public static void main(String[] args) throws SQLException {
        Connection connection=new MyConnection().getConnection();
        System.out.println(new MyConnection().getConnection());
    }
}
