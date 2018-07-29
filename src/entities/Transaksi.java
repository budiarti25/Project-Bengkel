/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author budiarti
 */
public class Transaksi {
    private String transaksiId;
    private Date tanggal;
    private Pegawai pegawaiId;
    private Pelanggan pelangganId;
    private Barang barangId;

    public Transaksi() {
    }

    public Transaksi(String transaksiId, Date tanggal, Pegawai pegawaiId, Pelanggan pelangganId, Barang barangId) {
        this.transaksiId = transaksiId;
        this.tanggal = tanggal;
        this.pegawaiId = pegawaiId;
        this.pelangganId = pelangganId;
        this.barangId = barangId;
    }

    /**
     * @return the transaksiId
     */
    public String getTransaksiId() {
        return transaksiId;
    }

    /**
     * @param transaksiId the transaksiId to set
     */
    public void setTransaksiId(String transaksiId) {
        this.transaksiId = transaksiId;
    }

    /**
     * @return the tanggal
     */
    public Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the pegawaiId
     */
    public Pegawai getPegawaiId() {
        return pegawaiId;
    }

    /**
     * @param pegawaiId the pegawaiId to set
     */
    public void setPegawaiId(Pegawai pegawaiId) {
        this.pegawaiId = pegawaiId;
    }

    /**
     * @return the pelangganId
     */
    public Pelanggan getPelangganId() {
        return pelangganId;
    }

    /**
     * @param pelangganId the pelangganId to set
     */
    public void setPelangganId(Pelanggan pelangganId) {
        this.pelangganId = pelangganId;
    }

    /**
     * @return the barangId
     */
    public Barang getBarangId() {
        return barangId;
    }

    /**
     * @param barangId the barangId to set
     */
    public void setBarangId(Barang barangId) {
        this.barangId = barangId;
    }
    
    
}
