/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Transaksi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class TransaksiDAO {
    private final FunctionDAO fdao;

    public TransaksiDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Transaksi transaksi) {
        return this.fdao.executeDML("INSERT INTO Transaksi VALUES('"
                + transaksi.getTransaksiId()+ "','" +transaksi.getTanggal()+"','"+transaksi.getPegawaiId()
                +"','"+transaksi.getPelangganId()+"','"+transaksi.getBarangId()+"')");
    }

    public boolean update(Transaksi transaksi) {
        return this.fdao.executeDML("UPDATE Transaksi SET tanggal='"
                + transaksi.getTanggal() + "', pegawai_id='"
                + transaksi.getPegawaiId() + "', pelanggan_id='"+transaksi.getPelangganId()+"', barang_id='"+transaksi.getBarangId()
                +"' WHERE transaksi_id='" +transaksi.getTransaksiId()+"'");
    }

    public boolean delete(int transaksiId) {
        return this.fdao.executeDML("DELETE FROM transaksi WHERE transaksi_id=" + transaksiId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM transaksi");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM transaksi ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM transaksi WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(int transaksiId){
        return this.fdao.getDataBy("SELECT * FROM transaksi WHERE transaksi_id="+transaksiId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }
}
