/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.KategoriDAO;
import daos.ServiceDAO;
import entities.Service;
import entities.Kategori;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class ServiceController {

    private final ServiceDAO sdao;
    private KategoriDAO kategoriDAO;

    public ServiceController(Connection connection) {
        this.sdao = new ServiceDAO(connection);
        this.kategoriDAO=new KategoriDAO(connection);
    }

    public boolean save(String serviceId, String biayaService, String kategoriId, String keterangan) {
        Object[] object = (Object[])this.kategoriDAO.getById(kategoriId);
        Kategori kategori= new Kategori((String)object[0],(String)object[1]);
        return this.sdao.insert(new Service(serviceId, Integer.parseInt(biayaService), kategori, keterangan));
    }

    public boolean edit(String serviceId, String biayaService, String kategoriId,String keterangan) {
        Object[] object = (Object[])this.kategoriDAO.getById(kategoriId);
        Kategori kategori= new Kategori((String)object[0],(String)object[1]);
        return this.sdao.update(new Service(serviceId, Integer.parseInt(biayaService), kategori, keterangan));
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
    
    public String getIdAuto(){
        return this.sdao.getAutoID();
    }
}
