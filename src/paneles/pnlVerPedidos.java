/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import conexion.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ventanas.CancelarModificarPedidos;
import ventanas.Frm_PrincipalUsuarios;

/**
 *
 * @author RojeruSan
 */
public class pnlVerPedidos extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    DefaultTableModel model = new DefaultTableModel();
    Object[] fila;
    public static String user = Frm_PrincipalUsuarios.user;
    public static String id = "";
    public static String celular="";
    public static String correo = "";
    public static String archivo = "";
    public static String mensaje = "";
    public static String estado = "";
    public pnlVerPedidos() {
        initComponents();
        fila = new Object[6];
        tbl_pedidos = new JTable(model);
        jScrollPane1.setViewportView(tbl_pedidos);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select id_tarea,celular,correo,nombreArchivo,mensaje,estado from tareasusuarios where cliente = '"+user+"'");
            ResultSet rs = pst.executeQuery();
            
            model.addColumn("ID");
            model.addColumn("Celular");
            model.addColumn("Correo");
            model.addColumn("Archivo");
            model.addColumn("Mensaje");
            model.addColumn("Estado");

            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al extraer los datos " + e);
        }
        
        tbl_pedidos.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = tbl_pedidos.rowAtPoint(e.getPoint());                
                int columna_id = 0;
                int columna_celular = 1;
                int columna_correo = 2;
                int columna_archivo = 3;
                int columna_mensaje = 4;
                int columna_estado = 5;
                if(fila_point > -1){
                    id = Integer.toString((int) model.getValueAt(fila_point, columna_id));
                    celular = (String) model.getValueAt(fila_point, columna_celular);
                    correo = (String)model.getValueAt(fila_point, columna_correo);
                    archivo = (String)model.getValueAt(fila_point, columna_archivo);
                    mensaje = (String)model.getValueAt(fila_point, columna_mensaje);
                    estado = (String)model.getValueAt(fila_point, columna_estado);
                    CancelarModificarPedidos cancelarModificarPedidos = new CancelarModificarPedidos();
                    cancelarModificarPedidos.setVisible(true);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pedidos = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 162, 4, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ver pedidos");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, 640, -1));

        tbl_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tbl_pedidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 660, 344));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });
        add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        model.setRowCount(0);
        try {
            Connection cn4 = Conexion.conectar();
            PreparedStatement pst4 = cn4.prepareStatement("select id_tarea,celular,correo,nombreArchivo,mensaje,estado from tareasusuarios where cliente = '"+user+"'");
            ResultSet rs4 = pst4.executeQuery();

            while (rs4.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs4.getObject(i + 1);
                }
                model.addRow(fila);
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar datos "+e);
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pedidos;
    // End of variables declaration//GEN-END:variables
}
