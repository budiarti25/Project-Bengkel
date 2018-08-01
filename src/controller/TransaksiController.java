/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.PegawaiDAO;
import daos.PelangganDAO;
import daos.TransaksiDAO;
import entities.Pegawai;
import entities.Pelanggan;
import entities.Transaksi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class TransaksiController {
    private TransaksiDAO transaksiDAO;
    private PelangganDAO pelangganDAO;
    private PegawaiDAO pegawaiDAO;

    public TransaksiController() {
    }

    public TransaksiController(Connection connection) {
        this.transaksiDAO =new TransaksiDAO(connection);
        this.pelangganDAO = new PelangganDAO(connection);
        this.pegawaiDAO = new PegawaiDAO(connection);
    }
    
    public boolean save(String trnsaksiId, String tanggal, String pegawaiId, String pelangganId) {
        Object[] object = (Object[]) this.pegawaiDAO.getById(pegawaiId);
        Pegawai pegawai = new Pegawai((String) object[0], (String) object[1],(String) object[2], (String) object[3]);
        Object[] object1 = (Object[]) this.pelangganDAO.getById(pelangganId);
        Pelanggan pelanggan = new Pelanggan((String) object[0], (String) object[1], (String) object[2], (String) object[3], (String) object[4], null);
          return this.transaksiDAO.insert(new Transaksi(trnsaksiId, null, pegawai, pelanggan));
//        Pemasok pemasok = (Pemasok) this.pdao.getById(Integer.parseInt(pemasokId));
//        return this.barangDAO.insert((new Barang(barangId, barangName, Integer.parseInt(barangStok), Integer.parseInt(barangHarga), pemasok)));
    }

    public boolean edit(String trnsaksiId, String tanggal, String pegawaiId, String pelangganId) {
        Object[] object = (Object[]) this.pegawaiDAO.getById(pegawaiId);
        Pegawai pegawai = new Pegawai((String) object[0], (String) object[1],(String) object[2], (String) object[3]);
        Object[] object1 = (Object[]) this.pelangganDAO.getById(pelangganId);
        Pelanggan pelanggan = new Pelanggan((String) object[0], (String) object[1], (String) object[2], (String) object[3], (String) object[4], null);
          return this.transaksiDAO.insert(new Transaksi(trnsaksiId, null, pegawai, pelanggan));
    }

    public boolean drop(String trId) {
        return this.transaksiDAO.delete(trId);
    }

    public List<Object[]> binding() {
        return this.transaksiDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.transaksiDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.transaksiDAO.search(category, data);
    }

    public Object findById(String trId) {
        return this.transaksiDAO.getById(trId);
    }
    
}
