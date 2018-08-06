/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.PegawaiDAO;
import entities.Pegawai;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PegawaiController {

    private final PegawaiDAO pegawaiDAO;

    public PegawaiController(Connection connection) {
        this.pegawaiDAO = new PegawaiDAO(connection);
    }

    public boolean save(String pegawaiId, String pegawaiName, String pegawaiAlamat, String pegawaiJenisKelamin) {
        return this.pegawaiDAO.insert((new Pegawai(pegawaiId, pegawaiName, pegawaiAlamat, pegawaiJenisKelamin)));
    }

    public boolean edit(String pegawaiId, String pegawaiName, String pegawaiAlamat, String pegawaiJenisKelamin) {
        return this.pegawaiDAO.update((new Pegawai(pegawaiId, pegawaiName, pegawaiAlamat, pegawaiJenisKelamin)));

    }

    public boolean drop(String pegawaiId) {
        return this.pegawaiDAO.delete(pegawaiId);
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
        return this.pegawaiDAO.getById(pegawaiId);
    }
    
     public String getIdAuto(){
        return this.pegawaiDAO.getAutoId();
    }
}
