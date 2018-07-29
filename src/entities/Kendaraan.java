/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import entities.Jenis;

/**
 *
 * @author budiarti
 */
public class Kendaraan {
    private String noPolisi;
    private String warnaKendaraan;
    private Jenis jenisId;

    public Kendaraan() {
    }

    public Kendaraan(String noPolisi, String warnaKendaraan, Jenis jenisId) {
        this.noPolisi = noPolisi;
        this.warnaKendaraan = warnaKendaraan;
        this.jenisId = jenisId;
    }

    /**
     * @return the noPolisi
     */
    public String getNoPolisi() {
        return noPolisi;
    }

    /**
     * @param noPolisi the noPolisi to set
     */
    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    /**
     * @return the warnaKendaraan
     */
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    /**
     * @param warnaKendaraan the warnaKendaraan to set
     */
    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    /**
     * @return the jenisId
     */
    public Jenis getJenisId() {
        return jenisId;
    }

    /**
     * @param jenisId the jenisId to set
     */
    public void setJenisId(Jenis jenisId) {
        this.jenisId = jenisId;
    }
    
    
}
