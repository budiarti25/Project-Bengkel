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
                +","+barang.getBarangHarga()+","+barang.getPemasokId()+")");
    }

    public boolean update(Barang barang) {
        return this.fdao.executeDML("UPDATE Barang SET nama_barang='"
                + barang.getBarangName() + "', stok_barang="
                + barang.getBarangStok() + ", harga_barang="+barang.getBarangHarga()+", pemasok_id="+barang.getPemasokId()
                +" WHERE barang_id='" +barang.getBarangId()+"'");
    }

    public boolean delete(int barangId) {
        return this.fdao.executeDML("DELETE FROM barang WHERE service_id=" + barangId+"'");
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
    
    public Object getById(int barangId){
        return this.fdao.getDataBy("SELECT * FROM barang WHERE barang_id="+barangId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }

}
