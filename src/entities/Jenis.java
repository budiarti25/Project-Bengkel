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
public class Jenis {
    private String jenisId;
    private String jenisName;

    public Jenis() {
    }

    public Jenis(String jenisId, String jenisName) {
        this.jenisId = jenisId;
        this.jenisName = jenisName;
    }

    /**
     * @return the jenisId
     */
    public String getJenisId() {
        return jenisId;
    }

    /**
     * @param jenisId the jenisId to set
     */
    public void setJenisId(String jenisId) {
        this.jenisId = jenisId;
    }

    /**
     * @return the jenisName
     */
    public String getJenisName() {
        return jenisName;
    }

    /**
     * @param jenisName the jenisName to set
     */
    public void setJenisName(String jenisName) {
        this.jenisName = jenisName;
    }
    
}
