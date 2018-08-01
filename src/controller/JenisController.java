/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.JenisDAO;
import entities.Jenis;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class JenisController {

    private final JenisDAO jdao;

    public JenisController(Connection connection) {
        this.jdao = new JenisDAO(connection);
    }

    public boolean save(String jenisId, String jenisName) {
        return this.jdao.insert(new Jenis(jenisId, jenisName));
    }

    public boolean edit(String jenisId, String jenisName) {
        return this.jdao.update(new Jenis(jenisId, jenisName));
    }

    public boolean drop(String jenisId) {
        return this.jdao.delete(jenisId);
    }

    public List<Object[]> binding() {
        return this.jdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.jdao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.jdao.search(category, data);
    }

    public Object findById(String jenisId) {
        return this.jdao.getById(jenisId);
    }
}
