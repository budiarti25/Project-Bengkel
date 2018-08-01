/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Jenis;
import entities.Peran;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PeranDAO {
    private final FunctionDAO fdao;

    public PeranDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Peran peran) {
        return this.fdao.executeDML("INSERT INTO Peran VALUES('"
                + peran.getPeranId()+ "','" + peran.getPeranName()+ "')");
    }

    public boolean update(Peran peran) {
        return this.fdao.executeDML("UPDATE Peran SET nama_peran='"
                + peran.getPeranName() + "' WHERE peran_id='" +peran.getPeranId()+"'");
    }

    public boolean delete(String peranId) {
        return this.fdao.executeDML("DELETE FROM Peran WHERE peran_id= '" + peranId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM Peran");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM Peran ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM Peran WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String peranId){
        return this.fdao.getDataBy("SELECT * FROM Peran WHERE peran_id="+peranId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(peran_id)+1 AS MAXID FROM Peran");
//    }
}
