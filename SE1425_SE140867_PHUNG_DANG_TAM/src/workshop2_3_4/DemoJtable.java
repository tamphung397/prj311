/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2_3_4;

import DTO.Employee;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class DemoJtable extends javax.swing.JFrame {

//    MyThread t;
    /**
     * Creates new form DemoJtable
     */
//    String filename = "employee.txt";
//    Vector<String> header = new Vector<>();
//    Vector data = new Vector();
//    boolean addNew = false;
    boolean saveForUpdate = true;
//    boolean changed = false;

    ArrayList<Employee> list;

    public static String fileName = "employee.txt";
//    int pos = -1;

    public DemoJtable() {

        initComponents();
        setLocationRelativeTo(null);

        loadData();


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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblAdress = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblNotify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmp.getTableHeader().setReorderingAllowed(false);
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);
        if (tblEmp.getColumnModel().getColumnCount() > 0) {
            tblEmp.getColumnModel().getColumn(0).setResizable(false);
            tblEmp.getColumnModel().getColumn(1).setResizable(false);
            tblEmp.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYY LIST");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));

        lblCode.setText("CODE");

        lblName.setText("NAME");

        lblSalary.setText("SALARY");

        txtCode.setEnabled(false);
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodeKeyReleased(evt);
            }
        });

        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtSalary.setEnabled(false);
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalaryKeyReleased(evt);
            }
        });

        btnAdd.setText("NEW");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE TO FILE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAdress.setText("ADDRESS");

        txtAdress.setEnabled(false);
        txtAdress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdressKeyReleased(evt);
            }
        });

        lblSex.setText("SEX");

        buttonGroup1.add(jrbMale);
        jrbMale.setText("MALE");
        jrbMale.setEnabled(false);

        buttonGroup1.add(jrbFemale);
        jrbFemale.setText("FEMALE");
        jrbFemale.setEnabled(false);

        txtSearch.setToolTipText("Search Name");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setText("SEARCH BY NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSalary)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addComponent(lblCode)
                                .addComponent(lblAdress)))
                        .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbMale)
                                .addGap(43, 43, 43)
                                .addComponent(jrbFemale))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAdress)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdress)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(jrbMale)
                    .addComponent(jrbFemale))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(lblNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove)
                    .addComponent(btnExit))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnRemove.setEnabled(false);
        saveForUpdate = false;
        txtCode.setText("");
        txtName.setText("");
        txtAdress.setText("");
        txtSalary.setText("");
        jrbMale.setSelected(true);
