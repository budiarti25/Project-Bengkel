/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Barang;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class BarangDAO {
    private final FunctionDAO fdao;

    public BarangDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Barang barang) {
        return this.fdao.executeDML("INSERT INTO Barang VALUES('"
                + barang.getBarangId()+ "','" + barang.getBarangName()+"',"+barang.getBarangStok()
                +","+barang.getBarangHarga()+","+barang.getPemasok().getPemasokId()+")");
    }

    public boolean update(Barang barang) {
        return this.fdao.executeDML("UPDATE Barang SET nama_barang='"
                + barang.getBarangName() + "', stok_barang="
                + barang.getBarangStok() + ", harga_barang="+barang.getBarangHarga()+", pemasok_id="+barang.getPemasok().getPemasokId()
                +" WHERE barang_id='" +barang.getBarangId()+"'");
    }

    public boolean delete(String barangId) {
        return this.fdao.executeDML("DELETE FROM barang WHERE barang_id='" + barangId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT b.barang_id, b.nama_barang, b.stok_barang,b.harga_barang, p.nama_pemasok "
                + "FROM barang b join pemasok p on b.pemasok_id=p.pemasok_id");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT b.barang_id, b.nama_barang, b.stok_barang,b.harga_barang, p.nama_pemasok FROM barang b join pemasok p on b.pemasok_id=p.pemasok_id ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT b.barang_id, b.nama_barang, b.stok_barang,b.harga_barang, p.nama_pemasok "
                + "FROM barang b join pemasok p on b.pemasok_id=p.pemasok_id WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String barangId){
        return this.fdao.getDataBy("SELECT b.barang_id, b.nama_barang, b.stok_barang,b.harga_barang, p.nama_pemasok "
                + "FROM barang b join pemasok p on b.pemasok_id=p.pemasok_id WHERE barang_id="+barangId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }

}
