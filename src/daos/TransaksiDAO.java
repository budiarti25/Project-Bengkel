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
                + transaksi.getTransaksiId() + "',to_date('" + transaksi.getTanggal() + "','dd-mm-yyyy'),'" + transaksi.getPegawaiId().getPegawaiId()
                + "','" + transaksi.getPelangganId().getPelangganId() + "')");
    }

    public boolean update(Transaksi transaksi) {
        return this.fdao.executeDML("UPDATE Transaksi SET tanggal= to_date('"
                + transaksi.getTanggal() + "','dd-mm-yyyy'), pegawai_id='"
                + transaksi.getPegawaiId().getPegawaiId() + "', pelanggan_id='" + transaksi.getPelangganId().getPelangganId()
                + "' WHERE transaksi_id='" + transaksi.getTransaksiId() + "'");
    }

    public boolean delete(String transaksiId) {
        return this.fdao.executeDML("DELETE FROM transaksi WHERE transaksi_id='" + transaksiId + "'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("select t.TRANSAKSI_ID, to_char(t.TANGGAL,'dd-mm-yyyy'), pg.NAMA_PEGAWAI, pl.NAMA_PELANGGAN, pl.NO_TELP, pl.KELUHAN, k.NO_POLISI, jn.NAMA_JENIS from BENGKEL.TRANSAKSI t join BENGKEL.PEGAWAI pg on pg.pegawai_id=t.pegawai_id join BENGKEL.PELANGGAN pl on t.PELANGGAN_ID=pl.PELANGGAN_ID join BENGKEL.KENDARAAN k on pl.NO_POLISI=k.NO_POLISI join BENGKEL.JENIS jn on k.JENIS_ID=jn.JENIS_ID");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("select t.TRANSAKSI_ID, to_char(t.TANGGAL,'dd-mm-yyyy'), pg.NAMA_PEGAWAI, pl.NAMA_PELANGGAN, pl.NO_TELP, pl.KELUHAN, k.NO_POLISI, jn.NAMA_JENIS from BENGKEL.TRANSAKSI t join BENGKEL.PEGAWAI pg on pg.pegawai_id=t.pegawai_id join BENGKEL.PELANGGAN pl on t.PELANGGAN_ID=pl.PELANGGAN_ID join BENGKEL.KENDARAAN k on pl.NO_POLISI=k.NO_POLISI join BENGKEL.JENIS jn on k.JENIS_ID=jn.JENIS_ID "
                + " ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("select t.TRANSAKSI_ID, to_char(t.TANGGAL,'dd-mm-yyyy'), pg.NAMA_PEGAWAI, pl.NAMA_PELANGGAN, pl.NO_TELP, pl.KELUHAN, k.NO_POLISI, jn.NAMA_JENIS from BENGKEL.TRANSAKSI t join BENGKEL.PEGAWAI pg on pg.pegawai_id=t.pegawai_id join BENGKEL.PELANGGAN pl on t.PELANGGAN_ID=pl.PELANGGAN_ID join BENGKEL.KENDARAAN k on pl.NO_POLISI=k.NO_POLISI join BENGKEL.JENIS jn on k.JENIS_ID=jn.JENIS_ID "
                + " WHERE REGEXP_LIKE(" + category + ", '" + data + "','i')");
    }

    public Object[] getById(String transaksiId) {
        return this.fdao.getDataBy("SELECT * FROM transaksi WHERE transaksi_id='" + transaksiId + "'");
    }

    public String getAutoID(){
        return this.fdao.getAutoId("SELECT concat('TR',count(transaksi_id)+1) AS id FROM Transaksi");
    }
}
