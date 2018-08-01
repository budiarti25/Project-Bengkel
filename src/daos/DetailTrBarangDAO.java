/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Transaksi;
import entities.DetailTransaksiBarang;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class DetailTrBarangDAO {
    private final FunctionDAO fdao;

    public DetailTrBarangDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(DetailTransaksiBarang transaksiBarang) {
        return this.fdao.executeDML("INSERT INTO detail_transaksi_barang VALUES('"
                + transaksiBarang.getDetailBarangId()+ "','" +transaksiBarang.getBarangId().getBarangId()+"',"+transaksiBarang.getJumlahBarang()
                +"','"+transaksiBarang.getTransaksiId().getTransaksiId()+"')");
    }

    public boolean update(DetailTransaksiBarang transaksiBarang) {
        return this.fdao.executeDML("UPDATE detail_transaksi_barang SET barang_id='"
                + transaksiBarang.getBarangId().getBarangId() + "', jumlah_beli="
                + transaksiBarang.getJumlahBarang()+ ", transaksi_id2='"+transaksiBarang.getTransaksiId().getTransaksiId()
                +"' WHERE detail_barang_id='" +transaksiBarang.getDetailBarangId()+"'");
    }

    public boolean delete(String transaksiId) {
        return this.fdao.executeDML("DELETE FROM detail_transaksi_barang WHERE detail_service_id='" + transaksiId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM detail_transaksi_barang");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT  FROM detail_transaksi_barang ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM detail_transaksi_barang WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String transaksiId){
        return this.fdao.getDataBy("SELECT * FROM detail_transaksi_barang WHERE detail_barang_id='"+transaksiId+"'");
    }
    
}
