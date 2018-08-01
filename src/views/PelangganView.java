/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.KendaraanController;
import controller.PelangganController;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PelangganView extends javax.swing.JInternalFrame {
    
    private final ViewProccess viewProccess;
    private final PelangganController pelangganController;
    private final String[] header = {"Pelanggan Id", "Nama Pelanggan", "Alamat", "No Telepon", "Keluhan", "No Polisi"};
    private final String[] category = {"pelanggan_id", "nama_pelanggan", "alamat", "no_tlp", "keluhan", "no_polisi"};
    private final Connection connection;
    private final List<Object[]> NoPolTemp;

    /**
     * Creates new form PelangganView
     */
    public PelangganView(Connection connection) {
        this.connection=connection;
        initComponents();
        this.viewProccess = new ViewProccess();
        this.pelangganController = new PelangganController(connection);
        this.NoPolTemp = this.getDataPol();
        this.loadSearchComboBox();
        this.loadPol();
        this.reset();
        this.bindingTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dropbtnPelanggan = new javax.swing.JButton();
        savebtnPelanggan = new javax.swing.JButton();
        idtxtfieldPelanggan = new javax.swing.JTextField();
        namatxtfieldPelanggan = new javax.swing.JTextField();
        alamattxtfieldPelanggan = new javax.swing.JTextField();
        telepontxtfieldPelanggan = new javax.swing.JTextField();
        keluhantxtfieldPelanggan = new javax.swing.JTextField();
        nopolisicomboKendaraan = new javax.swing.JComboBox<String>();
        findcomboPelanggan = new javax.swing.JComboBox<String>();
        findtxtfieldPelanggan = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pelanggan");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        jLabel1.setText("Pelanggan ID");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Alamat");

        jLabel4.setText("No Telepon");

        jLabel5.setText("Keluhan");

        jLabel6.setText("No Polisi");

        dropbtnPelanggan.setText("Drop");
        dropbtnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropbtnPelangganActionPerformed(evt);
            }
        });

        savebtnPelanggan.setText("Save");
        savebtnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnPelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alamattxtfieldPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(idtxtfieldPelanggan)
                    .addComponent(namatxtfieldPelanggan))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nopolisicomboKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telepontxtfieldPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(keluhantxtfieldPelanggan))
                        .addGap(8, 8, 8))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dropbtnPelanggan)
                .addGap(28, 28, 28)
                .addComponent(savebtnPelanggan)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telepontxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(keluhantxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nopolisicomboKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idtxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namatxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(alamattxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtnPelanggan)
                    .addComponent(dropbtnPelanggan))
                .addContainerGap())
        );

        findcomboPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findcomboPelangganActionPerformed(evt);
            }
        });

        findtxtfieldPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findtxtfieldPelangganKeyPressed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPelanggan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addComponent(findcomboPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findtxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findcomboPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findtxtfieldPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findcomboPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findcomboPelangganActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPelanggan), findtxtfieldPelanggan.getText());
    }//GEN-LAST:event_findcomboPelangganActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPelanggan), findtxtfieldPelanggan.getText());
    }//GEN-LAST:event_btnFindActionPerformed

    private void dropbtnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropbtnPelangganActionPerformed
        this.drop(idtxtfieldPelanggan.getText());
    }//GEN-LAST:event_dropbtnPelangganActionPerformed

    private void savebtnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnPelangganActionPerformed
//        this.saveOrEdit(idtxtfieldPelanggan.getText(), namatxtfieldPelanggan.getText(), 
//                alamattxtfieldPelanggan.getText(), telepontxtfieldPelanggan.getText(),
//                keluhantxtfieldPelanggan.getText(), Integer.toString(nopolisicomboKendaraan.getSelectedIndex()),
//                idtxtfieldPelanggan.isEnabled());
    }//GEN-LAST:event_savebtnPelangganActionPerformed

    private void findtxtfieldPelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findtxtfieldPelangganKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            this.search(this.viewProccess.getCategory(this.category, findcomboPelanggan), findtxtfieldPelanggan.getText());
    } 
    }//GEN-LAST:event_findtxtfieldPelangganKeyPressed

    private void tblPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPelangganMouseClicked
        this.mouseClick(tblPelanggan.getSelectedRow());
    }//GEN-LAST:event_tblPelangganMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamattxtfieldPelanggan;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton dropbtnPelanggan;
    private javax.swing.JComboBox<String> findcomboPelanggan;
    private javax.swing.JTextField findtxtfieldPelanggan;
    private javax.swing.JTextField idtxtfieldPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keluhantxtfieldPelanggan;
    private javax.swing.JTextField namatxtfieldPelanggan;
    private javax.swing.JComboBox<String> nopolisicomboKendaraan;
    private javax.swing.JButton savebtnPelanggan;
    private javax.swing.JTable tblPelanggan;
    private javax.swing.JTextField telepontxtfieldPelanggan;
    // End of variables declaration//GEN-END:variables


    private void bindingTable() {
        this.viewProccess.viewTable(tblPelanggan, header,
                this.pelangganController.bindingSort(category[0], "asc"));
    }

    public void search(String category, String data) {
        this.viewProccess.viewTable(tblPelanggan, header, this.pelangganController.find(category, data));
    }
    
    private void loadSearchComboBox() {
        this.viewProccess.loadSearchComboBox(findcomboPelanggan, header);
    }

    private List<Object[]> getDataPol() {
        return new KendaraanController(connection).bindingSort("no_polisi", "asc");
    }

    private void loadPol() {
        this.viewProccess.loadDetails(nopolisicomboKendaraan, this.getDataPol(), 1);
    }
    
    private String getPolId(){
        return this.viewProccess.getIdfromComboBox(this.NoPolTemp, nopolisicomboKendaraan.getSelectedIndex());
    }
    
     public void drop(String barangId) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.pelangganController.drop(barangId));
        }
        this.reset();
    }

    
    public void saveOrEdit(String pelangganId, String pelangganNama, String alamat, String tlp, String keluhan, String noPol, String jenisId, boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.pelangganController.save(pelangganId, pelangganNama, 
                    alamat, tlp, keluhan,this.getPolId(),jenisId);
        } else {
            flag = this.pelangganController.edit(pelangganId, pelangganNama, 
                    alamat, tlp, keluhan,this.getPolId(),jenisId);
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }

    
    public void mouseClick(int row) {
        idtxtfieldPelanggan.setEnabled(false);
        dropbtnPelanggan.setEnabled(true);
        idtxtfieldPelanggan.setText(tblPelanggan.getValueAt(row, 0).toString());
        namatxtfieldPelanggan.setText(tblPelanggan.getValueAt(row, 1).toString());
        alamattxtfieldPelanggan.setText(tblPelanggan.getValueAt(row, 2).toString());
        keluhantxtfieldPelanggan.setText(tblPelanggan.getValueAt(row, 3).toString());
        telepontxtfieldPelanggan.setText(tblPelanggan.getValueAt(row, 4).toString());
        nopolisicomboKendaraan.setSelectedItem(tblPelanggan.getValueAt(row, 5).toString());
    }

    /**
     * funsi reset komponen
     */
    public void reset() {
        idtxtfieldPelanggan.setEnabled(true);
        nopolisicomboKendaraan.setSelectedItem("");
        findtxtfieldPelanggan.setText("");
        this.bindingTable();
        dropbtnPelanggan.setEnabled(false);
    }
}