//        jrbFemale.setSelected(false);
        txtCode.setEnabled(true);
        txtAdress.setEnabled(true);
        txtName.setEnabled(true);
        txtSalary.setEnabled(true);
        jrbMale.setEnabled(true);
        jrbFemale.setEnabled(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
//        System.out.println(list.size() == 0);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(null, "No have emplyee to remove", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtCode.getText().toUpperCase().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose emplyee to remove", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

//        int pos = tblEmp.getSelectedRow();
//        Employee emp = list.get(pos);
        int pos = tblEmp.getSelectedRow();
        System.out.println(pos);
        String code = (String) tblEmp.getValueAt(pos, 0);
        //TODO: tim code trong list de lay ra pos that
        Employee emp = null;
        for (Employee employee : list) {
            if (employee.getID().equalsIgnoreCase(code)) {
                emp = employee;
                break;
            }
        }

        if (pos >= 0) {
            if (JOptionPane.showConfirmDialog(null, "Delete the " + emp.getID() + " employee ?") == JOptionPane.OK_OPTION) {

                list.remove(emp);
//                System.out.println(list);
                DAO.FileDAO.writeFile(fileName, list);
                loadData();
                txtCode.setText("");
                txtName.setText("");
                txtSalary.setText("");
                txtAdress.setText("");
                jrbMale.setSelected(true);
                btnSave.setEnabled(false);
                txtCode.setEnabled(false);
                txtAdress.setEnabled(false);
                txtName.setEnabled(false);
                txtSalary.setEnabled(false);
                jrbMale.setEnabled(false);
                jrbFemale.setEnabled(false);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Not have employee to remove", "", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
//        if (changed == true) {
//            if (JOptionPane.showConfirmDialog(this, "Data changed.Save Y/N?") == JOptionPane.OK_OPTION) {
//                btnSaveToFileActionPerformed(null);
//            }
//        }
        if (JOptionPane.showConfirmDialog(null, "Do you want to exit ?") == JOptionPane.OK_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // TODO add your handling code here:
        btnSave.setEnabled(false);
        btnRemove.setEnabled(true);
        btnUpdate.setEnabled(true);
        txtCode.setEnabled(false);
        txtAdress.setEnabled(false);
        txtName.setEnabled(false);
        txtSalary.setEnabled(false);
        jrbMale.setEnabled(false);
        jrbFemale.setEnabled(false);
//        int pos = tblEmp.getSelectedRow();
//
//        Employee emp = list.get(pos);
//        System.out.println(pos);
        int pos = tblEmp.getSelectedRow();
        System.out.println(pos);
        String code = (String) tblEmp.getValueAt(pos, 0);
        //TODO: tim code trong list de lay ra pos that
        Employee emp = null;
        for (Employee employee : list) {
            if (employee.getID().equalsIgnoreCase(code)) {
                emp = employee;
                break;
            }
        }
//        System.out.println(emp);
        if (pos >= 0) {

            txtCode.setText((String) tblEmp.getValueAt(pos, 0));
            txtName.setText((String) tblEmp.getValueAt(pos, 1));
            txtAdress.setText(emp.getAddress());
            if (emp.getSex().equalsIgnoreCase("Male")) {
                jrbMale.setSelected(true);
            } else {
                jrbFemale.setSelected(true);
            }
            txtSalary.setText(((Integer) tblEmp.getValueAt(pos, 2)).toString());

        }

    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(null, "No have emplyee to update", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtCode.getText().toUpperCase().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose emplyee to update", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        if (change == false) {
//            JOptionPane.showMessageDialog(null, "Please choose button SAVE TO FILE", "", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        btnUpdate.setEnabled(false);
        btnRemove.setEnabled(false);
        btnSave.setEnabled(true);
        txtAdress.setEnabled(true);
        txtName.setEnabled(true);
        txtSalary.setEnabled(true);
        jrbMale.setEnabled(true);
        jrbFemale.setEnabled(true);
        saveForUpdate = true;

    }//GEN-LAST:event_btnUpdateActionPerformed
    boolean validation() {
        String code = txtCode.getText().toUpperCase();
        String name = txtName.getText();
        String adress = txtAdress.getText();
//        Integer salary = Integer.parseInt(txtSalary.getText().toString());

        if (code.isEmpty() || name.isEmpty() || adress.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please  fill infpormation", null, JOptionPane.WARNING_MESSAGE);
            return false;

        } else if (!txtCode.getText().toUpperCase().matches("E[0-9]{4}")) {
            JOptionPane.showMessageDialog(null, "Please input format for ID is Exxxx(x be long to 0-9)", null, JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!name.matches("[A-Za-z ]+")) {
            JOptionPane.showMessageDialog(null, "Name must is a word", null, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;

    }

    public boolean chekExist(String name) {
        for (Employee employee : list) {
            if (employee.getID().equalsIgnoreCase(name)) {
//                System.out.println("ID is exist");
                return true;
            }
        }
        return false;
    }

//    boolean validation(){
//        
//    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if (txtCode.getText().isEmpty()) {
            return;
        }

        if (saveForUpdate) {

            btnSave.setEnabled(true);
            int pos = tblEmp.getSelectedRow();
            System.out.println(pos);
            String code = (String) tblEmp.getValueAt(pos, 0);
            //TODO: tim code trong list de lay ra pos that
            Employee emp = null;
            for (Employee employee : list) {
                if (employee.getID().equalsIgnoreCase(code)) {
                    emp = employee;
                    break;
                }
            }

//            System.out.println(emp);
            if (pos >= 0) {
                pos = tblEmp.getSelectedRow();
                if (JOptionPane.showConfirmDialog(null, "DO you want update the " + emp.getID() + " employee ?") == JOptionPane.OK_OPTION) {
                    if (!validation()) {
                        return;
                    }
                    emp.setName(txtName.getText());
                    emp.setAddress(txtAdress.getText());
                    if (jrbMale.isSelected()) {
                        emp.setSex("Male");
                    } else {
                        emp.setSex("Female");
                    }
//                Integer salary = Integer.parseInt(txtSalary.getText());
//                    Integer salary = Integer.parseInt(txtSalary.getText());
                    Integer salary = null;
                    try {
                        salary = Integer.parseInt(txtSalary.getText().trim());
                        if (salary < 0) {
                            JOptionPane.showMessageDialog(null, " salary must greater than or equal 0", null, JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, " salary must a integer number", null, JOptionPane.WARNING_MESSAGE);
                        return;
                    }
//                    System.out.println(salary);
                    emp.setSalary(salary);
                    txtCode.setText("");
                    txtName.setText("");
                    txtSalary.setText("");
                    txtAdress.setText("");
                    btnSave.setEnabled(false);
                    btnUpdate.setEnabled(true);
                    btnRemove.setEnabled(true);
                    txtAdress.setEnabled(false);
                    txtName.setEnabled(false);
                    txtSalary.setEnabled(false);
                    jrbMale.setEnabled(false);
                    jrbFemale.setEnabled(false);
                    DAO.FileDAO.writeFile(fileName, list);
                    loadData();
                } else {
//                    btnSave.setEnabled(false);
//                    btnUpdate.setEnabled(true);
//                    btnRemove.setEnabled(true);
//                    txtCode.setEnabled(false);
//                    txtAdress.setEnabled(false);
//                    txtName.setEnabled(false);
//                    txtSalary.setEnabled(false);
//                    jrbMale.setEnabled(false);
//                    jrbFemale.setEnabled(false);

                }

            }
        } else {

            if (JOptionPane.showConfirmDialog(null, "Do you want to add ?") == JOptionPane.OK_OPTION) {
                if (!validation()) {
                    return;
                }
                if (chekExist(txtCode.getText().toUpperCase())) {
                    JOptionPane.showMessageDialog(null, "ID is Exist", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }
                btnSave.setEnabled(true);
                Employee emp = new Employee();
                emp.setID(txtCode.getText().toUpperCase());
                emp.setName(txtName.getText());
                emp.setAddress(txtAdress.getText());
                if (jrbMale.isSelected()) {
                    emp.setSex("Male");
                } else {
                    emp.setSex("Female");
                }

//            Integer salary = Integer.parseInt(txtSalary.getText().trim());
                Integer salary = null;
                try {
                    salary = Integer.parseInt(txtSalary.getText().trim());
                    if (salary < 0) {
                        JOptionPane.showMessageDialog(null, " salary must greater than or equal 0", null, JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, " salary must a integer number", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                emp.setSalary(salary);

//                System.out.println(emp);
                list.add(emp);
//                System.out.println(list);

                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnRemove.setEnabled(true);
                txtCode.setEnabled(false);
                txtAdress.setEnabled(false);
                txtName.setEnabled(false);
                txtSalary.setEnabled(false);
                jrbMale.setEnabled(false);
                jrbFemale.setEnabled(false);

                txtCode.setText("");
                txtName.setText("");
                txtSalary.setText("");
                txtAdress.setText("");
                Collections.sort(list);
                DAO.FileDAO.writeFile(fileName, list);
                loadData();

            } else {
                txtCode.setText("");
                txtName.setText("");
                txtSalary.setText("");
                txtAdress.setText("");
                txtCode.setEnabled(false);
                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnRemove.setEnabled(true);
                txtAdress.setEnabled(false);
                txtName.setEnabled(false);
                txtSalary.setEnabled(false);
                jrbMale.setEnabled(false);
                jrbFemale.setEnabled(false);
            }

        }
        saveForUpdate = true;
    }//GEN-LAST:event_btnSaveActionPerformed
    public ArrayList<Employee> findName(String name) {
        ArrayList<Employee> list2 = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getName().toUpperCase().contains(name.toUpperCase())) {
                list2.add(employee);
            }
        }
        if (list2 != null) {
            return list2;
        }

        return null;

    }

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        ArrayList<Employee> list = findName(txtSearch.getText());
        if (txtSearch.getText().equals("")) {
            DAO.FileDAO.readFile(fileName);
            loadData();
//             JOptionPane.showMessageDialog(null, "Please input name to search",null, JOptionPane.WARNING_MESSAGE);
        }

        txtCode.setText("");
        txtName.setText("");
        txtSalary.setText("");
        txtAdress.setText("");
        btnSave.setEnabled(false);
        txtCode.setEnabled(false);
        txtAdress.setEnabled(false);
        txtName.setEnabled(false);
        txtSalary.setEnabled(false);
        jrbMale.setEnabled(false);
        jrbFemale.setEnabled(false);

//            System.out.println(employee.toString());
        Vector data = new Vector();
        Vector header = new Vector();
        header.add("Code");
        header.add("Name");
        header.add("Salary");
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
//        int pos = tblEmp.getSelectedRow();
//        if (pos >= 0) {
        if (!list.isEmpty()) {
            for (Employee employee : list) {
                Vector row = new Vector();
                row.add(employee.getID());
                row.add(employee.getName());
                row.add(employee.getSalary());
                data.add(row);

                model.setDataVector(data, header);

            }
//            }
        } else {
            model.setDataVector(data, header);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyReleased
        // TODO add your handling code here:
   

    }//GEN-LAST:event_txtCodeKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
      

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAdressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdressKeyReleased
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtAdressKeyReleased

    private void txtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyReleased
      

    }//GEN-LAST:event_txtSalaryKeyReleased

    public void loadData() {
        Vector header = new Vector();
        Vector data = new Vector();
        header.add("Code");
        header.add("Name");
        header.add("Salary");
        list = DAO.FileDAO.readFile(fileName);
        Collections.sort(list);
//        System.out.println(list);
        if (!list.isEmpty()) {
            for (Employee st : list) {
                Vector row = new Vector();
                row.add(st.getID());
                row.add(st.getName());
                row.add(st.getSalary());
                data.add(row);

            }

        }
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        model.setDataVector(data, header);
        tblEmp.updateUI();
    }

//    class MyThread extends Thread {
//
//        @Override
//        public void run() {
//            int i = 10;
//            txtCodeKeyReleased(null);
//            txtNameKeyReleased(null);
//            txtAdressKeyReleased(null);
//            txtSalaryKeyReleased(null);
//            btnSaveActionPerformed(null);
//            for (i = 10; i >= 0; i--) {
//
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
//                
//               
//            }
//        }
//    }

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
            java.util.logging.Logger.getLogger(DemoJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DemoJtable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNotify;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSex;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
