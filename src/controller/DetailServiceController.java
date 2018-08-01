/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.DetailTrServiceDAO;
import daos.ServiceDAO;
import daos.TransaksiDAO;
import entities.DetailTransaksiService;
import entities.Service;
import entities.Transaksi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class DetailServiceController {
    private DetailTrServiceDAO trServiceDAO;
    private ServiceDAO serviceDAO;
    private TransaksiDAO transaksiDAO;

    public DetailServiceController() {
    }

    public DetailServiceController(Connection connection) {
        this.trServiceDAO = new DetailTrServiceDAO(connection);
        this.serviceDAO = new ServiceDAO(connection);
        this.transaksiDAO = new TransaksiDAO(connection);
    }
    
    public boolean save(String detailId, String serviceId, String transaksiId) {
        Object[] object = (Object[])this.serviceDAO.getById(serviceId);
        Service service = new Service((String)object[0], (String)object[1],Integer.parseInt(object[2].toString()));
        Object[] object1 = (Object[])this.transaksiDAO.getById(transaksiId);
        Transaksi transaksi = new Transaksi((String)object1[0], null, null, null);
          return this.trServiceDAO.insert(new DetailTransaksiService(detailId, service, transaksi));
//        Pemasok pemasok = (Pemasok) this.pdao.getById(Integer.parseInt(pemasokId));
//        return this.barangDAO.insert((new Barang(barangId, barangName, Integer.parseInt(barangStok), Integer.parseInt(barangHarga), pemasok)));
    }

    public boolean edit(String detailId, String serviceId, String transaksiId) {
        Object[] object = (Object[])this.serviceDAO.getById(serviceId);
        Service service = new Service((String)object[0], (String)object[1],Integer.parseInt(object[2].toString()));
        Object[] object1 = (Object[])this.transaksiDAO.getById(transaksiId);
        Transaksi transaksi = new Transaksi((String)object1[0], null, null, null);
          return this.trServiceDAO.update(new DetailTransaksiService(detailId, service, transaksi));
    }

    public boolean drop(String trserviceId) {
        return this.trServiceDAO.delete(trserviceId);
    }

    public List<Object[]> binding() {
        return this.trServiceDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.trServiceDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.trServiceDAO.search(category, data);
    }

    public Object findById(String trserviceId) {
        return this.trServiceDAO.getById(trserviceId);
    }
}
