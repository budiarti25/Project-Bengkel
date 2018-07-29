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
public class TransaksiDetailBarang {
    private String serviceId;
    private Transaksi transaksiId;

    public TransaksiDetailBarang() {
    }

    public TransaksiDetailBarang(String serviceId, Transaksi transaksiId) {
        this.serviceId = serviceId;
        this.transaksiId = transaksiId;
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
