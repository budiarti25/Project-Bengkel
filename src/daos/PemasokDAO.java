/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Jenis;
import entities.Pemasok;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PemasokDAO {
    private final FunctionDAO fdao;

    public PemasokDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Pemasok pemasok) {
        return this.fdao.executeDML("INSERT INTO Pemasok VALUES("
                + pemasok.getPemasokId()+ ",'" + pemasok.getPemasokName() + "')");
    }

    public boolean update(Pemasok pemasok) {
        return this.fdao.executeDML("UPDATE Pemasok SET nama_pemasok='"
                + pemasok.getPemasokName() + "' WHERE pemasok_id=" +pemasok.getPemasokId());
    }

    public boolean delete(int pemasokId) {
        return this.fdao.executeDML("DELETE FROM Pemasok WHERE pemasok_id=" + pemasokId);
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM PEMASOK");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM PEMASOK ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM PEMASOK WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(int pemasokId){
        return this.fdao.getDataBy("SELECT * FROM PEMASOK WHERE pemasok_id="+pemasokId);
    }
    
    public String getIdAuto(){
        return this.fdao.getAutoId("SELECT count(pemasok_id)+1 AS id FROM Pemasok");
    }    
}
