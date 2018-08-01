/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.PegawaiDAO;
import daos.PeranDAO;
import entities.Pegawai;
import entities.Peran;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PegawaiController {

    private final PegawaiDAO pegawaiDAO;
    private final PeranDAO peranDAO;

    public PegawaiController(Connection connection) {
        this.pegawaiDAO = new PegawaiDAO(connection);
        this.peranDAO = new PeranDAO(connection);
    }

    public boolean save(String pegawaiId, String pegawaiName, String pegawaiAlamat, String pegawaiJenisKelamin, String peranId) {
        Object[] object = (Object[])this.peranDAO.getById(Integer.parseInt(peranId));
        Peran peran = new Peran((String)object[0], (String)object[1]);
        return this.pegawaiDAO.insert((new Pegawai(pegawaiId, pegawaiName, pegawaiAlamat, pegawaiJenisKelamin, peran)));
    }

    public boolean edit(String pegawaiId, String pegawaiName, String pegawaiAlamat, String pegawaiJenisKelamin, String peranId) {
        Peran peran = (Peran) this.peranDAO.getById(Integer.parseInt(peranId));
        return this.pegawaiDAO.update((new Pegawai(pegawaiId, pegawaiName, pegawaiAlamat, pegawaiJenisKelamin, peran)));

    }

    public boolean drop(String pegawaiId) {
        return this.pegawaiDAO.delete(Integer.parseInt(pegawaiId));
    }

    public List<Object[]> binding() {
        return this.pegawaiDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.pegawaiDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.pegawaiDAO.search(category, data);
    }

    public Object findById(String pegawaiId) {
        return this.pegawaiDAO.getById(Integer.parseInt(pegawaiId));
    }
}
