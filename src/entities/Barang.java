/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import entities.Pemasok;

/**
 *
 * @author budiarti
 */
public class Barang {
    private String barangId;
    private String barangName;
    private int barangStok;
    private int barangHarga;
    private Pemasok pemasok;

    public Barang() {
    }
/**
 * @param barangId
 * @param barangName
 * @param barangStok
 * @param barangHarga
 * @param pemasok 
 */
    public Barang(String barangId, String barangName, int barangStok, int barangHarga, Pemasok pemasok) {
        this.barangId = barangId;
        this.barangName = barangName;
        this.barangStok = barangStok;
        this.barangHarga = barangHarga;
        this.pemasok = pemasok;
    }

    /**
     * @return the barangId
     */
    public String getBarangId() {
        return barangId;
    }

    /**
     * @param barangId the barangId to set
     */
    public void setBarangId(String barangId) {
        this.barangId = barangId;
    }

    /**
     * @return the barangName
     */
    public String getBarangName() {
        return barangName;
    }

    /**
     * @param barangName the barangName to set
     */
    public void setBarangName(String barangName) {
        this.barangName = barangName;
    }

    /**
     * @return the barangStok
     */
    public int getBarangStok() {
        return barangStok;
    }

    /**
     * @param barangStok the barangStok to set
     */
    public void setBarangStok(int barangStok) {
        this.barangStok = barangStok;
    }

    /**
     * @return the barangHarga
     */
    public int getBarangHarga() {
        return barangHarga;
    }

    /**
     * @param barangHarga the barangHarga to set
     */
    public void setBarangHarga(int barangHarga) {
        this.barangHarga = barangHarga;
    }

    /**
     * @return the pemasokId
     */
    public Pemasok getPemasok() {
        return pemasok;
    }

    /**
     * @param pemasok the pemasokId to set
     */
    public void setPemasok(Pemasok pemasok) {
        this.pemasok = pemasok;
    }
    
}
