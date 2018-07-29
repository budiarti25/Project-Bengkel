/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import entities.Peran;

/**
 *
 * @author budiarti
 */
public class Pegawai {
    private String pegawaiId;
    private String pegawaiName;
    private String pegawaiAlamat;
    private String pegawaiJenisKelamin;
    private Peran peranId;

    public Pegawai() {
    }

    public Pegawai(String pegawaiId, String pegawaiName, String pegawaiAlamat, String pegawaiJenisKelamin, Peran peranId) {
        this.pegawaiId = pegawaiId;
        this.pegawaiName = pegawaiName;
        this.pegawaiAlamat = pegawaiAlamat;
        this.pegawaiJenisKelamin = pegawaiJenisKelamin;
        this.peranId = peranId;
    }

    /**
     * @return the pegawaiId
     */
    public String getPegawaiId() {
        return pegawaiId;
    }

    /**
     * @param pegawaiId the pegawaiId to set
     */
    public void setPegawaiId(String pegawaiId) {
        this.pegawaiId = pegawaiId;
    }

    /**
     * @return the pegawaiName
     */
    public String getPegawaiName() {
        return pegawaiName;
    }

    /**
     * @param pegawaiName the pegawaiName to set
     */
    public void setPegawaiName(String pegawaiName) {
        this.pegawaiName = pegawaiName;
    }

    /**
     * @return the pegawaiAlamat
     */
    public String getPegawaiAlamat() {
        return pegawaiAlamat;
    }

    /**
     * @param pegawaiAlamat the pegawaiAlamat to set
     */
    public void setPegawaiAlamat(String pegawaiAlamat) {
        this.pegawaiAlamat = pegawaiAlamat;
    }

    /**
     * @return the pegawaiJenisKelamin
     */
    public String getPegawaiJenisKelamin() {
        return pegawaiJenisKelamin;
    }

    /**
     * @param pegawaiJenisKelamin the pegawaiJenisKelamin to set
     */
    public void setPegawaiJenisKelamin(String pegawaiJenisKelamin) {
        this.pegawaiJenisKelamin = pegawaiJenisKelamin;
    }

    /**
     * @return the peranId
     */
    public Peran getPeranId() {
        return peranId;
    }

    /**
     * @param peranId the peranId to set
     */
    public void setPeranId(Peran peranId) {
        this.peranId = peranId;
    }
    
    
}
