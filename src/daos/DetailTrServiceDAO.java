/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Transaksi;
import java.sql.Connection;
import java.util.List;
import entities.DetailTransaksiService;

/**
 *
 * @author budiarti
 */
public class DetailTrServiceDAO {
    private FunctionDAO fdao;

    public DetailTrServiceDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(DetailTransaksiService transaksiService) {
        return this.fdao.executeDML("INSERT INTO detail_transaksi_service VALUES('"
                + transaksiService.getDetailServiceId()+ "','" +transaksiService.getServiceId().getServiceId()
                +"','"+transaksiService.getTransaksiId().getTransaksiId()+"')");
    }

    public boolean update(DetailTransaksiService transaksiService) {
        return this.fdao.executeDML("UPDATE Transaksi SET service_id='"
                + transaksiService.getServiceId().getServiceId() 
                + "', transaksi_id='"+transaksiService.getTransaksiId().getTransaksiId()
                +"' WHERE detail_service_id='" +transaksiService.getDetailServiceId()+"'");
    }

    public boolean delete(String transaksiId) {
        return this.fdao.executeDML("DELETE FROM detail_transaksi_service WHERE detail_service_id='" + transaksiId+"'");
    }

    public List<Object[]> getAll() {
        return this.fdao.getDatas("SELECT * FROM detail_transaksi_service");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("SELECT  FROM detail_transaksi_service ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("SELECT * FROM detail_transaksi_service WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String trDetailId){
        return this.fdao.getDataBy("SELECT * FROM detail_transaksi_service WHERE detail_service_id='"+trDetailId+"'");
    }
    
}
