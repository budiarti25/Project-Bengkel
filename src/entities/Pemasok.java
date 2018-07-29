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
public class Pemasok {
    private int pemasokId;
    private String pemasokName;

    public Pemasok() {
    }

    public Pemasok(int pemasokId, String pemasokName) {
        this.pemasokId = pemasokId;
        this.pemasokName = pemasokName;
    }

    /**
     * @return the pemasokId
     */
    public int getPemasokId() {
        return pemasokId;
    }

    /**
     * @param pemasokId the pemasokId to set
     */
    public void setPemasokId(int pemasokId) {
        this.pemasokId = pemasokId;
    }

    /**
     * @return the pemasokName
     */
    public String getPemasokName() {
        return pemasokName;
    }

    /**
     * @param pemasokName the pemasokName to set
     */
    public void setPemasokName(String pemasokName) {
        this.pemasokName = pemasokName;
    }
    
    
}
