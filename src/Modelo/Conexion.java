
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    Connection con;
    public Connection Conectar(){
        String Url="jdbc:mysql://localhost:3306/proyecto-formativo";
        String user="root";
        String pass="";
        try{
            Class.forName("com.mysql.jdbc.Drive");
            con=DriverManager.getConnection(Url,user,pass);
        }catch (ClassNotFoundException | SQLException e ){    
        }
       return con;
    }
       
}
