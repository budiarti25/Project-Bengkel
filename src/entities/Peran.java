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
public class Peran {
    private String peranId;
    private String peranName;

    public Peran() {
    }

    public Peran(String peranId, String peranName) {
        this.peranId = peranId;
        this.peranName = peranName;
    }

    /**
     * @return the peranId
     */
    public String getPeranId() {
        return peranId;
    }

    /**
     * @param peranId the peranId to set
     */
    public void setPeranId(String peranId) {
        this.peranId = peranId;
    }

    /**
     * @return the peranName
     */
    public String getPeranName() {
        return peranName;
    }

    /**
     * @param peranName the peranName to set
     */
    public void setPeranName(String peranName) {
        this.peranName = peranName;
    }
    
    
}
