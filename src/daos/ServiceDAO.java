/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Service;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class ServiceDAO {
    private final FunctionDAO fdao;

    public ServiceDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }

    public boolean insert(Service service) {
        return this.fdao.executeDML("INSERT INTO service VALUES('"
                + service.getServiceId()+ "',"+service.getBiayaService()+",'" + service.getKategoriId().getKategoriId()+"','" + service.getKeterangan()+"')");
    }

    public boolean update(Service service) {
        return this.fdao.executeDML("UPDATE Service SET biaya_service="
                + service.getBiayaService() + ",kategori_id='"
                + service.getKategoriId().getKategoriId() + "',katerangan='"
                + service.getKeterangan() + "' WHERE service_id='" +service.getServiceId()+"'");
    }

    public boolean delete(String serviceId) {
        return this.fdao.executeDML("DELETE FROM service WHERE service_id='" + serviceId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("select s.service_id, kt.nama_kategori, s.keterangan, s.biaya_service from SERVICE s join KATEGORI kt on kt.KATEGORI_ID=s.KATEGORI_ID");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("select s.service_id, kt.nama_kategori, s.keterangan, s.biaya_service from SERVICE s join KATEGORI kt on kt.KATEGORI_ID=s.KATEGORI_ID ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("select s.service_id, kt.nama_kategori, s.keterangan, s.biaya_service from SERVICE s join KATEGORI kt on kt.KATEGORI_ID=s.KATEGORI_ID WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String serviceId){
        return this.fdao.getDataBy("select s.service_id, kt.nama_kategori, s.keterangan, s.biaya_service from SERVICE s join KATEGORI kt on kt.KATEGORI_ID=s.KATEGORI_ID WHERE service_id='"+serviceId+"'");
    }
    
    public String getAutoID(){
        return this.fdao.getAutoId("SELECT concat('SR',count(service_id)+1) AS id FROM Service");
    }
}
