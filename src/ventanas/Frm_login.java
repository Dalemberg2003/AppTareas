/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.sql.*;
import conexion.Conexion;

/**
 *
 * @author GREBMELAD
 */
public class Frm_login extends javax.swing.JFrame {

    /**
     * Creates new form Frm_login
     */
    int xMouse, yMouse;
    public static String user = "";
    String pass = "";

    public Frm_login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        txt_user.requestFocus();
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
        jPanel2 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_ingresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_registrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 18, 19));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imglogin1.jpg"))); // NOI18N
        jPanel2.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 6, 278, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 510));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Iniciar sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(0, 0, 0));
        txt_user.setBorder(null);
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 207, 250, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txt_contra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_contra.setForeground(new java.awt.Color(0, 0, 0));
        txt_contra.setBorder(null);
        txt_contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraKeyTyped(evt);
            }
        });
        jPanel1.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, 250, 10));

        btn_ingresar.setBackground(new java.awt.Color(23, 23, 143));
        btn_ingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_exit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(0, 0, 0));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("x");
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });
        exitBtn.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 40, 40));

        jPanel3.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        lbl_registrarse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_registrarse.setForeground(new java.awt.Color(23, 23, 143));
        lbl_registrarse.setText("Registrate aquí");
        lbl_registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_registrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_registrarseMouseExited(evt);
            }
        });
        jPanel1.add(lbl_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel3MouseDragged

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exitBtn.setBackground(Color.red);
        lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exitBtn.setBackground(Color.white);
        lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        btn_ingresar.setBackground(new Color(45, 46, 176));
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        btn_ingresar.setBackground(new Color(23, 23, 143));
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void lbl_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarseMouseClicked
        Frm_registrarse registro = new Frm_registrarse();
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_registrarseMouseClicked

    private void lbl_registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarseMouseEntered
        Font font = lbl_registrarse.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl_registrarse.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_lbl_registrarseMouseEntered

    private void lbl_registrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarseMouseExited
        Font font = lbl_registrarse.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        lbl_registrarse.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_lbl_registrarseMouseExited

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
        if (txt_user.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_userKeyTyped

    private void txt_contraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraKeyTyped
        if (txt_contra.getPassword().length >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_contraKeyTyped

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        user = txt_user.getText().trim();
        pass = txt_contra.getText().trim();

        if (!(user.equals("") || pass.equals(""))) {
            if (user.equals("admin")) {
                try {
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM cuentasadmin WHERE usuario = '" + user + "' and contraseña = '" + pass + "'");
                    ResultSet rs = pst.executeQuery();
                    
                    if (rs.next()) {
                        Frm_PrincipalAdmin principalAdmin = new Frm_PrincipalAdmin();
                        principalAdmin.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Inicio de sesión", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException e) {
                    System.err.println("Error al consultar la tabla de admins "+e);                    
                }
            } else {
                try {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement("SELECT * FROM cuentasusuarios WHERE usuario = '" + user + "' and contraseña = '" + pass + "'");
                    ResultSet rs2 = pst2.executeQuery();

                    if (rs2.next()) {
                        Frm_PrincipalUsuarios principalUser = new Frm_PrincipalUsuarios();
                        principalUser.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Inicio de sesión", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (SQLException e) {
                    System.err.println("Error al consultar usuario y contraseña " + e);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar su usuario y contraseña", "Inicio de sesión", JOptionPane.WARNING_MESSAGE);
            txt_user.requestFocus();
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_registrarse;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
