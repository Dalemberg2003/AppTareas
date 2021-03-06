/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conexion.Conexion;
import paneles.pnlPedidosAdmin;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GREBMELAD
 */
public class ModifcarPedidosAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ModifcarPedidos
     */
    String cliente,id_tarea;
    public ModifcarPedidosAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        id_tarea = pnlPedidosAdmin.id_cliente;
        cliente = pnlPedidosAdmin.userCliente;
        
        lbl_cliente.setText("Pedido del cliente "+cliente);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_descargar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_cliente = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_descargar1 = new javax.swing.JButton();
        btn_actualizar_estado = new javax.swing.JButton();

        btn_descargar.setText("Descargar PDF");
        btn_descargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_descargarMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Pedido");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, 309, 30));

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceptado", "Terminado" }));
        cb_estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 131, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 95, -1, -1));

        btn_descargar1.setText("Descargar PDF");
        btn_descargar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_descargar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_descargar1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_descargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 40));

        btn_actualizar_estado.setText("Actualizar Estado");
        btn_actualizar_estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizar_estadoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_actualizar_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 283));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_descargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descargarMouseClicked
        descargarPDF_BaseDatos();
    }//GEN-LAST:event_btn_descargarMouseClicked

    private void btn_descargar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descargar1MouseClicked
        descargarPDF_BaseDatos();
    }//GEN-LAST:event_btn_descargar1MouseClicked

    private void btn_actualizar_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_estadoMouseClicked
        String estado = (String) cb_estado.getSelectedItem();
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("update tareasusuarios set estado = ? where id_tarea = '"+id_tarea+"' and cliente = '"+cliente+"'");
            pst.setString(1, estado);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Estado actualizado correctamente");
        } catch (SQLException e) {
            System.err.println("Error al actualizar estado "+e);
        }
    }//GEN-LAST:event_btn_actualizar_estadoMouseClicked

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
            java.util.logging.Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifcarPedidosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_estado;
    private javax.swing.JButton btn_descargar;
    private javax.swing.JButton btn_descargar1;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_cliente;
    // End of variables declaration//GEN-END:variables

    public void descargarPDF_BaseDatos() {
        String Ncliente = cliente;
        try {
            Connection cn3 = Conexion.conectar();
            PreparedStatement pst3 = cn3.prepareStatement("select archivo from tareasusuarios where cliente = '" + Ncliente + "'");
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                Blob blob = rs3.getBlob("archivo");
                InputStream is = blob.getBinaryStream();
                GuardarPDF(is, Ncliente);
            }
        } catch (SQLException e) {
        }
    }

    public void GuardarPDF(InputStream x, String nombre) {
        File fichero = new File("C://DescargarPDF_Tareas", nombre + ".pdf");
        BufferedInputStream in = new BufferedInputStream(x);
        try {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fichero));
            byte[] bytes = new byte[50000000];
            int len = 0;
            while ((len = in.read(bytes)) > 0) {
                out.write(bytes, 0, len);
            }
            out.flush();
            out.close();
            in.close();
            JOptionPane.showMessageDialog(this, "PDF descargado exitosamente", "Descarga", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModifcarPedidosAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

