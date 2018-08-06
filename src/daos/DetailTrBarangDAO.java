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
                + transaksiBarang.getJumlahBarang()+ ", transaksi_id='"+transaksiBarang.getTransaksiId().getTransaksiId()
                +"' WHERE detail_barang_id='" +transaksiBarang.getDetailBarangId()+"'");
    }

    public boolean delete(String detailId) {
        return this.fdao.executeDML("DELETE FROM detail_transaksi_barang WHERE detail_barang_id='" + detailId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT dtb.DETAIL_BARANG_ID, b.NAMA_BARANG, pl.NAMA_PELANGGAN, pg.NAMA_PEGAWAI, dtb.JUMLAH_BELI from BENGKEL.DETAIL_TRANSAKSI_BARANG dtb join BENGKEL.BARANG b on dtb.BARANG_ID=b.BARANG_ID join BENGKEL.TRANSAKSI tr on dtb.TRANSAKSI_ID=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT dtb.DETAIL_BARANG_ID, b.NAMA_BARANG, pl.NAMA_PELANGGAN, pg.NAMA_PEGAWAI, dtb.JUMLAH_BELI from BENGKEL.DETAIL_TRANSAKSI_BARANG dtb join BENGKEL.BARANG b on dtb.BARANG_ID=b.BARANG_ID join BENGKEL.TRANSAKSI tr on dtb.TRANSAKSI_ID=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT dtb.DETAIL_BARANG_ID, b.NAMA_BARANG, pl.NAMA_PELANGGAN, pg.NAMA_PEGAWAI, dtb.JUMLAH_BELI from BENGKEL.DETAIL_TRANSAKSI_BARANG dtb join BENGKEL.BARANG b on dtb.BARANG_ID=b.BARANG_ID join BENGKEL.TRANSAKSI tr on dtb.TRANSAKSI_ID=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String detailId){
        return this.fdao.getDataBy("SELECT * FROM detail_transaksi_barang WHERE detail_barang_id='"+detailId+"'");
    }
    
}
