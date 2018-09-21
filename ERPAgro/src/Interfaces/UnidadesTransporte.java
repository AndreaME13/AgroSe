package Interfaces;


import Clases.Metodos_1;
import Conexiones.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Cervantes
 */
public class UnidadesTransporte extends javax.swing.JFrame {
Metodos_1 conexion;
    /**
     * Creates new form UnidadesTransporte
     */
    public UnidadesTransporte() {
        initComponents();
      
        conexion = new Metodos_1();
        conexion.abreConexion();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdUnidadTransporte = new javax.swing.JTextField();
        txtPlacas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUnidaTransporte = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtAño1 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Unidades de Transporte");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id UnidadTransporte");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Modelo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 80, 30));

        txtIdUnidadTransporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdUnidadTransporteKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdUnidadTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 30));

        txtPlacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacasKeyTyped(evt);
            }
        });
        getContentPane().add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Marca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, -1));

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 220, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Año ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 60, 26));

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Capacidad ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 100, 25));

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 110, 30));

        btnCancelar.setBackground(new java.awt.Color(102, 204, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 100, 40));

        btnAgregar.setBackground(new java.awt.Color(102, 204, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 100, 40));

        btnConsultar.setBackground(new java.awt.Color(102, 204, 255));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 100, 40));

        btnModificar.setBackground(new java.awt.Color(102, 204, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 110, 40));

        btnEliminar.setBackground(new java.awt.Color(102, 204, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 100, 40));

        tablaUnidaTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UnidadTransporte", "Placas", "Marca", "Modelo", "Año", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUnidaTransporte);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 670, 150));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Placas ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, 25));

        txtAño1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAño1KeyTyped(evt);
            }
        });
        getContentPane().add(txtAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 110, 30));

        btnSalir.setBackground(new java.awt.Color(0, 204, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 100, 40));

        btnActualizar1.setBackground(new java.awt.Color(102, 204, 255));
        btnActualizar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar1.setText("Actualizar ");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 110, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
         Object datos[]={
         Integer.valueOf(txtIdUnidadTransporte.getText()),
         txtPlacas.getText(),
         txtMarca.getText(),
         txtModelo.getText(),
         Integer.valueOf(txtAño1.getText()),
         Integer.valueOf(txtCapacidad.getText())};
        conexion.inserta(datos);
        
        
        
        
       
        txtMarca.setText(" ");
        txtAño1.setText(" ");
        txtPlacas.setText(" ");
        txtCapacidad.setText(" ");
        txtModelo.setText(" ");
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "No se puede completar la operacion" );
         }
         
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       try {
            borrarTabla();
            conexion.consultaTransporte(tablaUnidaTransporte);
          
        } catch (Exception e) {
            System.out.println("No hay registros"+ e);
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila=tablaUnidaTransporte.getSelectedRow();
        if(fila>=0){
            txtIdUnidadTransporte.setText(tablaUnidaTransporte.getValueAt(fila, 0).toString());
            txtPlacas.setText(tablaUnidaTransporte.getValueAt(fila, 1).toString());
            txtMarca.setText(tablaUnidaTransporte.getValueAt(fila, 2).toString());
            txtModelo.setText(tablaUnidaTransporte.getValueAt(fila, 3).toString());
            txtAño1.setText(tablaUnidaTransporte.getValueAt(fila, 4).toString());
            txtCapacidad.setText(tablaUnidaTransporte.getValueAt(fila, 5).toString());
           
        
        }else{
            JOptionPane.showMessageDialog(null,"Fila no seleccionada");
        }
        
        
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //conexion.Eliminar(Integer.valueOf(txtIdUnidadTransporte.getText())); 
                                                
       int row= tablaUnidaTransporte.getSelectedRow();
       if(row>=0){
       txtIdUnidadTransporte.setText(tablaUnidaTransporte.getValueAt(row, 0).toString());
       }
       int opt=JOptionPane.showConfirmDialog(this,"Estas seguro que desea eliminar este registro","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(opt==JOptionPane.YES_OPTION){
           
            try{
                conexion.eliminar(Integer.valueOf(txtIdUnidadTransporte.getText()));
                
                 
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
                
            
     }else{JOptionPane.showMessageDialog(null, "No ha sido eliminado");}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtIdUnidadTransporte.setText(" ");
        txtMarca.setText(" ");
        txtAño1.setText(" ");
        txtPlacas.setText(" ");
        txtCapacidad.setText(" ");
        txtModelo.setText(" ");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Menu menu= new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIdUnidadTransporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUnidadTransporteKeyTyped
        char c= evt.getKeyChar();
        if(c<'1'||c>'9')evt.consume();
        if(txtIdUnidadTransporte.getText().length() >=4){
            evt.consume();   
        }
    }//GEN-LAST:event_txtIdUnidadTransporteKeyTyped

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
    //      if(txtIdUnidadTransporte.getText()==null)
        try{
    Object datos[]= new Object[6];
        datos[0] = Integer.parseInt(txtIdUnidadTransporte.getText());      
        datos[1] = txtPlacas.getText();
        datos[2] = txtMarca.getText();
        datos[3] = txtModelo.getText();
        datos[4] = Integer.parseInt(txtAño1.getText());
        datos[5] = Integer.parseInt(txtCapacidad.getText());
        conexion.actualiza1(datos);
         
       } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"No se puede completar la operacion");
            }
       
       txtIdUnidadTransporte.setText(" ");
        txtMarca.setText(" ");
        txtAño1.setText(" ");
        txtPlacas.setText(" ");
        txtCapacidad.setText(" ");
        txtModelo.setText(" ");
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void txtAño1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAño1KeyTyped
    char c= evt.getKeyChar();
        if(c<'1'||c>'9')evt.consume();
         if(txtAño1.getText().length() >=4){
            evt.consume();   
        }
    }//GEN-LAST:event_txtAño1KeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
    char c= evt.getKeyChar();
        if(c<'1'||c>'9')evt.consume();
         if(txtCapacidad.getText().length() >=2){
            evt.consume();   
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
     char c= evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' '))evt.consume();
         if(txtMarca.getText().length() >=80){
            evt.consume();   
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' '))evt.consume(); 
         if(txtModelo.getText().length() >=80){
            evt.consume();   
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtPlacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyTyped
    if(txtPlacas.getText().length() >=10){
            evt.consume();   
        }
    }//GEN-LAST:event_txtPlacasKeyTyped

    public void borrarTabla() {
        try {
            DefaultTableModel tabT = (DefaultTableModel) tablaUnidaTransporte.getModel();
            for (int i = tabT.getRowCount() - 1; i > -1; i--) {
                tabT.removeRow(i);
            }
        } catch (Exception e) {
        }
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
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadesTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUnidaTransporte;
    private javax.swing.JTextField txtAño1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtIdUnidadTransporte;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables
}