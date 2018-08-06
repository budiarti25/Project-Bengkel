/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.PemasokController;
import entities.Pemasok;
import java.sql.Connection;

/**
 *
 * @author budiarti
 */
public class PemasokView extends javax.swing.JInternalFrame {
    
    private final ViewProccess viewProccess;
    private final PemasokController pemasokController;
    private final String[] header = {"Pemasok Id", "Nama Pemasok"};
    private final String[] category = {"pemasok_id", "nama_pemasok"};
    private final Connection connection;

    /**
     * Creates new form PemasokView
     */
    public PemasokView(Connection connection) {
        this.connection=connection;
        initComponents();
        this.viewProccess = new ViewProccess();
        this.pemasokController = new PemasokController(connection);
        this.loadSearchComboBox();
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

        findcomboPemasok = new javax.swing.JComboBox<String>();
        findtxtfieldPemasok = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtxtfieldPemasok = new javax.swing.JTextField();
        namatxtfieldPemasok = new javax.swing.JTextField();
        dropbtnPemasok = new javax.swing.JButton();
        savebtnPemasok = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPemasok = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pemasok");

        findcomboPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findcomboPemasokActionPerformed(evt);
            }
        });

        findtxtfieldPemasok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findtxtfieldPemasokKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        jLabel1.setText("Pemasok ID");

        jLabel2.setText("Nama Pemasok");

        dropbtnPemasok.setText("Drop");
        dropbtnPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropbtnPemasokActionPerformed(evt);
            }
        });

        savebtnPemasok.setText("Save");
        savebtnPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnPemasokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(idtxtfieldPemasok))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dropbtnPemasok))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savebtnPemasok)
                            .addComponent(namatxtfieldPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtxtfieldPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(namatxtfieldPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropbtnPemasok)
                    .addComponent(savebtnPemasok))
                .addContainerGap())
        );

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblPemasok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPemasok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPemasokMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPemasok);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(findcomboPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findtxtfieldPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFind))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findcomboPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findtxtfieldPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnPemasokActionPerformed
        this.saveOrEdit(idtxtfieldPemasok.getText(), namatxtfieldPemasok.getText(), idtxtfieldPemasok.isEnabled());
    }//GEN-LAST:event_savebtnPemasokActionPerformed

    private void dropbtnPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropbtnPemasokActionPerformed
        this.drop(idtxtfieldPemasok.getText());
    }//GEN-LAST:event_dropbtnPemasokActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPemasok), findtxtfieldPemasok.getText());
    }//GEN-LAST:event_btnFindActionPerformed

    private void findcomboPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findcomboPemasokActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPemasok), findtxtfieldPemasok.getText());
    }//GEN-LAST:event_findcomboPemasokActionPerformed

    private void findtxtfieldPemasokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findtxtfieldPemasokKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            this.search(this.viewProccess.getCategory(this.category, findcomboPemasok), findtxtfieldPemasok.getText());
    } 
    }//GEN-LAST:event_findtxtfieldPemasokKeyPressed

    private void tblPemasokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPemasokMouseClicked
        this.mouseClick(tblPemasok.getSelectedRow());
    }//GEN-LAST:event_tblPemasokMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton dropbtnPemasok;
    private javax.swing.JComboBox<String> findcomboPemasok;
    private javax.swing.JTextField findtxtfieldPemasok;
    private javax.swing.JTextField idtxtfieldPemasok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namatxtfieldPemasok;
    private javax.swing.JButton savebtnPemasok;
    private javax.swing.JTable tblPemasok;
    // End of variables declaration//GEN-END:variables

    
    private void bindingTable() {
        this.viewProccess.viewTable(tblPemasok, header,
                this.pemasokController.bindingSort(category[0], "asc"));
    }

    public void search(String category, String data) {
        this.viewProccess.viewTable(tblPemasok, header, this.pemasokController.find(category, data));
    }
    
    private void loadSearchComboBox() {
        this.viewProccess.loadSearchComboBox(findcomboPemasok, header);
    }

    
     public void drop(String barangId) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.pemasokController.drop(barangId));
        }
        this.reset();
    }

    public void saveOrEdit(String pelangganId, String pelangganNama, boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.pemasokController.save(idtxtfieldPemasok.getText(), namatxtfieldPemasok.getText());
        } else {
            flag = this.pemasokController.edit(idtxtfieldPemasok.getText(), namatxtfieldPemasok.getText());
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }

    public void mouseClick(int row) {
        idtxtfieldPemasok.setEnabled(false);
        dropbtnPemasok.setEnabled(true);
        idtxtfieldPemasok.setText(tblPemasok.getValueAt(row, 0).toString());
        namatxtfieldPemasok.setText(tblPemasok.getValueAt(row, 1).toString());
    }

    /**
     * funsi reset komponen
     */
    public void reset() {
        idtxtfieldPemasok.setEnabled(true);
        idtxtfieldPemasok.setEditable(false);
        idtxtfieldPemasok.setText(this.pemasokController.AutoId());
        namatxtfieldPemasok.setText("");
        findtxtfieldPemasok.setText("");
        this.bindingTable();
        dropbtnPemasok.setEnabled(false);
    }
}
