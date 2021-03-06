package Interfaces;

import Clases.Metodos_1;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.AccessibleRole.MENU;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Cervantes
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        btnIniciaSesion = new javax.swing.JButton();
        txfContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Usuario ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 54, -1));

        jLabel3.setText("Contraseña ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 114, 30));

        btnIniciaSesion.setText("Iniciar Sesion");
        btnIniciaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciaSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 114, -1));
        getContentPane().add(txfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 110, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_img.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnIniciaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciaSesionActionPerformed
     //Conexiones.Conexion.setCuenta(txtUsuario.getText(), txtContraseña.getText());
        //Conexiones.Conexion.getConexion();
       
        //if(Conexiones.Conexion.getStatus()){
        //Menu menu= new Menu();
        //menu.setVisible(true);
        //}else{
        //    JOptionPane.showMessageDialog(null, "Usuario y Contraseña incorrectos" ,"Error de conexion",JOptionPane.ERROR_MESSAGE);
        //    txtUsuario.setText("");
        //    txtContraseña.setText("");
            
        //}
        String nom = txfNombre.getText();
        String pass = txfContraseña.getText();
        Metodos_1 buscar=new Metodos_1();
        buscar.setNombre(nom);
        buscar.setContraseña(pass);
        
        
            try {
                if (buscar.buscarUsuario(nom,pass)){
                    Menu op = new Menu();
                    op.setVisible(true);
                    op.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    txfNombre.setText("");
                    txfContraseña.setText("");
                }
            } catch (Exception ex) {
                Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_btnIniciaSesionActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciaSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txfContraseña;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
