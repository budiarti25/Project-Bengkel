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
public class Service {
    private String serviceId;
    private int biayaService;
    private Kategori kategoriId;

    public Service() {
    }

    public Service(String serviceId, int biayaService, Kategori kategoriId) {
        this.serviceId = serviceId;
        this.biayaService = biayaService;
        this.kategoriId = kategoriId;
    }

    /**
     * @return the serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return the biayaService
     */
    public int getBiayaService() {
        return biayaService;
    }

    /**
     * @param biayaService the biayaService to set
     */
    public void setBiayaService(int biayaService) {
        this.biayaService = biayaService;
    }

    /**
     * @return the kategoriId
     */
    public Kategori getKategoriId() {
        return kategoriId;
    }

    /**
     * @param kategoriId the kategoriId to set
     */
    public void setKategoriId(Kategori kategoriId) {
        this.kategoriId = kategoriId;
    }

}
