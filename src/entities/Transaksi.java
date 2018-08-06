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
    private String tanggal;
    private Pegawai pegawaiId;
    private Pelanggan pelangganId;

    public Transaksi() {
    }
/**
 * @param transaksiId
 * @param tanggal
 * @param pegawaiId
 * @param pelangganId 
 */
    public Transaksi(String transaksiId, String tanggal, Pegawai pegawaiId, Pelanggan pelangganId) {
        this.transaksiId = transaksiId;
        this.tanggal = tanggal;
        this.pegawaiId = pegawaiId;
        this.pelangganId = pelangganId;
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
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
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
}
