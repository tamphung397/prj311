/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUII;

import DTO.Book;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhFrame
     */
    ArrayList<Book> list;
    public static String filename = "data.txt";
    int index = -1; // bien nay de luu vi tri cua book user chon
    boolean saveForUpdate = true; // nut save default la save cho update
    DefaultComboBoxModel modl = new DefaultComboBoxModel();

    public MainFrame() {
        initComponents();

        for (Integer i = 0; i < 200; i++) {
            modl.addElement(1990 + i);
        }
        jbxPublisherYear.setModel(modl);
        // ham nay de load ten sach vao control list
        loadData();
        
        setLocationRelativeTo(null);
    }

    void loadData() {
        list = DAO.FileDAO.readFile(filename);
        // tap model moi chp Jlist
        DefaultListModel model = new DefaultListModel();
        for (Book book : list) {
            String bookName = book.getName();
            model.addElement(bookName);

        }
        bookList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList<>();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtAuthor = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        lblPublisher = new javax.swing.JLabel();
        jcheckRent = new javax.swing.JCheckBox();
        jbxPublisherYear = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bookListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(bookList);

        lblCode.setText("Code");

        txtCode.setEnabled(false);

        lblName.setText("Name");

        lblAuthor.setText("Author");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        txtname.setEnabled(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtAuthor.setEnabled(false);

        lblyear.setText("Publisher ");

        txtPublisher.setEnabled(false);

        lblPublisher.setText("Publisher Year");

        jcheckRent.setText("For rent");
        jcheckRent.setEnabled(false);
        jcheckRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckRentActionPerformed(evt);
            }
        });

        jbxPublisherYear.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCode)
                            .addComponent(lblName)
                            .addComponent(lblAuthor))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCode)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtAuthor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addGap(47, 47, 47)
                                .addComponent(btnUpdate)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnRemove)
                                        .addGap(91, 91, 91)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jcheckRent))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblyear)
                                    .addComponent(lblPublisher))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPublisher)
                                        .addGap(87, 87, 87))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbxPublisherYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(227, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCode)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(jLabel4)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAuthor)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblyear)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPublisher)
                            .addComponent(jbxPublisherYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jcheckRent)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnRemove)
                    .addComponent(jButton4))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bookListValueChanged
        // TODO add your handling code here:

        // lay vi tri Book user chon
        index = bookList.getSelectedIndex();
        if (index >= 0) {
            Book x = list.get(index);

            txtCode.setText(x.getCode());
            txtname.setText(x.getName());
            txtAuthor.setText(x.getAuthor());
            txtPublisher.setText(x.getPublisher());
            jbxPublisherYear.setSelectedItem(x.getYear());
            if (x.isForRent() == true) {
                jcheckRent.setSelected(true);
            } else {
                jcheckRent.setSelected(false);
            }

        } else {
//            JOptionPane.showMessageDialog(null, "not exist", "a", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bookListValueChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtname.setEnabled(true);
        txtAuthor.setEnabled(true);
        txtPublisher.setEnabled(true);
        jbxPublisherYear.setEnabled(true);
        jcheckRent.setEnabled(true);

        saveForUpdate = true;
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (saveForUpdate) { // code nay sace cho update
            //lay ten moi
            if (index >= 0) {
                Book b = list.get(index);
                if (!txtname.getText().isEmpty()) {
                    b.setName(txtname.getText());
                    b.setAuthor(txtAuthor.getText());
                    b.setPublisher(txtPublisher.getText());

                    Integer d = ((Integer) jbxPublisherYear.getSelectedItem());
                    b.setYear(d);

                    if (jcheckRent.isSelected()) {
                        b.setForRent(true);
                    } else {
                        b.setForRent(false);
                    }
                    txtCode.setEnabled(false);
                    txtname.setEnabled(false);
                    txtAuthor.setEnabled(false);
                    txtPublisher.setEnabled(false);
                    jbxPublisherYear.setEnabled(false);
                    jcheckRent.setEnabled(false);
                    DAO.FileDAO.writeFile(filename, list);
                    loadData();
                }
            }
        } else { // save cho them moi
            if (!txtCode.getText().isEmpty() && !txtname.getText().isEmpty()) {
                Book b = new Book();
                b.setCode(txtCode.getText());
                b.setName(txtname.getText());
                b.setAuthor(txtAuthor.getText());
                b.setPublisher(txtPublisher.getText());
                Integer d = ((Integer) jbxPublisherYear.getSelectedItem());
                b.setYear(d);
                if (jcheckRent.isSelected()) {
                    b.setForRent(true);
                } else {
                    b.setForRent(false);
                }
                list.add(b);
                txtCode.setEnabled(false);
                txtname.setEnabled(false);
                txtAuthor.setEnabled(false);
                txtPublisher.setEnabled(false);
                jbxPublisherYear.setEnabled(false);
                jcheckRent.setEnabled(false);
                DAO.FileDAO.writeFile(filename, list);
                loadData();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        saveForUpdate = false;
        txtCode.setText("");
        txtname.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        jbxPublisherYear.setSelectedItem(false);
        jcheckRent.setSelected(false);

        txtCode.setEnabled(true);
        txtname.setEnabled(true);
        txtAuthor.setEnabled(true);
        txtPublisher.setEnabled(true);
        jbxPublisherYear.setEnabled(true);
        jcheckRent.setEnabled(true);
        jbxPublisherYear.setSelectedItem(-1);
        jbxPublisherYear.setSelectedIndex(-1);

    }//GEN-LAST:event_btnNewActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcheckRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckRentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckRentActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:

        index = bookList.getSelectedIndex();
        if (this.index != -1) {
            Book x = list.get(index);
            list.remove(x);
            DAO.FileDAO.writeFile(filename, list);
            loadData();
        } else {

        }


    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> bookList;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbxPublisherYear;
    private javax.swing.JCheckBox jcheckRent;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPublisher;
    private javax.swing.JLabel lblyear;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
