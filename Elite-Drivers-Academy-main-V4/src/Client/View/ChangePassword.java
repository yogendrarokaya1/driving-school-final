/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client.View;

import Controller.ChangePasswordController;

/**
 *
 * @author utsav
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
    initComponents();
    setTitle("Setting- Driving School");
    setSize(1200, 800);
    setLocationRelativeTo(null);
    setResizable(false);

        // Initialize the controller
        ChangePasswordController changePasswordController = new ChangePasswordController(this);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        eliteDriversAcademyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnlogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        changePasswordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtChangeEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        btnHome.setBackground(new java.awt.Color(0, 51, 102));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnStudent.setBackground(new java.awt.Color(0, 51, 102));
        btnStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Student");
        btnStudent.setBorder(null);
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnSetting.setBackground(new java.awt.Color(0, 51, 102));
        btnSetting.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(153, 204, 255));
        btnSetting.setText("Settings");
        btnSetting.setBorder(null);
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/whitebig trans300-01.png"))); // NOI18N
        image.setText("jLabel1");

        eliteDriversAcademyLabel.setBackground(new java.awt.Color(0, 51, 102));
        eliteDriversAcademyLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliteDriversAcademyLabel.setForeground(new java.awt.Color(153, 204, 255));
        eliteDriversAcademyLabel.setText("Elite Drivers Academy");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home_icon.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/student_icon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/setting_icon.png"))); // NOI18N
        jLabel5.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSetting)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnHome)
                                        .addGap(16, 16, 16))
                                    .addComponent(btnStudent)))
                            .addComponent(eliteDriversAcademyLabel))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliteDriversAcademyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnHome)
                        .addGap(40, 40, 40)
                        .addComponent(btnStudent)
                        .addGap(38, 38, 38)
                        .addComponent(btnSetting))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnlogOut.setBackground(new java.awt.Color(0, 51, 102));
        btnlogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnlogOut.setText("log out");
        btnlogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogOutActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        changePasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changePasswordLabel.setText("Change Password");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        oldPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        oldPasswordLabel.setText("Old Password");

        newPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newPasswordLabel.setText("New Password");

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password");

        btnChangePassword.setBackground(new java.awt.Color(0, 153, 255));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change Password");
        btnChangePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        txtChangeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(newPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(105, 105, 105))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtChangeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 105, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(changePasswordLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(btnChangePassword)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(changePasswordLabel)
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChangeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oldPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(newPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/b.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlogOut)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(235, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnlogOut)))
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
Dashboard d=new Dashboard();
d.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtChangeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeEmailActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
StudentRecord sr=new StudentRecord();
sr.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnlogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogOutActionPerformed
LogIn li=new LogIn();
li.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogOutActionPerformed
public javax.swing.JButton getBtnChangePassword() {
    return btnChangePassword;
}

public javax.swing.JTextField getTxtChangeEmail() {
    return txtChangeEmail;
}

public javax.swing.JPasswordField getTxtOldPassword() {
    return txtOldPassword;
}

public javax.swing.JPasswordField getTxtNewPassword() {
    return txtNewPassword;
}

public javax.swing.JPasswordField getTxtConfirmPassword() {
    return txtConfirmPassword;
}
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnlogOut;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel eliteDriversAcademyLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JTextField txtChangeEmail;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
