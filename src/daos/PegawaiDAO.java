/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import entities.Pegawai;
import java.util.List;
/**
 *
 * @author budiarti
 */

public class PegawaiDAO {
    private final FunctionDAO fdao;

    public PegawaiDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Pegawai pegawai) {
        return this.fdao.executeDML("INSERT INTO Pegawai VALUES('"
                + pegawai.getPegawaiId()+ "','" +pegawai.getPegawaiName()+"','"+pegawai.getPegawaiAlamat()
                +"','"+pegawai.getPegawaiJenisKelamin()+"')");
    }

    public boolean update(Pegawai pegawai) {
        return this.fdao.executeDML("UPDATE pegawai SET nama_pegawai='"
                +pegawai.getPegawaiName()+"', alamat='"+pegawai.getPegawaiAlamat()
                +"', jenis_kelamin='"+pegawai.getPegawaiJenisKelamin()+"' WHERE pegawai_id='"+pegawai.getPegawaiId()+ "'");
    }

    public boolean delete(String pegawaiId) {
        return this.fdao.executeDML("DELETE FROM pegawai WHERE pegawai_id='"+ pegawaiId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM pegawai");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM pegawai ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM pegawai WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String pegawaiId){
        return this.fdao.getDataBy("SELECT * FROM pegawai WHERE pegawai_id='"+pegawaiId+"'");
    }
    
    public String getAutoId(){
        return this.fdao.getAutoId("SELECT concat('PG',count(pegawai_id)+1) AS ID FROM pegawai");
    }
}
