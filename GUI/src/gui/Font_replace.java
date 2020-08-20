/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class Font_replace extends javax.swing.JDialog {

    /**
     * Creates new form Font_replace
     */
    MyNotepad father;
     int formIndex = 0;
    public Font_replace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        father = (MyNotepad) parent;
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
        txtKeyWord = new javax.swing.JTextField();
        btnFindAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtReplace = new javax.swing.JTextField();
        btnReplaceAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("nhap tu can tim");

        btnFindAll.setText("Find All");
        btnFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllActionPerformed(evt);
            }
        });

        jLabel2.setText("Replace test");

        btnReplaceAll.setText("Replace All");
        btnReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKeyWord)
                    .addComponent(txtReplace, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReplaceAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFindAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindAll))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReplaceAll))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAllActionPerformed
        // TODO add your handling code here:
        // lay key word can tim
        String findWhat = txtKeyWord.getText();
        // lay noi dung van ban go trong cua so cha
        String noidung = father.jtxtContent.getText();
        if (!findWhat.isEmpty()) {
//            int formIndex = 0;
            int pos = -1;
//            while (formIndex < noidung.length()) {
                pos = noidung.indexOf(findWhat, formIndex);
                if (pos >= 0) // tim thay keyword trong noi dung
                {
                    // to mau cho tim thay
//                    father.jtxtContent.select(pos, pos + findWhat.length());
                    father.jtxtContent.setSelectionStart(pos);
                    father.jtxtContent.setSelectionEnd(pos + findWhat.length());
                    formIndex = pos + findWhat.length() + 1;
//                }
            }
            
        }
    }//GEN-LAST:event_btnFindAllActionPerformed

    private void btnReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceAllActionPerformed
        // TODO add your handling code here:
        String replace = txtReplace.getText();
        father.jtxtContent.getSelectedText();
        father.jtxtContent.replaceSelection(replace);
        System.out.println(replace);
//        father.jtxtContent.getText().replaceAll(replace, replace);
        
    }//GEN-LAST:event_btnReplaceAllActionPerformed

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
            java.util.logging.Logger.getLogger(Font_replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Font_replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Font_replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Font_replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Font_replace dialog = new Font_replace(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindAll;
    private javax.swing.JButton btnReplaceAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtKeyWord;
    private javax.swing.JTextField txtReplace;
    // End of variables declaration//GEN-END:variables
}