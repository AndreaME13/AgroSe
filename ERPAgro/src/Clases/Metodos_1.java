/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andi_
 */
public class Metodos_1 {
     String conexionURL;
    Connection con = null;
    Statement stn = null;
    ResultSet rs = null;
    String cadenaSQL;
    public Metodos_1() {
        conexionURL = "jdbc:sqlserver:"
                + "//LAPTOP-2DEAEN9E:1433;"
                + "databaseName=AgroSe;"
                + "user=andrea;password=12345";
    }
    public void abreConexion(){
        try {
            con=DriverManager.getConnection(conexionURL);
            
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void cierraConexion(){
        try{
            con.close();
            JOptionPane.showMessageDialog(null,"Adios");
        }
        catch (SQLException ex ){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
   }
    
    
//----------------------------------------------------Unidades Trasnporte
   
    public void inserta( Object datos[]) {
         cadenaSQL = "execute sp_UTransporte_insertar "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"','"
            + datos[3]+"',"
            + datos[4]+","
            + datos[5]+"";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos Ingresados" );
        }
    }
 
    public void actualiza1(Object datos[]){
        cadenaSQL = "execute sp_UTransporte_modificar "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"','"
            + datos[3]+"',"
            + datos[4]+","
            + datos[5]+"";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        }
    } 
    
    public void eliminar(int no) throws SQLException{				
        cadenaSQL = "execute sp_UTransporte_eliminar " + no  ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "cliente eliminado");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "cliente eliminado");
    }
    }
   
            
   
    public void consultaTransporte(JTable tabla) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL = " Select *From ventas.unidadesTransporte" ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            while (rs.next()) {
                String idUTransp = rs.getString("idUnidadTransporte");
                String placas = rs.getString("placas");
                String marca= rs.getString("marca");
                String modelo= rs.getString("modelo");
                String año= rs.getString("anio");
                String capacidad= rs.getString("capacidad");
               
                
                Object datosRenglon[] = {idUTransp,placas,marca,modelo,año,capacidad};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro");
        }
    }
    
    
 //-------------------------------------------------------Asociasiones
    
  public void insertarAsocion( Object datos[]) {
         cadenaSQL = "execute sp_add_Insertar "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"'";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos Ingresados" );
        }
    }
 
    public void actualizaAsocion(Object datos[]){
        cadenaSQL = "execute sp_add_ConsulatarDatos "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"'";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados");
        }
    } 
    public void eliminarAsocion(int no) throws SQLException{				
        cadenaSQL = "execute sp_add_EliminarDatos " + no  ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "cliente eliminado");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "cliente eliminado");
    }
    }
   
    public void consultaAsocion( JTable tabla) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL = " Select *From ventas.asociaciones  ";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            while (rs.next()) {
                String idAsocia = rs.getString("idAsociacion");
                String nombre = rs.getString("nombre");
                String estatus= rs.getString("estatus");
                
                
                Object datosRenglon[] = {idAsocia,nombre,estatus};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro");
        }
    }
    
 //-------------------------------------------------------Cultivos
     
public void insertaCultivo( Object datos[]) {
         cadenaSQL = "execute SP_insertaCultivo"
            + datos[0]+",'"
            + datos[1]+"',"
            + datos[2]+",'"
            + datos[3]+"'";
            
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            //rs = stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Ingresados" );
        }
    }
     public void consultaCultivos(JTable tabla) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL = " Select *From ventas.cultivos " ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            while (rs.next()) {
                String idCultivo = rs.getString("idCultivo");
                String nombre = rs.getString("nombre");
                String costoAsesoria= rs.getString("costoAsesoria");
                String estatus= rs.getString("estatus");
               
                
                Object datosRenglon[] = {idCultivo,nombre,costoAsesoria,estatus};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro");
        }
    }
     public void actualizaCultivo(Object datos[]){
        cadenaSQL = "execute SP_actualizaCultivo "
            + datos[0]+",'"
            + datos[1]+"',"
            + datos[2]+",'"
            + datos[3]+"'"
            ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados");
        }
    } 
    public void EliminarCultivo(int no) throws SQLException{				
        cadenaSQL = "execute SP_eliminarCultivo " + no  ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "cliente eliminado");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "cliente eliminado");
        }
    }
   //-----------------------------------------------------Clientes
    public void insertaCliente( Object datos[]) {
         cadenaSQL = "execute insertarCliente "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"',"
            + datos[3]+",'"
            + datos[4]+"',"
            + datos[5]+",'"
            + datos[6]+"',"
            + datos[7]+",'"
            + datos[8]+"','"
            + datos[9]+"',"
            + datos[10]+"";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Ingresados");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos Ingresados" );
        }
    }
