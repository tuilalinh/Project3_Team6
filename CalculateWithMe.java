/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author tp773
 */
public class CalculateWithMe extends javax.swing.JFrame {

    /**
     * Creates new form CalculateWithMe
     */
    public CalculateWithMe() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSecondnumber = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnCong = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnChianguyen = new javax.swing.JButton();
        btnChiadu = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtFirstnumber = new javax.swing.JTextField();
        btnCong1 = new javax.swing.JButton();
        btnCong2 = new javax.swing.JButton();
        btnCong3 = new javax.swing.JButton();
        btnCong4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CALCULATE WITH ME ?");

        jLabel2.setText("First number");

        jLabel3.setText("Second number");

        jLabel4.setText("Result");

        btnCong.setBackground(new java.awt.Color(204, 0, 0));
        btnCong.setForeground(new java.awt.Color(255, 255, 255));
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        btnTru.setBackground(new java.awt.Color(204, 0, 0));
        btnTru.setForeground(new java.awt.Color(255, 255, 255));
        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        btnNhan.setBackground(new java.awt.Color(204, 0, 0));
        btnNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });

        btnChianguyen.setBackground(new java.awt.Color(204, 0, 0));
        btnChianguyen.setForeground(new java.awt.Color(255, 255, 255));
        btnChianguyen.setText("/");
        btnChianguyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChianguyenActionPerformed(evt);
            }
        });

        btnChiadu.setBackground(new java.awt.Color(204, 0, 0));
        btnChiadu.setForeground(new java.awt.Color(255, 255, 255));
        btnChiadu.setText("%");
        btnChiadu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaduActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 204, 0));
        btnReset.setText("CE");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCong1.setBackground(new java.awt.Color(204, 0, 0));
        btnCong1.setForeground(new java.awt.Color(255, 255, 255));
        btnCong1.setText("x�");
        btnCong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCong1ActionPerformed(evt);
            }
        });

        btnCong2.setBackground(new java.awt.Color(204, 0, 0));
        btnCong2.setForeground(new java.awt.Color(255, 255, 255));
        btnCong2.setText("? x");
        btnCong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCong2ActionPerformed(evt);
            }
        });

        btnCong3.setBackground(new java.awt.Color(204, 0, 0));
        btnCong3.setForeground(new java.awt.Color(255, 255, 255));
        btnCong3.setText("<-");
        btnCong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCong3ActionPerformed(evt);
            }
        });

        btnCong4.setBackground(new java.awt.Color(204, 0, 0));
        btnCong4.setForeground(new java.awt.Color(255, 255, 255));
        btnCong4.setText("->");
        btnCong4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCong4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtSecondnumber)
                            .addComponent(txtResult)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnCong1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnCong)
                                .addGap(26, 26, 26)
                                .addComponent(btnTru)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNhan)
                                .addGap(28, 28, 28)
                                .addComponent(btnChianguyen)
                                .addGap(31, 31, 31)
                                .addComponent(btnChiadu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCong2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCong3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCong4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSecondnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCong)
                    .addComponent(btnTru)
                    .addComponent(btnNhan)
                    .addComponent(btnChianguyen)
                    .addComponent(btnChiadu)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCong1)
                    .addComponent(btnCong2)
                    .addComponent(btnCong3)
                    .addComponent(btnCong4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String num1 = txtFirstnumber.getText();
        String num2 = txtSecondnumber.getText();
        
        validateData(num1, sb, num2);
        
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString());
            return;
        }
        calculate(num1, num2, '+');
    }//GEN-LAST:event_btnCongActionPerformed

    private void calculate(String num1, String num2, char opt) throws HeadlessException {
        try {
           double n1 = Double.parseDouble(num1);
           double n2 = Double.parseDouble(num2);
           
            switch(opt){
                case '+':
                    if (n1 == (int) n1 && n2 == (int) n2) {
                        int sum = (int) (n1 + n2);
                        txtResult.setText(String.valueOf(sum));
                    } else {
                        double sum = n1 + n2;
                        txtResult.setText(String.valueOf(sum));
                    }
                    break;
                case '-':
                  //  txtResult.setText(""+ (n1-n2));
                    if (n1 == (int) n1 && n2 == (int) n2) {
                        int sub = (int) (n1 - n2);
                        txtResult.setText(String.valueOf(sub));
                    } else {
                        double sub = n1 - n2;
                        sub = Math.round(sub*1000.0)/1000.0;
                        txtResult.setText(String.valueOf(sub));
                    }
                    break;
                case '*':
                   // txtResult.setText(""+ (n1*n2));
                    if (n1 == (int) n1 && n2 == (int) n2) {
                        int mul = (int) (n1 * n2);
                        txtResult.setText(String.valueOf(mul));
                    } else {
                        double mul = n1 * n2;
                        mul = Math.round(mul*1000.0)/1000.0;
                        txtResult.setText(String.valueOf(mul));
                    }
                    break;
                case '/':
                    if (n2==0){
                        txtResult.setText("\n Nhap du lieu sai!");
                    }
                    else txtResult.setText(""+ (int)(n1/n2));
                    break;
                case '%':
                    //txtResult.setText(""+ (n1%n2));
                    if (n2==0){
                        txtResult.setText("\n Nhap du lieu sai!");
                    }
                    else if (n1 == (int) n1 && n2 == (int) n2) {
                        int mod = (int) (n1 % n2);
                        txtResult.setText(String.valueOf(mod));
                    } else {
                        double mod = n1 % n2;
                        mod = Math.round(mod*1000.0)/1000.0;
                        txtResult.setText(String.valueOf(mod));
                    }
                    break;
            }
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void validateData(String num1, StringBuilder sb, String num2) {
        if (num1.equals("")){
            sb.append("First number is required! \n");
        }
        
        if (num2.equals("")){
            sb.append("Second number is required! \n");
        }
    }

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String num1 = txtFirstnumber.getText();
        String num2 = txtSecondnumber.getText();
        
        validateData(num1, sb, num2);
        
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString());
            return;
        }
        calculate(num1, num2, '-');
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String num1 = txtFirstnumber.getText();
        String num2 = txtSecondnumber.getText();
        
        validateData(num1, sb, num2);
        
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString());
            return;
        }
        calculate(num1, num2, '*');
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnChianguyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChianguyenActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String num1 = txtFirstnumber.getText();
        String num2 = txtSecondnumber.getText();
        
        validateData(num1, sb, num2);
        
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString());
            return;
        }
        calculate(num1, num2, '/');
    }//GEN-LAST:event_btnChianguyenActionPerformed

    private void btnChiaduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaduActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String num1 = txtFirstnumber.getText();
        String num2 = txtSecondnumber.getText();
        
        validateData(num1, sb, num2);
        
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString());
            return;
        }
        calculate(num1, num2, '%');
    }//GEN-LAST:event_btnChiaduActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtFirstnumber.setText("");
        txtSecondnumber.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCong1ActionPerformed

    private void btnCong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCong2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCong2ActionPerformed

    private void btnCong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCong3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCong3ActionPerformed

    private void btnCong4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCong4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCong4ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateWithMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateWithMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateWithMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateWithMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateWithMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiadu;
    private javax.swing.JButton btnChianguyen;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnCong1;
    private javax.swing.JButton btnCong2;
    private javax.swing.JButton btnCong3;
    private javax.swing.JButton btnCong4;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtFirstnumber;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSecondnumber;
    // End of variables declaration//GEN-END:variables
}
