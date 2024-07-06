/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_2301081006.p250624;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author hafiz
 */
public class FormWarnet extends javax.swing.JFrame {

    /**
     * Creates new form FormWarnet
     */
    WarnetController controller;
    public FormWarnet() {
        initComponents();
        controller = new WarnetController(this);
        controller.tampil();
        controller.clearForm();
    }

    public JTable getTblWarnet() {
        return tblWarnet;
    }

    public JTextField getTxtJamKeluar() {
        return txtJamKeluar;
    }

    public JTextField getTxtJamMasuk() {
        return txtJamMasuk;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtNamaPelanggan() {
        return txtNamaPelanggan;
    }

    public JTextField getTxtTarif() {
        return txtTarif;
    }

    public JTextField getTxtTglMasuk() {
        return txtTglMasuk;
    }

    public JComboBox<String> getCmbJenisPelanggan() {
        return cmbJenisPelanggan;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNamaPelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarnet = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbJenisPelanggan = new javax.swing.JComboBox<>();
        txtTglMasuk = new javax.swing.JTextField();
        txtJamMasuk = new javax.swing.JTextField();
        txtJamKeluar = new javax.swing.JTextField();
        txtTarif = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 90, 16);

        txtKode.setText("jTextField1");
        getContentPane().add(txtKode);
        txtKode.setBounds(150, 20, 340, 30);

        jLabel2.setText("Nama Pelanggan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 100, 16);

        txtNamaPelanggan.setText("jTextField2");
        txtNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(txtNamaPelanggan);
        txtNamaPelanggan.setBounds(150, 50, 340, 30);

        jLabel3.setText("Jenis Pelanggan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 90, 16);

        jLabel4.setText("Tanggal Masuk");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 100, 16);

        tblWarnet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Pelanggan", "Jenis Pelanggan", "Tgl Masuk", "Jam Masuk", "Jam Keluar", "Tarif", "Total Bayar"
            }
        ));
        tblWarnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWarnetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWarnet);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 300, 780, 290);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 260, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 260, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(230, 260, 72, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(330, 260, 72, 23);

        jLabel5.setText("Jam Masuk");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 80, 16);

        jLabel6.setText("Jam Keluar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 80, 16);

        jLabel7.setText("Tarif");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 200, 40, 16);

        cmbJenisPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbJenisPelanggan);
        cmbJenisPelanggan.setBounds(150, 80, 340, 30);

        txtTglMasuk.setText("jTextField3");
        txtTglMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglMasukActionPerformed(evt);
            }
        });
        getContentPane().add(txtTglMasuk);
        txtTglMasuk.setBounds(150, 110, 340, 30);

        txtJamMasuk.setText("jTextField4");
        getContentPane().add(txtJamMasuk);
        txtJamMasuk.setBounds(150, 140, 340, 30);

        txtJamKeluar.setText("jTextField5");
        getContentPane().add(txtJamKeluar);
        txtJamKeluar.setBounds(150, 170, 340, 30);

        txtTarif.setText("jTextField6");
        getContentPane().add(txtTarif);
        txtTarif.setBounds(150, 200, 340, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblWarnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarnetMouseClicked
        controller.getWarnet();
    }//GEN-LAST:event_tblWarnetMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        controller.saveWarnet();
        controller.tampil();
        controller.clearForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.updateWarnet();
        controller.tampil();
        controller.clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.deleteWarnet();
        controller.tampil();
        controller.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtTglMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglMasukActionPerformed

    private void txtNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPelangganActionPerformed

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
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormWarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbJenisPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWarnet;
    private javax.swing.JTextField txtJamKeluar;
    private javax.swing.JTextField txtJamMasuk;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNamaPelanggan;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JTextField txtTglMasuk;
    // End of variables declaration//GEN-END:variables
}