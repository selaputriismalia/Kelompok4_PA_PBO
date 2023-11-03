/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import static Control.Costume_CRUD.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Karyawan;
import javax.swing.JOptionPane;
import Control.Database;
import Model.Karyawan_Pelayanan;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SELLA
 */
final public class CRUD_Admin {
    public static Database database;

    public CRUD_Admin(Database database) {
        
        this.database = database;
    }
    final public void tambahKaryawan(Karyawan karyawan) {
        String query = "INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `devisi`, `nomor_tlpn`, `alamat`, `karyawan_id_karyawan`) VALUES (?, ?, ?, ?, ?, ?)";

        try {Connection connection = database.configDB();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, karyawan.getID_Kar());
            preparedStatement.setString(2, karyawan.getNama_Karyawan());
            preparedStatement.setString(3, karyawan.getDevisi());
            preparedStatement.setDouble(4, karyawan.getNomor_Tlpn());
            preparedStatement.setString(5, karyawan.getAlamat());
            preparedStatement.setString(6, karyawan.getID_Kar_kep());
            
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data karyawan berhasil ditambahkan ke database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menambahkan data karyawan ke database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data karyawan ke database. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    final public void addPelayanan(Karyawan_Pelayanan karyawanPelayanan) {
            String query = "INSERT INTO `pelayanan` (`id_karyawan`, `username`, `password`) VALUES (?, ?, ?)";

        try (Connection connection = database.configDB();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, karyawanPelayanan.getID_Kar());
            preparedStatement.setString(2, karyawanPelayanan.getUsername());
            preparedStatement.setString(3, karyawanPelayanan.getPassword());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data pelayanan berhasil ditambahkan ke database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menambahkan data pelayanan ke database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data pelayanan ke database. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
final public void getAllKaryawan(DefaultTableModel model) {
    String query = "SELECT k.id_karyawan, k.nama_karyawan, k.devisi, k.nomor_tlpn, k.alamat, k.karyawan_id_karyawan, p.username, p.password " +
                   "FROM karyawan k LEFT JOIN pelayanan p ON k.id_karyawan = p.id_karyawan";
    
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatement = connection.prepareStatement(query);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        while (resultSet.next()) {
            Object[] row = {
                    resultSet.getString("id_karyawan"),
                    resultSet.getString("nama_karyawan"),
                    resultSet.getString("devisi"),
                    resultSet.getString("nomor_tlpn"), // Menggunakan getString() untuk nomor telepon
                    resultSet.getString("alamat"),
                    resultSet.getString("karyawan_id_karyawan"),
                    resultSet.getString("username"),
                    resultSet.getString("password")
            };
            model.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Data berhasil dimuat dari database", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data dari database: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

  
    final public static void HapusKaryawan(String idKaryawan) {
        String queryCheckPelayanan = "SELECT * FROM pelayanan WHERE id_karyawan = ?";
        String queryCheckKaryawan = "SELECT * FROM karyawan WHERE id_karyawan = ?";
        String queryDeletePelayanan = "DELETE FROM pelayanan WHERE id_karyawan = ?";
        String queryDeleteKaryawan = "DELETE FROM karyawan WHERE id_karyawan = ?";
        
        try (Connection connection = database.configDB();
             PreparedStatement preparedStatementCheckPelayanan = connection.prepareStatement(queryCheckPelayanan);
             PreparedStatement preparedStatementCheckKaryawan = connection.prepareStatement(queryCheckKaryawan);
             PreparedStatement preparedStatementDeletePelayanan = connection.prepareStatement(queryDeletePelayanan);
             PreparedStatement preparedStatementDeleteKaryawan = connection.prepareStatement(queryDeleteKaryawan)) {

            preparedStatementCheckPelayanan.setString(1, idKaryawan);
            ResultSet resultSetPelayanan = preparedStatementCheckPelayanan.executeQuery();

            boolean isPelayananDeleted = false;

            if (resultSetPelayanan.next()) {
                preparedStatementCheckKaryawan.setString(1, idKaryawan);
                ResultSet resultSetKaryawan = preparedStatementCheckKaryawan.executeQuery();

                if (resultSetKaryawan.next()) {
                    preparedStatementDeletePelayanan.setString(1, idKaryawan);
                    int rowsAffectedPelayanan = preparedStatementDeletePelayanan.executeUpdate();
                    isPelayananDeleted = (rowsAffectedPelayanan > 0);
                } else {
                    System.out.println("Data dengan ID " + idKaryawan + " tidak ditemukan di database.");
                    JOptionPane.showMessageDialog(null, "Data dengan ID " + idKaryawan + " tidak ditemukan di database.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            if (isPelayananDeleted) {
                preparedStatementDeleteKaryawan.setString(1, idKaryawan);
                int rowsAffectedKaryawan = preparedStatementDeleteKaryawan.executeUpdate();

                if (rowsAffectedKaryawan > 0) {
                    System.out.println("Data berhasil didatabse dihapus!");
                    JOptionPane.showMessageDialog(null, "Data dengan ID " + idKaryawan + " berhasil dihapus dari database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("Gagal menghapus data dari tabel Karyawan.");
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data dari tabel Karyawan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    final public Karyawan getKaryawanByID(String idKaryawan) {
        String query = "SELECT * FROM karyawan WHERE id_karyawan = ?";
        try (Connection connection = database.configDB();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idKaryawan);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("id_karyawan");
                String nama = resultSet.getString("nama_karyawan");
                String devisi = resultSet.getString("devisi");
                String nomorTlpn = resultSet.getString("nomor_tlpn");
                String alamat = resultSet.getString("alamat");
                String karyawanId = resultSet.getString("karyawan_id_karyawan");

                return new Karyawan(id, nama, devisi, (int) Double.parseDouble(nomorTlpn), alamat, karyawanId);
            } else {
              
                JOptionPane.showMessageDialog(null, "Data dengan ID " + idKaryawan + " tidak ditemukan.", "Notifikasi", JOptionPane.INFORMATION_MESSAGE);
                return null;
            }
        } catch (SQLException e) {
        
            JOptionPane.showMessageDialog(null, "Gagal mengambil data karyawan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null; 
        }
    }
}







