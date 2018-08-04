/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.KategoriDAO;
import entities.Kategori;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class KategoriController {
    private KategoriDAO kdao;

    public KategoriController(Connection connection) {
        this.kdao=new KategoriDAO(connection);
    }
    
    public boolean save(String kategoriId, String kategoriName, String keterangan) {
        return this.kdao.insert(new Kategori(kategoriId, kategoriName, keterangan));
    }

    public boolean edit(String kategoriId, String kategoriName, String keterangan) {
        return this.kdao.update(new Kategori(kategoriId, kategoriName, keterangan));
    }

    public boolean drop(String kategoriId) {
        return this.kdao.delete(kategoriId);
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

    public Object findById(String kategoriId) {
        return this.kdao.getById(kategoriId);
    }
}
