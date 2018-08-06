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
        return this.fdao.getDatas("select dts.detail_service_id, pg.nama_pegawai, pl.nama_pelanggan,tr.tanggal, sr.keterangan,sr.biaya_service from BENGKEL.DETAIL_TRANSAKSI_SERVICE dts join BENGKEL.SERVICE sr on dts.SERVICE_ID=sr.SERVICE_ID join BENGKEL.TRANSAKSI tr on dts.TRANSAKSI_ID2=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID;");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getDatas("select dts.detail_service_id, pg.nama_pegawai, pl.nama_pelanggan,tr.tanggal, sr.keterangan,sr.biaya_service from BENGKEL.DETAIL_TRANSAKSI_SERVICE dts join BENGKEL.SERVICE sr on dts.SERVICE_ID=sr.SERVICE_ID join BENGKEL.TRANSAKSI tr on dts.TRANSAKSI_ID2=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID; ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.fdao.getDatas("select dts.detail_service_id, pg.nama_pegawai, pl.nama_pelanggan,tr.tanggal, sr.keterangan,sr.biaya_service from BENGKEL.DETAIL_TRANSAKSI_SERVICE dts join BENGKEL.SERVICE sr on dts.SERVICE_ID=sr.SERVICE_ID join BENGKEL.TRANSAKSI tr on dts.TRANSAKSI_ID2=tr.TRANSAKSI_ID join BENGKEL.PEGAWAI pg on tr.PEGAWAI_ID=pg.PEGAWAI_ID join BENGKEL.PELANGGAN pl on tr.PELANGGAN_ID=pl.PELANGGAN_ID; WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String trDetailId){
        return this.fdao.getDataBy("SELECT * FROM detail_transaksi_service WHERE detail_service_id='"+trDetailId+"'");
    }
    
}