//    public boolean buscarUsuario(String idCliente,JTable tabla) throws SQLException{
//         DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
//        cadenaSQL = "execute sp_Usuarios_buscar"
//            + ""+ idCliente+ "";
//            
//           try {
//            con=DriverManager.getConnection(conexionURL);
//            stn = (Statement) con.createStatement();
//            rs= stn.executeQuery(cadenaSQL);
//            if(rs.next()){
//                String idClient = rs.getString("idCliente");
//                String nombre = rs.getString("nombre");
//                String rSocial= rs.getString("razonSocial");
//                String limCredito= rs.getString("limiteCredito");
//                String Direccion= rs.getString("direccion");
//                String CcodPos= rs.getString("codigoPostal");
//                String rfc= rs.getString("rfc");
//                String telefono= rs.getString("telefono");
//                String Descripcion= rs.getString("email");
//                String tipo= rs.getString("tipo");
//                String idCiudad= rs.getString("idCiudad");
//                
//                Object datosRenglon[] = {idCliente,nombre,rSocial,limCredito,Direccion,CcodPos,rfc,telefono,Descripcion,tipo,idCiudad};
//                tablaTemp.addRow(datosRenglon);
//            } 
//            JOptionPane.showMessageDialog(null, "Busqueda correcta");
//        } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null,"No se encontro el Usuario"+ ex.getMessage());
//        }
//        return false;
//    }
    public void actualiza(Object datos[]){
        cadenaSQL = "execute actualizaClientes "
            + datos[0]+",'"
            + datos[1]+"','"
            + datos[2]+"',"
            + datos[3]+",'"
            + datos[4]+"',"
            + datos[5]+",'"
            + datos[6]+"',"
            + datos[7]+",'"
            + datos[8]+"','"
            + datos[9]+"',"
            + datos[10]+"";
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados");
        }
    } 
    public void EliminarCliente(int no) throws SQLException{				
        cadenaSQL = "execute eliminarClientes " + no  ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs=stn.executeQuery(cadenaSQL);
            JOptionPane.showMessageDialog(null, "cliente eliminado");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "cliente eliminado");
    }
    }
   
            
   
    
    public void consultaCliente(JTable tabla) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tabla.getModel();
        cadenaSQL = " Select *From ventas.clientes " ;
        try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs = stn.executeQuery(cadenaSQL);
            while (rs.next()) {
                String idClient = rs.getString("idCliente");
                String nombre = rs.getString("nombre");
                String rSocial= rs.getString("razonSocial");
                String limCredito= rs.getString("limiteCredito");
                String Direccion= rs.getString("direccion");
                String CcodPos= rs.getString("codigoPostal");
                String rfc= rs.getString("rfc");
                String telefono= rs.getString("telefono");
                String Descripcion= rs.getString("email");
                String tipo= rs.getString("tipo");
                String idCiudad= rs.getString("idCiudad");
                
                Object datosRenglon[] = {idClient,nombre,rSocial,limCredito,Direccion,CcodPos,rfc,telefono,Descripcion,tipo,idCiudad};
                tablaTemp.addRow(datosRenglon);
            }
            tabla.setModel(tablaTemp);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro");
        }
    }
     public boolean buscarUsuario(String Nombre, String Contraseña) throws SQLException{
        cadenaSQL = "execute sp_Usuarios_buscar "
            + "'"+ Nombre+"',"
            + "'"+ Contraseña+"'";
           try {
            con=DriverManager.getConnection(conexionURL);
            stn = (Statement) con.createStatement();
            rs= stn.executeQuery(cadenaSQL);
            if(rs.next()){
                return true;
            } 
            JOptionPane.showMessageDialog(null, "Busqueda correcta");
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"No se encontro el usuario"+ ex.getMessage());
        }
        return false;
    }
     String Nombre;
    String Contraseña;
        
    
    public Metodos_1(String Nombre, String Contraseña) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
    }
            
    public String setNombre(String Nombre){
        return this.Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    
    public String setContraseña(String Contraseña){
        return this.Contraseña;
    }
    public String getContraseña(){
        return Contraseña;
    } 
}