/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.ServiceDAO;
import entities.Service;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class ServiceController {

    private final ServiceDAO sdao;

    public ServiceController(Connection connection) {
        this.sdao = new ServiceDAO(connection);
    }

    public boolean save(String serviceId, String serviceJenis, String biayaService) {
        return this.sdao.insert(new Service(serviceId, serviceJenis, Integer.parseInt(biayaService)));
    }

    public boolean edit(String serviceId, String serviceJenis, String biayaService) {
        return this.sdao.update(new Service(serviceId, serviceJenis, Integer.parseInt(biayaService)));
    }

    public boolean drop(String serviceId) {
        return this.sdao.delete(serviceId);
    }

    public List<Object[]> binding() {
        return this.sdao.getAll();
    }

    public List<Object[]> bindingSort(String category, String sort) {
        return this.sdao.getAllSort(category, sort);
    }

    public List<Object[]> find(String category, String data) {
        return this.sdao.search(category, data);
    }

    public Object findById(String serviceId) {
        return this.sdao.getById(serviceId);
    }
}
