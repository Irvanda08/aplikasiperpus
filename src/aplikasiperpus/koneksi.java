/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiperpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import static projek.Projek.MySQLConfig;

public class koneksi {
    private static Connection connect;
    
    public static Connection getKoneksi(){
        if(connect == null){
      try {
            String url = "jdbc:mysql://localhost:/perpustakaan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connect = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database Gagal" + e.getMessage());
        }
        
        }return connect;
    }
}
