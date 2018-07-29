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
                + service.getServiceId()+ "','" + service.getServiceJenis()+"',"+service.getBiayaService()+")");
    }

    public boolean update(Service service) {
        return this.fdao.executeDML("UPDATE Service SET jenis_service='"
                + service.getServiceJenis() + "',biaya_service="
                + service.getBiayaService() + " WHERE service_id='" +service.getServiceId()+"'");
    }

    public boolean delete(int serviceId) {
        return this.fdao.executeDML("DELETE FROM service WHERE service_id=" + serviceId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM service");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT * FROM service ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM service WHERE " + category + " LIKE '%" + data + "%'");
    }
    
    public Object getById(int jenisId){
        return this.fdao.getDataBy("SELECT * FROM service WHERE jenis_id="+jenisId+"'");
    }
    
//    public String getAutoID(){
//        return this.fdao.getAutoId("SELECT MAX(jenis_id)+1 AS MAXID FROM Jenis");
//    }
}
