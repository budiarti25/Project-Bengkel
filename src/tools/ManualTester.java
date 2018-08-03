/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controller.BarangController;
import controller.KendaraanController;
import controller.PelangganController;
import daos.PemasokDAO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author budiarti
 */
public class ManualTester {
    public static void main(String[] args) throws SQLException {
        Connection connection=new MyConnection().getConnection();
        System.out.println(new MyConnection().getConnection());
//        String barangId ="B001";
//        String barangName ="Oli";
//        int Stok=10;
//        int Harga=25000;
//        int pemasok=1;
        String id="P01";
        String nama="Saya";
        String alamat="XXXXX";
        String tlp="0988654313";
        String keluhan="mogok";
        String no_pol="AA 1234 SA";
        String jenis="JD1";
        
        //System.out.println(new PemasokDAO(connection).getAll().size());
       // BarangController barangController=new BarangController(connection);
        PelangganController pelangganController=new PelangganController(connection);
        //System.out.println(barangController.save(barangId, barangName, Integer.toString(Stok), Integer.toString(Harga),  Integer.toString(pemasok)));
       // System.out.println(pelangganController.save(id, nama, alamat,tlp, keluhan, no_pol, jenis));
        
    }
}
