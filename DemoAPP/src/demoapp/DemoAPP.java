/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.awt.AWTAccessor;

/**
 *
 * @author USER
 */
public class DemoAPP extends JFrame {

    JButton btnSolve, btnExit;
    JTextField txtResult;
    JTextField txtParaA;
    JTextField txtParaB;

    public DemoAPP() {
        super();
        loadData();
        addEvents();
    }
    ActionListener EventGiai = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            processEquation();
        }
    };

    void processEquation() {
        try {
            String hesoa = txtParaA.getText();
            String hesob = txtParaB.getText();

            if (txtParaA.getText().trim().equals("") || txtParaB.getText().trim().equals("")) {
                return;
            }
            double a = Double.parseDouble(hesoa);
            double b = Double.parseDouble(hesob);
            if (a == 0 && b == 0) {
                txtResult.setText("Infinite solution");
            } else if (a == 0 && b != 0) {
                txtResult.setText("No solution");
            } else {
                double x = a / b;
                txtResult.setText("x = " + x);
            }
        } catch (Exception e) {
            txtResult.setText("Invalid parameter");
        }

    }

    public void loadData() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);
        JPanel pnTitle = new JPanel();
        pnTitle.setLayout(new FlowLayout());
        JLabel lblTitle = new JLabel("Solve first equation");
        pnTitle.add(lblTitle);
        pnMain.add(pnTitle);
        lblTitle.setForeground(Color.blue);
        Font fontTitle = new Font("arial", Font.BOLD, 20);
        lblTitle.setFont(fontTitle);

        JPanel pnParaA = new JPanel();
        pnParaA.setLayout(new FlowLayout());
        JLabel lblParaA = new JLabel("A = ");
        txtParaA = new JTextField(15);
        pnParaA.add(lblParaA);
        pnParaA.add(txtParaA);
        pnMain.add(pnParaA);

        JPanel pnParaB = new JPanel();
        pnParaB.setLayout(new FlowLayout());
        JLabel lblParaB = new JLabel("B =");
        txtParaB = new JTextField(15);
        pnParaB.add(lblParaB);
        pnParaB.add(txtParaB);
        pnMain.add(pnParaB);

        JPanel pnButton = new JPanel();
        pnButton.setLayout(new FlowLayout());
        btnSolve = new JButton("Solve");
        btnExit = new JButton("Exit");
        pnButton.add(btnSolve);
        pnButton.add(btnExit);
        pnMain.add(pnButton);

        JPanel pnResult = new JPanel();
        pnResult.setLayout(new FlowLayout());
        JLabel lblResult = new JLabel("Result");
        txtResult = new JTextField(15);
        pnResult.add(lblResult);
        pnResult.add(txtResult);
        pnMain.add(pnResult);

    }

    public void addEvents() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnSolve.addActionListener(EventGiai);
    }

    public void showWindow() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoAPP demo = new DemoAPP();
        demo.showWindow();
    }

}
