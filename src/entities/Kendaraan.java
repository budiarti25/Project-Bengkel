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
public class Kendaraan {
    private String noPolisi;
    private String warnaKendaraan;
    private Jenis jenisId;
    private int kilometer;
    private int status;

    public Kendaraan() {
    }
/**
 * @param noPolisi
 * @param warnaKendaraan
 * @param jenisId
 * @param kilometer
 * @param status 
 */
    public Kendaraan(String noPolisi, String warnaKendaraan, Jenis jenisId, int kilometer, int status) {
        this.noPolisi = noPolisi;
        this.warnaKendaraan = warnaKendaraan;
        this.jenisId = jenisId;
        this.kilometer = kilometer;
        this.status = status;
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

    /**
     * @return the kilometer
     */
    public int getKilometer() {
        return kilometer;
    }

    /**
     * @param kilometer the kilometer to set
     */
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    
}
