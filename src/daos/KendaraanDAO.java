/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Kendaraan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class KendaraanDAO {
    private final FunctionDAO fdao;

    public KendaraanDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Kendaraan kendaraan) {
        return this.fdao.executeDML("INSERT INTO Kendaraan VALUES('"
                + kendaraan.getNoPolisi()+ "','" + kendaraan.getWarnaKendaraan()+"','"+kendaraan.getJenisId().getJenisId()+"')");
    }

    public boolean update(Kendaraan kendaraan) {
        return this.fdao.executeDML("UPDATE Kendaraan SET warna='"
                + kendaraan.getWarnaKendaraan() + "', jenis_id='"
                + kendaraan.getJenisId().getJenisId() +"' WHERE no_polisi='" +kendaraan.getNoPolisi()+"'");
    }

    public boolean delete(String noPolisi) {
        return this.fdao.executeDML("DELETE FROM kendaraan WHERE no_polisi='" + noPolisi+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT k.no_polisi, k.warna, j.nama_jenis FROM kendaraan k join jenis j on k.jenis_id=j.jenis_id");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT k.no_polisi, k.warna, j.nama_jenis FROM kendaraan k join jenis j on k.jenis_id=j.jenis_id ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT k.no_polisi, k.warna, j.nama_jenis FROM kendaraan k join jenis j on k.jenis_id=j.jenis_id WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String noPolisi){
        return this.fdao.getDataBy("SELECT k.no_polisi, k.warna, j.nama_jenis FROM kendaraan k join jenis j on k.jenis_id=j.jenis_id WHERE no_polisi='"+noPolisi+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }
}
