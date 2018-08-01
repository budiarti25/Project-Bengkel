/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.JenisDAO;
import daos.KendaraanDAO;
import entities.Jenis;
import entities.Kendaraan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class KendaraanController {

    private final KendaraanDAO kdao;
    private final JenisDAO jdao;

    public KendaraanController(Connection connection) {
        this.kdao = new KendaraanDAO(connection);
        this.jdao = new JenisDAO(connection);
    }

    public boolean save(String noPolisi, String warnaKendaraan, String jenisId) {
        Object[] object = (Object[])this.jdao.getById(jenisId);
        Jenis jenis =new Jenis((String)object[0], (String)object[1]);
        return this.kdao.insert((new Kendaraan(noPolisi, warnaKendaraan, jenis)));
    }

    public boolean edit(String noPolisi, String warnaKendaraan, String jenisId) {
        Object[] object = (Object[])this.jdao.getById(jenisId);
        Jenis jenis =new Jenis((String)object[0], (String)object[1]);
        return this.kdao.update((new Kendaraan(noPolisi, warnaKendaraan, jenis)));

    }

    public boolean drop(String noPolisi) {
        return this.kdao.delete(noPolisi);
    }

    public List<Object[]> binding() {
        return this.kdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.kdao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.kdao.search(category, data);
    }

    public Object findById(String noPolisi) {
        return this.kdao.getById(noPolisi);
    }
}
