/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.PegawaiController;
import controller.PeranController;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class PegawaiView extends javax.swing.JInternalFrame {
    
    private final ViewProccess viewProccess;
    private final PegawaiController pegawaiController;
    private final String[] header = {"Pegawai Id", "Nama Pegawai","Alamat", "Jenis Kelamin"};
    private final String[] category = {"pegawai_id", "nama_pegawai", "alamat", "jenis_kelamin"};
    private final Connection connection;

    /**
     * Creates new form PegawaiView
     */
    public PegawaiView(Connection connection) {
        this.connection=connection;
        initComponents();
        this.viewProccess=new ViewProccess();
        this.pegawaiController=new PegawaiController(connection);
        this.loadSearchComboBox();
        this.bindingTable();
        this.reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idtxtfieldPegawai = new javax.swing.JTextField();
        nametxtfieldPegawai = new javax.swing.JTextField();
        alamattxtfieldPegawai = new javax.swing.JTextField();
        dropbtnPegawai = new javax.swing.JButton();
        savebtnPegawai = new javax.swing.JButton();
        jkLaki = new javax.swing.JRadioButton();
        jkPrm = new javax.swing.JRadioButton();
        findcomboPegawai = new javax.swing.JComboBox<String>();
        findtxtfieldPegawai = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPegawai = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pegawai");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        jLabel1.setText("Pegawai ID");

        jLabel2.setText("Nama Pegawai");

        jLabel3.setText("Alamat");

        jLabel4.setText("Jenis Kelamin");

        dropbtnPegawai.setText("Drop");
        dropbtnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropbtnPegawaiActionPerformed(evt);
            }
        });

        savebtnPegawai.setText("Save");
        savebtnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnPegawaiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jkLaki);
        jkLaki.setText("Laki-laki");

        buttonGroup1.add(jkPrm);
        jkPrm.setText("Perempuan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idtxtfieldPegawai)
                    .addComponent(nametxtfieldPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(alamattxtfieldPegawai)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dropbtnPegawai)
                            .addComponent(jkLaki))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jkPrm)
                            .addComponent(savebtnPegawai))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtxtfieldPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nametxtfieldPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamattxtfieldPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jkLaki)
                    .addComponent(jkPrm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropbtnPegawai)
                    .addComponent(savebtnPegawai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        findcomboPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findcomboPegawaiActionPerformed(evt);
            }
        });

        findtxtfieldPegawai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findtxtfieldPegawaiKeyPressed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPegawai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(findcomboPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findtxtfieldPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findcomboPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findtxtfieldPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnPegawaiActionPerformed
        this.saveOrEdit(idtxtfieldPegawai.getText(), nametxtfieldPegawai.getText(),alamattxtfieldPegawai.getText(),
                getJenisKelamin(), idtxtfieldPegawai.isEnabled());
    }//GEN-LAST:event_savebtnPegawaiActionPerformed

    private void dropbtnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropbtnPegawaiActionPerformed
        this.drop(idtxtfieldPegawai.getText());
    }//GEN-LAST:event_dropbtnPegawaiActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPegawai), findtxtfieldPegawai.getText());
    }//GEN-LAST:event_btnFindActionPerformed

    private void findcomboPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findcomboPegawaiActionPerformed
        this.search(this.viewProccess.getCategory(this.category, findcomboPegawai), findtxtfieldPegawai.getText());
    }//GEN-LAST:event_findcomboPegawaiActionPerformed

    private void findtxtfieldPegawaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findtxtfieldPegawaiKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            this.search(this.viewProccess.getCategory(this.category, findcomboPegawai), findtxtfieldPegawai.getText());
    }   
    }//GEN-LAST:event_findtxtfieldPegawaiKeyPressed

    private void tblPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPegawaiMouseClicked
        this.mouseClick(tblPegawai.getSelectedRow());
    }//GEN-LAST:event_tblPegawaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamattxtfieldPegawai;
    private javax.swing.JButton btnFind;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dropbtnPegawai;
    private javax.swing.JComboBox<String> findcomboPegawai;
    private javax.swing.JTextField findtxtfieldPegawai;
    private javax.swing.JTextField idtxtfieldPegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jkLaki;
    private javax.swing.JRadioButton jkPrm;
    private javax.swing.JTextField nametxtfieldPegawai;
    private javax.swing.JButton savebtnPegawai;
    private javax.swing.JTable tblPegawai;
    // End of variables declaration//GEN-END:variables


    private void bindingTable() {
        this.viewProccess.viewTable(tblPegawai, header,
                this.pegawaiController.bindingSort(category[0], "asc"));
    }

    public void search(String category, String data) {
        this.viewProccess.viewTable(tblPegawai, header, this.pegawaiController.find(category, data));
    }
    
    private void loadSearchComboBox() {
        this.viewProccess.loadSearchComboBox(findcomboPegawai, header);
    }    
     public void drop(String barangId) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.pegawaiController.drop(barangId));
        }
       this.reset();
    }

   
    public void saveOrEdit(String pegawaiId, String pegawaiNama, String alamat, String jenisKelamin, boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.pegawaiController.save(pegawaiId, pegawaiNama, alamat, jenisKelamin);
        } else {
            flag = this.pegawaiController.edit(pegawaiId, pegawaiNama, alamat, jenisKelamin);
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }

    
    public void mouseClick(int row) {
        idtxtfieldPegawai.setEnabled(false);
        dropbtnPegawai.setEnabled(true);
        idtxtfieldPegawai.setText(tblPegawai.getValueAt(row, 0).toString());
        nametxtfieldPegawai.setText(tblPegawai.getValueAt(row, 1).toString());
        alamattxtfieldPegawai.setText(tblPegawai.getValueAt(row, 2).toString());
    }

    /**
     * funsi reset komponen
     */
    public void reset() {
        idtxtfieldPegawai.setEnabled(true);
        idtxtfieldPegawai.setText("");
        nametxtfieldPegawai.setText("");
        alamattxtfieldPegawai.setText("");
        findtxtfieldPegawai.setText("");
        dropbtnPegawai.setEnabled(false);
        this.bindingTable();
    }
    
    private String getJenisKelamin(){
        String jk="";
        if(jkLaki.isSelected()){
            jk="L";
        }else{
            jk="P";
        }
        return jk;
    }
}

