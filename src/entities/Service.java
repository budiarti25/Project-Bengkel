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
    private String serviceJenis;
    private int biayaService;

    public Service() {
    }

    public Service(String serviceId, String serviceJenis, int biayaService) {
        this.serviceId = serviceId;
        this.serviceJenis = serviceJenis;
        this.biayaService = biayaService;
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
     * @return the serviceJenis
     */
    public String getServiceJenis() {
        return serviceJenis;
    }

    /**
     * @param serviceJenis the serviceJenis to set
     */
    public void setServiceJenis(String serviceJenis) {
        this.serviceJenis = serviceJenis;
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
    
    
}
