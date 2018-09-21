package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
    
   static Connection conexion= null;
   static String usuario;
   static String contraseña;
   static boolean status= false;
   
   public static Connection getConexion(){
       
       status= false;
        //jdbc:sqlserver://LAPTOP-2DEAEN9E:1433;databaseName=AgroSe [andrea on Default schema]
       String URL= "jdbc:sqlserver://LAPTOP-2DEAEN9E:1433;"
           + "databaseName=AgroSe ";
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       }catch (ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "No se pudo establecer la conexio" + e.getMessage(),
           "Error de conexion", JOptionPane.ERROR_MESSAGE);
       }
       try {
           conexion = DriverManager.getConnection(URL,Conexion.usuario, Conexion.contraseña);
           status= true;
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
           "Error de conexion", JOptionPane.ERROR_MESSAGE);
       }
       return conexion;
   }
   
   public static void setCuenta(String usuario, String contraseña){
       Conexion.usuario=usuario;
       Conexion.contraseña=contraseña;
   }
   public static boolean getStatus(){
       return status;
   }
   
}
