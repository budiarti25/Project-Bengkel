/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author budiarti
 */
public class FunctionDAO implements InterfaceDAO{
    public Connection connection;

    public FunctionDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean executeDML(String query) {
        try {
            PreparedStatement preparedStatement=this.connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Object[]> getDatas(String query) {
        List<Object[]> data=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery();
            int column = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object[] item= new Object[column];
                for (int i = 0; i < column; i++) {
                    item[i]=rs.getObject(i+1);
                }
                data.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public Object[] getDataBy(String query) {
        Object[] data = null;
        try {
            PreparedStatement preparedStatement=this.connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery();
            
            int column = rs.getMetaData().getColumnCount(); data= new Object[column];
            while(rs.next()){
                for (int i = 0; i < column; i++) {
                    data[i] = rs.getObject(i+1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public String getAutoId(String query) {
        try {
            PreparedStatement preparedStatement= this.connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FunctionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
