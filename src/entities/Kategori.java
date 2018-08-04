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
public class Kategori {
    private String kategoriId;
    private String namaKategori;
    private String katerangan;

    public Kategori() {
    }

    public Kategori(String kategoriId, String namaKategori, String katerangan) {
        this.kategoriId = kategoriId;
        this.namaKategori = namaKategori;
        this.katerangan = katerangan;
    }

    /**
     * @return the kategoriId
     */
    public String getKategoriId() {
        return kategoriId;
    }

    /**
     * @param kategoriId the kategoriId to set
     */
    public void setKategoriId(String kategoriId) {
        this.kategoriId = kategoriId;
    }

    /**
     * @return the namaKategori
     */
    public String getNamaKategori() {
        return namaKategori;
    }

    /**
     * @param namaKategori the namaKategori to set
     */
    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    /**
     * @return the katerangan
     */
    public String getKaterangan() {
        return katerangan;
    }

    /**
     * @param katerangan the katerangan to set
     */
    public void setKaterangan(String katerangan) {
        this.katerangan = katerangan;
    }

    
    
    
}
