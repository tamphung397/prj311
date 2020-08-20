/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhotoViewer;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author USER
 */
public class DemoPhotoviewer extends javax.swing.JFrame {

    /**
     * Creates new form DemoPhotoviewer
     */
    DefaultListModel<String> listModel;
    String currentPath, imgpath;
    private Color Color;

    public DemoPhotoviewer() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void loadImageFile(String imagePath) throws IOException {
        BufferedImage img = null;
        File file = new File(imagePath);
        img = ImageIO.read(file);

        Image dimg = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH); // set kich thuoc
        ImageIcon pic = new ImageIcon(dimg);

        double size = (double) (file.length() / 1024);
        DecimalFormat actualSize = new DecimalFormat(".##");
        lblImgPath.setText("Path:" + imagePath);
        lblSize.setText("Size:" + actualSize.format(size) + "KB");
        lblPic.setIcon(pic);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFiles = new javax.swing.JList<>();
        lblPic = new javax.swing.JLabel();
        lblImgPath = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLoadFiles = new javax.swing.JMenuItem();
        mnuFolder = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuBackground = new javax.swing.JMenuItem();
        mnuForeground = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        listFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFilesMouseClicked(evt);
            }
        });
        listFiles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listFilesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listFiles);

        jSplitPane1.setLeftComponent(jScrollPane2);

        lblPic.setToolTipText("");
        jSplitPane1.setRightComponent(lblPic);

        lblImgPath.setText("Image Path:");

        lblSize.setText("Size:");

        jMenu1.setText("File");

        mnuLoadFiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuLoadFiles.setText("Load Images");
        mnuLoadFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoadFilesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLoadFiles);

        mnuFolder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuFolder.setText("Search Forders");
        mnuFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFolderActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFolder);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Change List Color");

        mnuBackground.setText("Background");
        mnuBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBackgroundActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBackground);

        mnuForeground.setText("Foreground");
        mnuForeground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuForegroundActionPerformed(evt);
            }
        });
        jMenu3.add(mnuForeground);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImgPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(lblSize)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImgPath)
                    .addComponent(lblSize))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLoadFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoadFilesActionPerformed
        // TODO add your handling code here:
        currentPath = "C:\\Users\\USER\\Desktop\\picture";

        loadIMGFile(currentPath);


    }//GEN-LAST:event_mnuLoadFilesActionPerformed

    private void listFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFilesMouseClicked
        // TODO add your handling code here:

//        if (listFiles.getModel().getSize() > 0) {
//            String fileName = listFiles.getSelectedValue();
//            String filePath = currentPath + "/" + fileName;
//            System.out.println(fileName);
//            try {
//                loadImageFile(filePath);
//            } catch (IOException ex) {
//                Logger.getLogger(JPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "No image exists", "Error!", JOptionPane.ERROR_MESSAGE);
//        }

            showImage(imgpath);
           

    }//GEN-LAST:event_listFilesMouseClicked

    private void mnuFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFolderActionPerformed
        // TODO add your handling code here:
//        JFileChooser fc = new JFileChooser();
//        fc.setCurrentDirectory(new java.io.File("."));
//        fc.setName("Choose a Directory");
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int returnVal = fc.showOpenDialog(this);
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File selectedFolder = fc.getSelectedFile();
////            System.out.println(fc.getSelectedFile());
//            currentPath = selectedFolder.getAbsolutePath();//
//            System.out.println(currentPath);
//            loadIMGFile(currentPath);
//        }

        JFileChooser fc = new JFileChooser();
        fc.setName("chosse Directory");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            currentPath = fc.getSelectedFile().getAbsolutePath();
            System.out.println(currentPath);
            File thisFile = new File(currentPath);
            String[] fileList = thisFile.list(new  FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(".png") || (name.toLowerCase().endsWith(".jpg"))) {
                    return true;
                } else {
                    return false;
                }
                }
            });
            DefaultListModel model = new DefaultListModel();
            
          
            for (String f : fileList) {
                System.out.println(f);
                model.addElement(f);
            }
            listFiles.setModel(model);
         

        }
    }//GEN-LAST:event_mnuFolderActionPerformed

    
    private void showImage(String path){
        imgpath = currentPath + "\\" + listFiles.getSelectedValue();
        File imgFile = new File(imgpath);
        BufferedImage bfm = null;
        
        try {
            bfm = ImageIO.read(imgFile);
            Image img = bfm.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(img);
            lblPic.setIcon(ico);
            lblPic.updateUI();
            lblImgPath.setText("Path" + imgpath);
            double size = imgFile.length() / 1024;
            lblSize.setText("Size:" + size);
            
        } catch (IOException ex) {
            Logger.getLogger(DemoPhotoviewer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(imgpath);
    
        
        
       
   }
    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBackgroundActionPerformed
        // TODO add your handling code here:
        Color = Color.BLACK;
        Color = JColorChooser.showDialog(this, "Select color", Color);
        if (Color == null) {
            Color = Color.red;

//           jSplitPane1.setBackground(Color);
        }
        jScrollPane2.setBackground(Color);
    }//GEN-LAST:event_mnuBackgroundActionPerformed

    private void mnuForegroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuForegroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuForegroundActionPerformed

    private void listFilesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listFilesKeyReleased
        // TODO add your handling code here:
          showImage(imgpath);
    }//GEN-LAST:event_listFilesKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowActivated

    public void loadIMGFile(String path) {
        File file = new File(path);
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".png") || (name.toLowerCase().endsWith(".jpg"))) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        listModel = new DefaultListModel<>();
        for (String f : list) {
            System.out.println(f);
            listModel.addElement(f);
        }
        listFiles.setModel(listModel);
    }

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
            java.util.logging.Logger.getLogger(DemoPhotoviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoPhotoviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoPhotoviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoPhotoviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoPhotoviewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblImgPath;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblSize;
    private javax.swing.JList<String> listFiles;
    private javax.swing.JMenuItem mnuBackground;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFolder;
    private javax.swing.JMenuItem mnuForeground;
    private javax.swing.JMenuItem mnuLoadFiles;
    // End of variables declaration//GEN-END:variables
}
