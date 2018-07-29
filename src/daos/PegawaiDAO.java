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

    public boolean delete(int pegawaiId) {
        return this.fdao.executeDML("DELETE FROM pegawai WHERE pegawai_id=" + pegawaiId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM barang");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM barang ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM barang WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(int pegawaiId){
        return this.fdao.getDataBy("SELECT * FROM pegawai WHERE pegawai_id="+pegawaiId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }
}
