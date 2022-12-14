/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import BOs.ClienteBO;
import DAOs.ClienteDAO;
import Tablas.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Carlos Ulibarri
 */
public class Cliente_I extends javax.swing.JFrame {
    //Fondo f = new Fondo();
    ClienteBO cBO = new ClienteBO();
    Cliente cnt =  new Cliente();
    /**
     * Creates new form Cliente_I
     */
    public Cliente_I() {
        initComponents();
        mostrarClintesT();
        
        this.setLocationRelativeTo(null);
        
    }

    public void mostrarClintesT (){
        cBO.mostrarCliente(tb_clientes);
        tb_clientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tb_clientes.getColumnModel().getColumn(8).setMaxWidth(0);
      
      
    }
    
    public void limpiar(){
        String l = "";
        tx_nombre.setText(l);
        tx_ap.setText(l);
        tx_am.setText(l);
        tx_correo.setText(l);
        tx_tel.setText(l);
        tx_usuario.setText(l);
        tx_contra.setText(l);
        tx_id.setText(l);
        tx_did.setText(l);
        
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_ap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tx_am = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tx_correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tx_tel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_contra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        b_reporte = new javax.swing.JButton();
        b_agregar = new javax.swing.JButton();
        b_editar = new javax.swing.JButton();
        b_borrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tx_did = new javax.swing.JTextField();
        tx_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel1.add(tx_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));
        jPanel1.add(tx_ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 150, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));
        jPanel1.add(tx_am, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 150, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));
        jPanel1.add(tx_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 150, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel1.add(tx_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        jPanel1.add(tx_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contrase??a");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        jPanel1.add(tx_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 150, -1));

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_clientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 780, 280));

        b_reporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\green\\Desktop\\Base de Datos_Negocio\\Proyecto\\reporte.png")); // NOI18N
        b_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reporteActionPerformed(evt);
            }
        });
        jPanel1.add(b_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 30, 30));

        b_agregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\green\\Desktop\\Base de Datos_Negocio\\Proyecto\\nuevo.png")); // NOI18N
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(b_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 30, 30));

        b_editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\green\\Desktop\\Base de Datos_Negocio\\Proyecto\\editar.png")); // NOI18N
        b_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_editarMouseClicked(evt);
            }
        });
        b_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarActionPerformed(evt);
            }
        });
        jPanel1.add(b_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 30, 30));

        b_borrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\green\\Desktop\\Base de Datos_Negocio\\Proyecto\\borrar.png")); // NOI18N
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        jPanel1.add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 30, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 90, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        tx_did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_didActionPerformed(evt);
            }
        });
        getContentPane().add(tx_did, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 120, -1));

        tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_idActionPerformed(evt);
            }
        });
        getContentPane().add(tx_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reporteActionPerformed
//        Reportes repC = new Reportes();
//        repC.getReport();
    }//GEN-LAST:event_b_reporteActionPerformed

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
        
        if(tx_nombre.getText().isEmpty() || tx_ap.getText().isEmpty() || tx_am.getText().isEmpty() || 
           tx_correo.getText().isEmpty() || tx_tel.getText().isEmpty() || tx_usuario.getText().isEmpty() ||
           tx_contra.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Deben estar llenos todos los campos");
        }else{
           // Cliente cnt =  new Cliente();
            
            cnt.setNombre_cliente(tx_nombre.getText());
            cnt.setAp_c(tx_ap.getText());
            cnt.setAm_c(tx_am.getText());
            cnt.setCorreo_c(tx_correo.getText());
            cnt.setTelefono_c(Long.parseLong(tx_tel.getText()));
            cnt.setUsuario_c(tx_usuario.getText());
            cnt.setContra_c(tx_contra.getText());
            String mensaje = cBO.agregarCliente(cnt);
            limpiar();
            mostrarClintesT();
        }
    }//GEN-LAST:event_b_agregarActionPerformed

    private void b_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarActionPerformed
       if(tx_nombre.getText().isEmpty() || tx_ap.getText().isEmpty() || tx_am.getText().isEmpty() || 
           tx_correo.getText().isEmpty() || tx_tel.getText().isEmpty() || tx_usuario.getText().isEmpty() ||
           tx_contra.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Deben estar llenos todos los campos");
        }else{
       
       cnt.setNombre_cliente(tx_nombre.getText());
       cnt.setAp_c(tx_ap.getText());
       cnt.setAm_c(tx_am.getText());
       cnt.setCorreo_c(tx_correo.getText());
       cnt.setTelefono_c(Long.parseLong(tx_tel.getText()));
       cnt.setUsuario_c(tx_usuario.getText());
       cnt.setContra_c(tx_contra.getText());
       //cnt.setDirec_id(Integer.parseInt(tx_did.getText()));
       String mensaje = cBO.editarCliente(cnt, Integer.parseInt(tx_id.getText()));
       limpiar();
       mostrarClintesT();   
       }
    }//GEN-LAST:event_b_editarActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
         if(tx_nombre.getText().isEmpty() || tx_ap.getText().isEmpty() || tx_am.getText().isEmpty() || 
           tx_correo.getText().isEmpty() || tx_tel.getText().isEmpty() || tx_usuario.getText().isEmpty() ||
           tx_contra.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Deben estar llenos todos los campos");
        }else{
       
       String mensaje = cBO.borrarCliente(Integer.parseInt(tx_id.getText()));
       limpiar();
       mostrarClintesT();   
       }
    }//GEN-LAST:event_b_borrarActionPerformed

    private void tb_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMouseClicked
       
       int sel = tb_clientes.rowAtPoint(evt.getPoint());
       
       tx_id.setText(tb_clientes.getValueAt(sel, 0)+"");
       tx_nombre.setText(tb_clientes.getValueAt(sel, 1)+"");     
       tx_ap.setText(tb_clientes.getValueAt(sel, 2)+"");
       tx_am.setText(tb_clientes.getValueAt(sel, 3)+"");
       tx_correo.setText(tb_clientes.getValueAt(sel, 4)+"");
       tx_tel.setText(tb_clientes.getValueAt(sel, 5)+"");
       tx_usuario.setText(tb_clientes.getValueAt(sel, 6)+"");
       tx_contra.setText(tb_clientes.getValueAt(sel, 7)+"");
       //tx_did.setText(tb_clientes.getValueAt(sel, 8)+"");
       
    }//GEN-LAST:event_tb_clientesMouseClicked

    private void b_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_editarMouseClicked

    }//GEN-LAST:event_b_editarMouseClicked

    private void tx_didActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_didActionPerformed
        
    }//GEN-LAST:event_tx_didActionPerformed

    private void tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_I().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_agregar;
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_editar;
    private javax.swing.JButton b_reporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTextField tx_am;
    private javax.swing.JTextField tx_ap;
    private javax.swing.JTextField tx_contra;
    private javax.swing.JTextField tx_correo;
    private javax.swing.JTextField tx_did;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_tel;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
    class Fondo extends JPanel {
        private Image img;
        
        @Override
        public void paint(Graphics g){
            img = new ImageIcon(getClass().getResource("/img/wallrest.png")).getImage();
            g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
