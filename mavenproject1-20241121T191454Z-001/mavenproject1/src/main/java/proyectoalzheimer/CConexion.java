/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoalzheimer;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author INTEL
 */
public class CConexion {
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasenia= "123";
    String bd="Aplicacion_Alzheimer";
    String ip="localhost";
    String puerto="1433";
    
    String cadena= "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    public Connection establecerConexion(){
        try{
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd+";"+"encrypt=true"+";"+"trustServerCertificate=true;";
            conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos"+ e.toString());
        }
        return conectar;
    }
}
