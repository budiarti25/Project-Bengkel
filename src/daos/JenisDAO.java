/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Jenis;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class JenisDAO {
    private final FunctionDAO fdao;

    public JenisDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Jenis jenis) {
        return this.fdao.executeDML("INSERT INTO jenis VALUES('"
                + jenis.getJenisId()+ "','" + jenis.getJenisName() + "')");
    }

    public boolean update(Jenis jenis) {
        return this.fdao.executeDML("UPDATE jenis SET nama_jenis='"
                + jenis.getJenisName() + "' WHERE jenis_id='" +jenis.getJenisId()+"'");
    }

    public boolean delete(String jenisId) {
        return this.fdao.executeDML("DELETE FROM jenis WHERE jenis_id='" + jenisId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM jenis");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM jenis ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM jenis WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String jenisId){
        return this.fdao.getDataBy("SELECT * FROM jenis WHERE jenis_id= '"+jenisId+"'");
    }
    
    public String getAutoID(){
        return this.fdao.getAutoId("SELECT concat('JN',count(jenis_id)+1) AS id FROM Jenis");
    }
}
