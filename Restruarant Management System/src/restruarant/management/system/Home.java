/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restruarant.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author risha
 */
public class Home extends javax.swing.JFrame {
    
    String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnCategory.setEnabled(false);
            btnViewEditDeleteProduct.setEnabled(false);
            btnNewProduct.setEnabled(false);
            btnVerifyUser.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnViewBillsOrderPlacedDetail = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSecQues = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 21, -1, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 21, -1, -1));

        btnViewBillsOrderPlacedDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBillsOrderPlacedDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewBillsOrderPlacedDetail.setText("View Bill or Order Placed Details");
        btnViewBillsOrderPlacedDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillsOrderPlacedDetailActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillsOrderPlacedDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 21, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 21, -1, -1));

        btnChangeSecQues.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeSecQues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSecQues.setText("Change Security Question");
        btnChangeSecQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecQuesActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 21, -1, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 21, -1, -1));

        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 708, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Products");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 708, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText(" View, Edit and Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 708, -1, -1));

        btnVerifyUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUser.setText("Verify User");
        btnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 708, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewBillsOrderPlacedDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillsOrderPlacedDetailActionPerformed
        // TODO add your handling code here:
        new ViewBillOrder().setVisible(true);
    }//GEN-LAST:event_btnViewBillsOrderPlacedDetailActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to log out.", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit the application.", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
//setVisible(false);
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUserActionPerformed
        // TODO add your handling code here:
        new VerifyUser().setVisible(true);
    }//GEN-LAST:event_btnVerifyUserActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnChangeSecQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecQuesActionPerformed
        // TODO add your handling code here:
new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecQuesActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecQues;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnViewBillsOrderPlacedDetail;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
