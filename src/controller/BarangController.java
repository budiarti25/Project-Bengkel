/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.BarangDAO;
import daos.PemasokDAO;
import entities.Barang;
import entities.Pemasok;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class BarangController {

    private final BarangDAO barangDAO;
    private final PemasokDAO pdao;

    public BarangController(Connection connection) {
        this.barangDAO = new BarangDAO(connection);
        this.pdao = new PemasokDAO(connection);
    }

    public boolean save(String barangId, String barangName, String barangStok, String barangHarga, String pemasokId) {
        Object[] object = (Object[])this.pdao.getById(Integer.parseInt(pemasokId));
        Pemasok pemasok = new Pemasok(Integer.parseInt(object[0].toString()), (String)object[1]);
          return this.barangDAO.insert(new Barang(barangId, barangName, Integer.parseInt(barangStok), Integer.parseInt(barangHarga), pemasok));
//        Pemasok pemasok = (Pemasok) this.pdao.getById(Integer.parseInt(pemasokId));
//        return this.barangDAO.insert((new Barang(barangId, barangName, Integer.parseInt(barangStok), Integer.parseInt(barangHarga), pemasok)));
    }

    public boolean edit(String barangId, String barangName, String barangStok, String barangHarga, String pemasokId) {
        Object[] object = (Object[])this.pdao.getById(Integer.parseInt(pemasokId));
        Pemasok pemasok = new Pemasok(Integer.parseInt(object[0].toString()), (String)object[1]);
        return this.barangDAO.update((new Barang(barangId, barangName, Integer.parseInt(barangStok), Integer.parseInt(barangHarga), pemasok)));
    }

    public boolean drop(String barangId) {
        return this.barangDAO.delete(barangId);
    }

    public List<Object[]> binding() {
        return this.barangDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.barangDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.barangDAO.search(category, data);
    }

    public Object findById(String barangId) {
        return this.barangDAO.getById(barangId);
    }
    
    public String getIdAuto(){
        return this.barangDAO.getAutoID();
    }
}
