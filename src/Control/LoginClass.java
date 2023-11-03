/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Control.Database;
import View.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SELLA
 */
final public class LoginClass {
    final public static boolean checkLogin(String username, String password) {
        String sql = "SELECT * FROM pelayanan WHERE Username = ? AND Password = ?";
        boolean isValidLogin = true;
        
        try (Connection conn = Database.configDB();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password);

            try (ResultSet rs = pst.executeQuery()) {
                isValidLogin = rs.next(); // Set isValidLogin menjadi true jika ada hasil dari query
            }
        } catch (SQLException e) {
            System.err.println("Kesalahan saat memeriksa login: " + e.getMessage());
        }
        
        return isValidLogin;
    }
}
