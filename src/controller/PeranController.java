/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.PeranDAO;
import entities.Peran;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PeranController {

    private final PeranDAO peranDAO;

    public PeranController(Connection connection) {
        this.peranDAO = new PeranDAO(connection);
    }

    public boolean save(String peranId, String peranName) {
        return this.peranDAO.insert(new Peran(peranId, peranName));
    }

    public boolean edit(String peranId, String peranName) {
        return this.peranDAO.update(new Peran(peranId, peranName));
    }

    public boolean drop(String peranId) {
        return this.peranDAO.delete(Integer.parseInt(peranId));
    }

    public List<Object[]> binding() {
        return this.peranDAO.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.peranDAO.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.peranDAO.search(category, data);
    }

    public Object findById(String peranId) {
        return this.peranDAO.getById(Integer.parseInt(peranId));
    }
}
