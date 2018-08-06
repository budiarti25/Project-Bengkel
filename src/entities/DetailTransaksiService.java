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
public class DetailTransaksiService {
    private String detailServiceId;
    private Service serviceId;
    private Transaksi transaksiId;

    public DetailTransaksiService() {
    }
/**
 * @param detailServiceId
 * @param serviceId
 * @param transaksiId 
 */
    public DetailTransaksiService(String detailServiceId, Service serviceId, Transaksi transaksiId) {
        this.detailServiceId = detailServiceId;
        this.serviceId = serviceId;
        this.transaksiId = transaksiId;
    }

    /**
     * @return the detailServiceId
     */
    public String getDetailServiceId() {
        return detailServiceId;
    }

    /**
     * @param detailServiceId the detailServiceId to set
     */
    public void setDetailServiceId(String detailServiceId) {
        this.detailServiceId = detailServiceId;
    }

    /**
     * @return the serviceId
     */
    public Service getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return the transaksiId
     */
    public Transaksi getTransaksiId() {
        return transaksiId;
    }

    /**
     * @param transaksiId the transaksiId to set
     */
    public void setTransaksiId(Transaksi transaksiId) {
        this.transaksiId = transaksiId;
    }
    
    
}
