/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.ServiceController;
import java.sql.Connection;

/**
 *
 * @author budiarti
 */
public class ServiceView extends javax.swing.JInternalFrame {
    
    private final ViewProccess viewProccess;
    private final ServiceController serviceController;
    private final String[] header = {"Service Id", "Jenis Service", "Biaya"};
    private final String[] category = {"service_id", "jenis_service", "biaya"};
    private final Connection connection;

    /**
     * Creates new form ServiceView
     */
    public ServiceView(Connection connection) {
        this.connection=connection;
        initComponents();
        this.viewProccess = new ViewProccess();
        this.serviceController= new ServiceController(connection);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtxtfieldService = new javax.swing.JTextField();
        biayatxtfieldService = new javax.swing.JTextField();
        dropbtnService = new javax.swing.JButton();
        savebtnService = new javax.swing.JButton();
        JenisService = new javax.swing.JTextField();
        findcomboService = new javax.swing.JComboBox<String>();
        findtxtfieldService = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Service");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        jLabel1.setText("Service ID");

        jLabel2.setText("Jenis Service");

        jLabel3.setText("Biaya Service");

        idtxtfieldService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtfieldServiceActionPerformed(evt);
            }
        });

        dropbtnService.setText("Drop");
        dropbtnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropbtnServiceActionPerformed(evt);
            }
        });

        savebtnService.setText("Save");
        savebtnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(dropbtnService)
                        .addGap(18, 18, 18)
                        .addComponent(savebtnService))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(idtxtfieldService, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(biayatxtfieldService, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(JenisService))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtxtfieldService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JenisService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(biayatxtfieldService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropbtnService)
                    .addComponent(savebtnService))
                .addContainerGap())
        );

        findcomboService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findcomboServiceActionPerformed(evt);
            }
        });

        findtxtfieldService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findtxtfieldServiceKeyPressed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblService);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(findcomboService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findtxtfieldService, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findcomboService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findtxtfieldService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtfieldServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtfieldServiceActionPerformed
        
    }//GEN-LAST:event_idtxtfieldServiceActionPerformed

    private void savebtnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnServiceActionPerformed
        this.saveOrEdit(idtxtfieldService.getText(), JenisService.getText(),
                Integer.parseInt(biayatxtfieldService.getText()), idtxtfieldService.isEnabled());
    }//GEN-LAST:event_savebtnServiceActionPerformed

    private void dropbtnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropbtnServiceActionPerformed
        this.drop(idtxtfieldService.getText());
    }//GEN-LAST:event_dropbtnServiceActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboService), findtxtfieldService.getText());
    }//GEN-LAST:event_btnFindActionPerformed

    private void findcomboServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findcomboServiceActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboService), findtxtfieldService.getText());
    }//GEN-LAST:event_findcomboServiceActionPerformed

    private void findtxtfieldServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findtxtfieldServiceKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            this.search(this.viewProccess.getCategory(this.category, findcomboService), findtxtfieldService.getText());
    }     
    }//GEN-LAST:event_findtxtfieldServiceKeyPressed

    private void tblServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiceMouseClicked
        this.mouseClick(tblService.getSelectedRow());
    }//GEN-LAST:event_tblServiceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JenisService;
    private javax.swing.JTextField biayatxtfieldService;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton dropbtnService;
    private javax.swing.JComboBox<String> findcomboService;
    private javax.swing.JTextField findtxtfieldService;
    private javax.swing.JTextField idtxtfieldService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebtnService;
    private javax.swing.JTable tblService;
    // End of variables declaration//GEN-END:variables


    private void bindingTable() {
        this.viewProccess.viewTable(tblService, header,
                this.serviceController.bindingSort(category[0], "asc"));
    }

    public void search(String category, String data) {
        this.viewProccess.viewTable(tblService, header, this.serviceController.find(category, data));
    }
    
    private void loadSearchComboBox() {
        this.viewProccess.loadSearchComboBox(findcomboService, header);
    }
    
     public void drop(String barangId) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.serviceController.drop(barangId));
        }
        this.reset();
    }

    public void saveOrEdit(String serviceId, String serviceNama, int biaya, boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.serviceController.save(idtxtfieldService.getText(), JenisService.getText(), 
                    biayatxtfieldService.getText());
        } else {
            flag = this.serviceController.edit(idtxtfieldService.getText(), JenisService.getText(), 
                    biayatxtfieldService.getText());
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }

    /**
     * fungsi menampilkan data yg yg telah diinputkan ke tbl country pada jframe
     *
     * @param row
     */
    public void mouseClick(int row) {
        idtxtfieldService.setEnabled(false);
        dropbtnService.setEnabled(true);
        idtxtfieldService.setText(tblService.getValueAt(row, 0).toString());
        JenisService.setText(tblService.getValueAt(row, 1).toString());
        biayatxtfieldService.setText(tblService.getValueAt(row, 2).toString());
    }

    /**
     * funsi reset komponen
     */
    public void reset() {
        idtxtfieldService.setEnabled(true);
        JenisService.setText("");
        findtxtfieldService.setText("");
        this.bindingTable();
        dropbtnService.setEnabled(false);
    }
}
