/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.PemasokDAO;
import entities.Pemasok;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PemasokController {

    private final PemasokDAO pemasokDAO;

    public PemasokController(Connection connection) {
        this.pemasokDAO = new PemasokDAO(connection);
    }

    public boolean save(String pemasokId, String pemasokName) {
        return this.pemasokDAO.insert(new Pemasok(Integer.parseInt(pemasokId), pemasokName));
    }

    public boolean edit(String pemasokId, String pemasokName) {
        return this.pemasokDAO.update(new Pemasok(Integer.parseInt(pemasokId), pemasokName));
    }

    public boolean drop(String pemasokId) {
        return this.pemasokDAO.delete(Integer.parseInt(pemasokId));
    }

    public List<Object[]> binding() {
        return this.pemasokDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.pemasokDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.pemasokDAO.search(category, data);
    }

    public Object findById(String pemasokId) {
        return this.pemasokDAO.getById(Integer.parseInt(pemasokId));
    }

    public String AutoId() {
        return this.pemasokDAO.getAutoID();

    }

}
