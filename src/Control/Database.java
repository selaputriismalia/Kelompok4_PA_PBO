/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SELLA
 */
final public class Database {
     private static Connection mysqlconfig;
     static Connection con;
     static Statement stmt;

    final public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/pa_rental"; 
            String user = "root"; 
            String password = ""; 

            mysqlconfig = DriverManager.getConnection(url, user, password);
            return mysqlconfig;
        } catch (SQLException e) {
           
            throw new SQLException("Koneksi ke database gagal: " + e.getMessage(), e);
        }
    }
    
    final public static void closeConnection() {
        try {
            if (mysqlconfig != null && !mysqlconfig.isClosed()) {
                mysqlconfig.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

