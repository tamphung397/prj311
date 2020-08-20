/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.MyConnection;
import DTO.Product;
import DTO.Supplier;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ProductPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductPanel2
     */
    boolean addNew = true;
    MyConnection connect = null;

    public ProductPanel() {
        initComponents();
        loadProduct();
        txtID.setText("");
        txtPrice.setText("");
        txtPrice.setText("");
//        cbxSuplierName.setSelectedIndex(1);
        txtSearch.setText("");
        txtID.setEnabled(false);
        txtProductName.setEnabled(false);
        txtPrice.setEnabled(false);
        cbxSuplierName.setEnabled(false);
     
//        System.out.println(list2);

       

    }

    boolean checkProductName(String name) {
        Vector<Product> list = DAO.ProductDAO.getSuplierName();
        for (Product product : list) {
            if (product.getSupplier().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    void loadProduct() {
        Vector header = DAO.ProductDAO.getcolumnProduct();
        Vector<Product> list = DAO.ProductDAO.getProduct();
        Vector data = new Vector();
        for (Product pr : list) {
            Vector row = new Vector();
            row.add(pr.getId());
            row.add(pr.getName());
            row.add(pr.getPrice());
            row.add(pr.getIdSupplier());
            data.add(row);

        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setDataVector(data, header);
        
        
         DefaultComboBoxModel model2 = (DefaultComboBoxModel) cbxSuplierName.getModel();
            Vector<Product> list2 = DAO.ProductDAO.getfullSypplierName();
        for (Product product : list2) {
//            if(checkProductName(product.getSupplier())){
            model2.addElement(product.getSupplier());
            
//            }
        }
        cbxSuplierName.setModel(model2);

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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        cbxSuplierName = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("PRODUCT ID");

        jLabel3.setText("PRODUCT NAME");

        jLabel4.setText("PRICE");

        jLabel5.setText("SUPPLIER NAME");

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cbxSuplierName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSuplierNameItemStateChanged(evt);
            }
        });

        jLabel1.setText("SEARCH PRODUCT NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtProductName)
                            .addComponent(txtPrice)
                            .addComponent(cbxSuplierName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxSuplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Vector<Product> findName(String name) {
        Vector<Product> list = DAO.ProductDAO.getProduct();

        Vector<Product> list2 = new Vector<>();
        for (Product pr : list) {
            if (pr.getName().toUpperCase().contains(name.toUpperCase())) {
                list2.add(pr);
            }
        }

        if (list2 != null) {
            return list2;
        }
//        System.out.println(list2);
        return null;
    }


    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        addNew = true;
        txtID.setText("");
        txtPrice.setText("");
        txtSearch.setText("");
        txtProductName.setText("");
//        cbxSuplierName.setSelectedIndex(0);
        txtID.setEnabled(true);
        txtPrice.setEnabled(true);
        txtSearch.setEnabled(true);
        txtProductName.setEnabled(true);
        cbxSuplierName.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        txtID.setEnabled(false);
        txtPrice.setEnabled(false);
        txtProductName.setEnabled(false);
        cbxSuplierName.setEnabled(false);
        int pos = jTable1.getSelectedRow();
        int code = (Integer) jTable1.getValueAt(pos, 0);
        int supplierId = (int) jTable1.getValueAt(pos, 3);

        Vector<Product> list = DAO.ProductDAO.getProduct();

        Vector<Product> list2 = DAO.ProductDAO.getSuplierName();

        Vector<Product> pr = null;

        for (Product product : list) {
            if (product.getId() == code) {
                pr = list;
                break;
            }
        }
        if (pos >= 0) {
            txtID.setText(jTable1.getValueAt(pos, 0).toString());
            txtProductName.setText((String) jTable1.getValueAt(pos, 1));
            txtPrice.setText(jTable1.getValueAt(pos, 2).toString());
            DefaultComboBoxModel dd = (DefaultComboBoxModel) cbxSuplierName.getModel();

            cbxSuplierName.setSelectedItem(list2.get(pos).getSupplier());

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please choose product");
            return;
        }
        Vector<Supplier> list2 = DAO.SupplierDAO.getSupplier();

        try {
            int id = Integer.parseInt(txtID.getText().trim());
            String ProductName = txtProductName.getText();
            int price = Integer.parseInt(txtPrice.getText().trim());
            int supplierID = 0;

            for (Supplier supplier : list2) {
                if (supplier.getName().equals(String.valueOf(cbxSuplierName.getSelectedItem()))) {
                    supplierID = supplier.getId();
                    break;
                }
            }

            if (addNew) {

                if (DAO.ProductDAO.insertProduct(id, ProductName, price, supplierID) != 0) {
                    JOptionPane.showMessageDialog(null, "Add succesfull");
                    txtID.setText("");
                    txtPrice.setText("");
                    txtProductName.setText("");
                    txtSearch.setText("");
                    txtID.setEnabled(false);
                    txtProductName.setEnabled(false);
                    txtPrice.setEnabled(false);
                    cbxSuplierName.setEnabled(false);
                    loadProduct();
                } else {
                    JOptionPane.showMessageDialog(null, "Add fail");
                }
            } else {
//                Vector<Product> list = DAO.ProductDAO.getProduct();
//                int pos = jTable1.getSelectedRow();
//                Product s = list.get(pos);
//                int oldId = s.getId();
//                if (DAO.ProductDAO.updateProduct(id, ProductName, price, supplierID, oldId) != 0) {
//
//                    JOptionPane.showMessageDialog(null, "update thanh cong");
//                    loadProduct();
//                } else {
//                    JOptionPane.showMessageDialog(null, "update that bai");
//                }
                Vector<Product> list = DAO.ProductDAO.getProduct();
                int pos = jTable1.getSelectedRow();
                Product p = list.get(pos);
                int oldId = p.getId();
                System.out.println(oldId);
                if (DAO.ProductDAO.updateProduct(id, ProductName, price, supplierID, oldId) != 0) {
                    JOptionPane.showMessageDialog(null, "update succesfull");
                    txtID.setText("");
                    txtPrice.setText("");
                    txtProductName.setText("");
                    txtSearch.setText("");
                    txtPrice.setEnabled(false);
                    txtProductName.setEnabled(false);
                    txtPrice.setEnabled(false);
                    cbxSuplierName.setEnabled(false);
                    loadProduct();
                } else {
                    JOptionPane.showMessageDialog(null, "update failed");
                }

            }
        } catch (Exception e) {
            if (e.getMessage().contains("Cannot insert duplicate key")) {
                JOptionPane.showMessageDialog(null, "ID dupplicate");
            } else {
                JOptionPane.showMessageDialog(null, "Ma, ten nha cung cap bi sai");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbxSuplierNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSuplierNameItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_cbxSuplierNameItemStateChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please choose product");
            return;
        }
        addNew = false;
        txtID.setEnabled(false);
        txtPrice.setEnabled(true);
        txtProductName.setEnabled(true);
        cbxSuplierName.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please choose product");
            return;
        }

        Vector<Product> list = DAO.ProductDAO.getProduct();
//        System.out.println(list);
        int pos = jTable1.getSelectedRow();
        int code = (int) jTable1.getValueAt(pos, 0);
//        System.out.println(pos);

        String name = (String) jTable1.getValueAt(pos, 1);
        try {
            if (DAO.ProductDAO.deleteProduct(code) != 0) {
                JOptionPane.showMessageDialog(null, "delete successfull");
                txtID.setText("");
                txtProductName.setText("");
                txtPrice.setText("");
                txtID.setEnabled(false);
                txtProductName.setEnabled(false);
                txtPrice.setEnabled(false);
                cbxSuplierName.setEnabled(false);
                loadProduct();

            } else {
                JOptionPane.showMessageDialog(null, "delete fail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:

        if (txtSearch.getText().equals("")) {
//            DAO.SupplierDAO.getSupplier();
            loadProduct();
        }
        Vector<Product> list = findName(txtSearch.getText());
        txtID.setEnabled(false);
        txtProductName.setEnabled(false);
        txtPrice.setEnabled(false);
        cbxSuplierName.setEnabled(false);
        txtID.setText("");
        txtProductName.setText("");
        txtPrice.setText("");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Vector data = new Vector();
        Vector header = new Vector();
        header.add("id");
        header.add("name");
        header.add("price");
        header.add("supplierId");
        if (!list.isEmpty()) {
            for (Product sp : list) {
                Vector row = new Vector();
                row.add(sp.getId());
                row.add(sp.getName());
                row.add(sp.getPrice());
                row.add(sp.getIdSupplier());
                data.add(row);

                model.setDataVector(data, header);

            }
//            }
        } else {
            model.setDataVector(data, header);
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxSuplierName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}