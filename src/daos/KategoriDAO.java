/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import entities.Kategori;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class KategoriDAO {
    private FunctionDAO functionDAO;

    public KategoriDAO(Connection connection) {
        this.functionDAO=new FunctionDAO(connection);
    }
    
    
    public boolean insert(Kategori kategori) {
        return this.functionDAO.executeDML("INSERT INTO Kategori VALUES('"
                + kategori.getKategoriId()+ "','" + kategori.getNamaKategori()+"',"+kategori.getKaterangan()+")");
    }

    public boolean update(Kategori kategori) {
        return this.functionDAO.executeDML("UPDATE Kategori SET nama_kategori='"
                + kategori.getNamaKategori() + "', katerangan='"+ kategori.getKaterangan()
                +"' WHERE ketegori_id='" +kategori.getKategoriId()+"'");
    }

    public boolean delete(String kategoriId) {
        return this.functionDAO.executeDML("DELETE FROM Kategori WHERE kategori_id='" + kategoriId+"'");
    }

    public List<Object[]> getAll() {
        return this.functionDAO.getDatas("SELECT * from kategori");
    }

    public List<Object[]> getAllSort(String category, String sort) {
        return this.functionDAO.getDatas("SELECT * from kategori ORDER BY " + category + " " + sort);
    }

    public List<Object[]> search(String category, String data) {
        return this.functionDAO.getDatas("SELECT * from kategori WHERE REGEXP_LIKE("+category+", '"+data+"','i')");
    }
    
    public Object[] getById(String kategoriId){
        return this.functionDAO.getDataBy("SELECT * from kategori WHERE barang_id="+kategoriId+"'");
    }
}
