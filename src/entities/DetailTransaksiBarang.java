/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author budiarti
 */
public class DetailTransaksiBarang {
    private String detailBarangId;
    private Barang barangId;
    private int jumlahBarang;
    private Transaksi transaksiId;

    public DetailTransaksiBarang() {
    }

    public DetailTransaksiBarang(String detailBarangId, Barang barangId, int jumlahBarang, Transaksi transaksiId) {
        this.detailBarangId = detailBarangId;
        this.barangId = barangId;
        this.jumlahBarang = jumlahBarang;
        this.transaksiId = transaksiId;
    }

    /**
     * @return the detailBarangId
     */
    public String getDetailBarangId() {
        return detailBarangId;
    }

    /**
     * @param detailBarangId the detailBarangId to set
     */
    public void setDetailBarangId(String detailBarangId) {
        this.detailBarangId = detailBarangId;
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

    /**
     * @return the jumlahBarang
     */
    public int getJumlahBarang() {
        return jumlahBarang;
    }

    /**
     * @param jumlahBarang the jumlahBarang to set
     */
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    /**
     * @return the transaksiId
     */
    public Transaksi getTransaksiId() {
        return transaksiId;
    }

    /**
     * @param transaksiId the transaksiId to set
     */
    public void setTransaksiId(Transaksi transaksiId) {
        this.transaksiId = transaksiId;
    }

    
}
