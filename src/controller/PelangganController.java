/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.KendaraanDAO;
import daos.PelangganDAO;
import entities.Kendaraan;
import entities.Pelanggan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PelangganController {

    private final PelangganDAO pelangganDAO;
    private final KendaraanDAO kdao;

    public PelangganController(Connection connection) {
        this.pelangganDAO = new PelangganDAO(connection);
        this.kdao = new KendaraanDAO(connection);
    }

    public boolean save(String pelangganId, String pelangganName, String pelangganAlamat, String pelangganTlp, String pelangganKeluhan, String noPolisi) {
        Kendaraan kendaraan = (Kendaraan) this.kdao.getById(noPolisi);
        return this.pelangganDAO.insert((new Pelanggan(pelangganId, pelangganName, pelangganAlamat, pelangganTlp, pelangganKeluhan, kendaraan)));
    }

    public boolean edit(String pelangganId, String pelangganName, String pelangganAlamat, String pelangganTlp, String pelangganKeluhan, String noPolisi) {
        Kendaraan kendaraan = (Kendaraan) this.kdao.getById(noPolisi);
        return this.pelangganDAO.update((new Pelanggan(pelangganId, pelangganName, pelangganAlamat, pelangganTlp, pelangganKeluhan, kendaraan)));

    }

    public boolean drop(String pelangganId) {
        return this.pelangganDAO.delete(Integer.parseInt(pelangganId));
    }

    public List<Object[]> binding() {
        return this.pelangganDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.pelangganDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.pelangganDAO.search(category, data);
    }

    public Object findById(String pelangganId) {
        return this.pelangganDAO.getById(Integer.parseInt(pelangganId));
    }
}
