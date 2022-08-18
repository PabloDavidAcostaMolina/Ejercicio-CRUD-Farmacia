/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class Conexion {
    
    Connection conectar = null;
    
    public Connection conectar(){
        
        try{
           Class.forName("org.sqlite.JDBC");
           conectar = DriverManager.getConnection("jdbc:sqlite:Almacenes.db");
            
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
        
        return conectar;
    }
    
    public void desconectar(Connection conectar){
        
        //Cerrar la conexión
    
        if (conectar != null) { // Si hay conexión a la BD
            try {
                conectar.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    
}
