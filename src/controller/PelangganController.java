/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.JenisDAO;
import daos.KendaraanDAO;
import daos.PelangganDAO;
import entities.Jenis;
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
    private final JenisDAO jdao;
    private JenisController jc;

    public PelangganController(Connection connection) {
        this.pelangganDAO = new PelangganDAO(connection);
        this.kdao = new KendaraanDAO(connection);
        this.jdao = new JenisDAO(connection);
    }
    
    public boolean save(String pelangganId, String pelangganName, String pelangganAlamat, String pelangganTlp, String pelangganKeluhan, String noPolisi) {
//        Object[] object = (Object[])this.jdao.getById(jenisId);//konvert dari objectt ke atribut yg dibutuhkan
//        Jenis jenis =new Jenis((String)object[0], (String)object[1]);
        Object[] object1 = (Object[])this.kdao.getById(noPolisi);//konvert dari objectt ke atribut yg dibutuhkan
        Kendaraan kendaraan =new Kendaraan((String)object1[0], (String)object1[1], null, Integer.parseInt((String)object1[3].toString()), Integer.parseInt((String)object1[4].toString()));
        return this.pelangganDAO.insert((new Pelanggan(pelangganId, pelangganName, pelangganAlamat, pelangganTlp, pelangganKeluhan, kendaraan)));
    }

    public boolean edit(String pelangganId, String pelangganName, String pelangganAlamat, String pelangganTlp, String pelangganKeluhan, String noPolisi) {
//        Object[] object = (Object[])this.jdao.getById(jenisId);
//        Jenis jenis =new Jenis((String)object[0], (String)object[1]);
        Object[] object1 = (Object[])this.kdao.getById(noPolisi);
        Kendaraan kendaraan =new Kendaraan((String)object1[0], (String)object1[1] , null, Integer.parseInt((String)object1[3].toString()),Integer.parseInt((String)object1[4].toString()));
        return this.pelangganDAO.update((new Pelanggan(pelangganId, pelangganName, pelangganAlamat, pelangganTlp, pelangganKeluhan, kendaraan)));

    }

    public boolean drop(String pelangganId) {
        return this.pelangganDAO.delete(pelangganId);
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
        return this.pelangganDAO.getById(pelangganId);
    }
    
    public String getIdAuto(){
        return this.pelangganDAO.getAutoID();
    }
}
