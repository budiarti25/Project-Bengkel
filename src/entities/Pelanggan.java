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
public class Pelanggan {
    private String pelangganId;
    private String pelangganName;
    private String pelangganAlamat;
    private String pelangganTlp;
    private String pelangganKeluhan;
    private Kendaraan noPolisi;

    public Pelanggan() {
    }
/**
 * 
 * @param pelangganId
 * @param pelangganName
 * @param pelangganAlamat
 * @param pelangganTlp
 * @param pelangganKeluhan
 * @param noPolisi 
 */
    public Pelanggan(String pelangganId, String pelangganName, String pelangganAlamat, String pelangganTlp, String pelangganKeluhan, Kendaraan noPolisi) {
        this.pelangganId = pelangganId;
        this.pelangganName = pelangganName;
        this.pelangganAlamat = pelangganAlamat;
        this.pelangganTlp = pelangganTlp;
        this.pelangganKeluhan = pelangganKeluhan;
        this.noPolisi = noPolisi;
    }

    /**
     * @return the pelangganId
     */
    public String getPelangganId() {
        return pelangganId;
    }

    /**
     * @param pelangganId the pelangganId to set
     */
    public void setPelangganId(String pelangganId) {
        this.pelangganId = pelangganId;
    }

    /**
     * @return the pelangganName
     */
    public String getPelangganName() {
        return pelangganName;
    }

    /**
     * @param pelangganName the pelangganName to set
     */
    public void setPelangganName(String pelangganName) {
        this.pelangganName = pelangganName;
    }

    /**
     * @return the pelangganAlamat
     */
    public String getPelangganAlamat() {
        return pelangganAlamat;
    }

    /**
     * @param pelangganAlamat the pelangganAlamat to set
     */
    public void setPelangganAlamat(String pelangganAlamat) {
        this.pelangganAlamat = pelangganAlamat;
    }

    /**
     * @return the pelangganTlp
     */
    public String getPelangganTlp() {
        return pelangganTlp;
    }

    /**
     * @param pelangganTlp the pelangganTlp to set
     */
    public void setPelangganTlp(String pelangganTlp) {
        this.pelangganTlp = pelangganTlp;
    }

    /**
     * @return the pelangganKeluhan
     */
    public String getPelangganKeluhan() {
        return pelangganKeluhan;
    }

    /**
     * @param pelangganKeluhan the pelangganKeluhan to set
     */
    public void setPelangganKeluhan(String pelangganKeluhan) {
        this.pelangganKeluhan = pelangganKeluhan;
    }

    /**
     * @return the noPolisi
     */
    public Kendaraan getNoPolisi() {
        return noPolisi;
    }

    /**
     * @param noPolisi the noPolisi to set
     */
    public void setNoPolisi(Kendaraan noPolisi) {
        this.noPolisi = noPolisi;
    }
    
    
}
