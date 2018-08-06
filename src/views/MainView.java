/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import tools.MyConnection;

/**
 *
 * @author budiarti
 */
public class MainView extends javax.swing.JFrame {
    
    private final Connection connection;
    private final ViewProccess viewProccess;

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.connection = new MyConnection().getConnection();
        this.viewProccess= new ViewProccess();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskbengkel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnBarang = new javax.swing.JMenuItem();
        mnJenis = new javax.swing.JMenuItem();
        mnKendaraan = new javax.swing.JMenuItem();
        mnPegawai = new javax.swing.JMenuItem();
        mnPelanggan = new javax.swing.JMenuItem();
        mnPemasok = new javax.swing.JMenuItem();
        mnService = new javax.swing.JMenuItem();
        mnKategiri = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnTransaksi = new javax.swing.JMenuItem();
        mnDTBarang = new javax.swing.JMenuItem();
        mnDTS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskbengkelLayout = new javax.swing.GroupLayout(dskbengkel);
        dskbengkel.setLayout(dskbengkelLayout);
        dskbengkelLayout.setHorizontalGroup(
            dskbengkelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        dskbengkelLayout.setVerticalGroup(
            dskbengkelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jMenu1.setText("Master");

        mnBarang.setText("Barang");
        mnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBarangActionPerformed(evt);
            }
        });
        jMenu1.add(mnBarang);

        mnJenis.setText("Jenis");
        mnJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnJenisActionPerformed(evt);
            }
        });
        jMenu1.add(mnJenis);

        mnKendaraan.setText("Kendaraan");
        mnKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKendaraanActionPerformed(evt);
            }
        });
        jMenu1.add(mnKendaraan);

        mnPegawai.setText("Pegawai");
        mnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPegawaiActionPerformed(evt);
            }
        });
        jMenu1.add(mnPegawai);

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(mnPelanggan);

        mnPemasok.setText("Pemasok");
        mnPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPemasokActionPerformed(evt);
            }
        });
        jMenu1.add(mnPemasok);

        mnService.setText("Service");
        mnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnServiceActionPerformed(evt);
            }
        });
        jMenu1.add(mnService);

        mnKategiri.setText("Kategori");
        mnKategiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKategiriActionPerformed(evt);
            }
        });
        jMenu1.add(mnKategiri);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        mnTransaksi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnTransaksi.setText("Transaksi");
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(mnTransaksi);

        mnDTBarang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnDTBarang.setText("Detail Transaksi Barang");
        mnDTBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDTBarangActionPerformed(evt);
            }
        });
        jMenu2.add(mnDTBarang);

        mnDTS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnDTS.setText("Detail Transaksi Service");
        mnDTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDTSActionPerformed(evt);
            }
        });
        jMenu2.add(mnDTS);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskbengkel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskbengkel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBarangActionPerformed
       this.viewProccess.callForm(dskbengkel, new BarangView(connection));
    }//GEN-LAST:event_mnBarangActionPerformed

    private void mnJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnJenisActionPerformed
        this.viewProccess.callForm(dskbengkel, new JenisView(connection));
    }//GEN-LAST:event_mnJenisActionPerformed

    private void mnKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKendaraanActionPerformed
        this.viewProccess.callForm(dskbengkel, new KendaraanView(connection));
    }//GEN-LAST:event_mnKendaraanActionPerformed

    private void mnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPegawaiActionPerformed
        this.viewProccess.callForm(dskbengkel, new PegawaiView(connection));
    }//GEN-LAST:event_mnPegawaiActionPerformed

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed
        this.viewProccess.callForm(dskbengkel, new PelangganView(connection));
    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPemasokActionPerformed
        this.viewProccess.callForm(dskbengkel, new PemasokView(connection));
    }//GEN-LAST:event_mnPemasokActionPerformed

    private void mnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnServiceActionPerformed
        this.viewProccess.callForm(dskbengkel, new ServiceView(connection));
    }//GEN-LAST:event_mnServiceActionPerformed

    private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiActionPerformed
        this.viewProccess.callForm(dskbengkel, new TransaksiView(connection));
    }//GEN-LAST:event_mnTransaksiActionPerformed

    private void mnDTBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDTBarangActionPerformed
        this.viewProccess.callForm(dskbengkel, new DetailTransaksiBarangView(connection));
    }//GEN-LAST:event_mnDTBarangActionPerformed

    private void mnDTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDTSActionPerformed
        this.viewProccess.callForm(dskbengkel, new DetailTransaksiServiceView(connection));
    }//GEN-LAST:event_mnDTSActionPerformed

    private void mnKategiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKategiriActionPerformed
        this.viewProccess.callForm(dskbengkel, new KategoriView(connection));
    }//GEN-LAST:event_mnKategiriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskbengkel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnBarang;
    private javax.swing.JMenuItem mnDTBarang;
    private javax.swing.JMenuItem mnDTS;
    private javax.swing.JMenuItem mnJenis;
    private javax.swing.JMenuItem mnKategiri;
    private javax.swing.JMenuItem mnKendaraan;
    private javax.swing.JMenuItem mnPegawai;
    private javax.swing.JMenuItem mnPelanggan;
    private javax.swing.JMenuItem mnPemasok;
    private javax.swing.JMenuItem mnService;
    private javax.swing.JMenuItem mnTransaksi;
    // End of variables declaration//GEN-END:variables
}
