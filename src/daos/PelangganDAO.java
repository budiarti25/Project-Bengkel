/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import entities.Pelanggan;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PelangganDAO {
    private final FunctionDAO fdao;

    public PelangganDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Pelanggan pelanggan) {
        return this.fdao.executeDML("INSERT INTO Pelanggan VALUES('"
                + pelanggan.getPelangganId()+ "','" + pelanggan.getPelangganName()
                +"','"+pelanggan.getPelangganAlamat()+"','"+pelanggan.getPelangganTlp()
                +"','"+pelanggan.getPelangganKeluhan()+"','"+pelanggan.getNoPolisi().getNoPolisi()+"')");
    }

    public boolean update(Pelanggan pelanggan) {
        return this.fdao.executeDML("UPDATE pelanggan SET nama_pelannggan='" 
                + pelanggan.getPelangganName()+"', alamat='"+pelanggan.getPelangganAlamat()
                +"',no_tlp='"+pelanggan.getPelangganTlp()+"',keluhan='"+pelanggan.getPelangganKeluhan()
                +"',no_polisi='"+pelanggan.getNoPolisi().getNoPolisi()+"' WHERE pelanggan_id'"+ pelanggan.getPelangganId()+"'");
    }

    public boolean delete(int pelangganId) {
        return this.fdao.executeDML("DELETE FROM Pelanggan WHERE pelanggan_id=" + pelangganId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT pelanggan_id, nama_pelanggan, alamat, no_tlp, keluhan, no_polisi from pelanggan");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT pelanggan_id, nama_pelanggan, alamat, no_tlp, keluhan, no_polisi from pelanggan ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT pelanggan_id, nama_pelanggan, alamat, no_tlp, keluhan, no_polisi from pelanggan WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(int barangId){
        return this.fdao.getDataBy("SELECT pelanggan_id, nama_pelanggan, alamat, no_tlp, keluhan, no_polisi from pelanggan WHERE barang_id="+barangId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }
}
