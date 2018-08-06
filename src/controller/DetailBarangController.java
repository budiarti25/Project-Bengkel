/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.BarangDAO;
import daos.DetailTrBarangDAO;
import daos.TransaksiDAO;
import entities.Barang;
import entities.DetailTransaksiBarang;
import entities.Transaksi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class DetailBarangController {

    private DetailTrBarangDAO trBarangDAO;
    private TransaksiDAO transaksiDAO;
    private BarangDAO barangDAO;

    public DetailBarangController() {
    }

    public DetailBarangController(Connection connection) {
        this.trBarangDAO = new DetailTrBarangDAO(connection);
        this.transaksiDAO = new TransaksiDAO(connection);
        this.barangDAO = new BarangDAO(connection);
    }

    public boolean save(String detailId, String barangId, int jumlah, String transaksiId) {
        Object[] object = (Object[]) this.barangDAO.getById(barangId);
        Barang barang = new Barang((String) object[0], (String) object[1],Integer.parseInt(object[2].toString()), Integer.parseInt(object[3].toString()), null);
        Object[] object1 = (Object[]) this.transaksiDAO.getById(transaksiId);
        Transaksi transaksi = new Transaksi((String) object1[0], null, null, null);
        return this.trBarangDAO.insert(new DetailTransaksiBarang(detailId, barang, jumlah, transaksi));
    }

    public boolean edit(String detailId, String barangId, int jumlah, String transaksiId) {
        Object[] object = (Object[]) this.barangDAO.getById(barangId);
        Barang barang = new Barang((String) object[0], (String) object[1],Integer.parseInt(object[2].toString()), Integer.parseInt(object[3].toString()), null);
        Object[] object1 = (Object[]) this.transaksiDAO.getById(transaksiId);
        Transaksi transaksi = new Transaksi((String) object1[0], null, null, null);
        return this.trBarangDAO.update(new DetailTransaksiBarang(detailId, barang,jumlah, transaksi));
    }

    public boolean drop(String trbarangId) {
        return this.trBarangDAO.delete(trbarangId);
    }

    public List<Object[]> binding() {
        return this.trBarangDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.trBarangDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.trBarangDAO.search(category, data);
    }

    public Object findById(String trbarangId) {
        return this.trBarangDAO.getById(trbarangId);
    }

//    public String getIdAuto(){
//        return this.trBarangDAO.getAutoID();
//    }
}
