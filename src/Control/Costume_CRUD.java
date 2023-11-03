/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Control.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import Model.Costume;
/**
 *
 * @author SELLA
 */
final public class Costume_CRUD {

    public static Database database;

    public Costume_CRUD(Database database) {
        
        this.database = database;
    }
    
    
  final public static  String addCostumeKarakter(Costume costume) {
    String queryCostumeKarakter = "INSERT INTO `costume_karakter`(`id_costume`, `nama_karakter`, `gender`, `harga`, `ukuran`, `Jenis_Costume`, `pelayanan_id_karyawan`, `pemasok_id_karyawan` ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatement = connection.prepareStatement(queryCostumeKarakter, Statement.RETURN_GENERATED_KEYS)) {

        preparedStatement.setString(1, costume.getID_Cos());
        preparedStatement.setString(2, costume.getNamekarakter());
        preparedStatement.setString(3, costume.getGender());
        preparedStatement.setInt(4, costume.getHargaRental());
        preparedStatement.setString(5, costume.getUkuran());
        preparedStatement.setString(6, costume.getJenis_Costume());
        preparedStatement.setString(7, costume.getIdpelayan());
        preparedStatement.setString(8, costume.getIdpemasok());

        preparedStatement.executeUpdate();

    } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Data GAGAL dimasukkan ke database.", "EROR", JOptionPane.INFORMATION_MESSAGE);System.out.println("Gagal menambahkan data anime: " + e.getMessage());
    }
    return null;
}

    final public static void addAnime1(String idCostume, String namaAnime, String namaMangaka, String namaStudio) {
        String queryCostumeAnime = "INSERT INTO `anime`(`id_costume`, `nama_anime`, `nama_mangaka`, `nama_studio`) VALUES (?, ?, ?, ?)";
        try (Connection connection = database.configDB();
             PreparedStatement preparedStatement = connection.prepareStatement(queryCostumeAnime)) {

            preparedStatement.setString(1, idCostume);
            preparedStatement.setString(2, namaAnime);
            preparedStatement.setString(3, namaMangaka);
            preparedStatement.setString(4, namaStudio);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Game berhasil dimasukkan ke database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data anime GAGAL dimasukkan ke database.", "EROR", JOptionPane.INFORMATION_MESSAGE);System.out.println("Gagal menambahkan data anime: " + e.getMessage());
        }
    }

   
   
   final public static void addGame(String ID_Cos, String namaGame, String namaPerusahaan, String tipeGame) {
    String queryGame = "INSERT INTO `game`(`id_costume`, `nama_game`, `nama_perusahaan`, `tipe_game`) VALUES (?, ?, ?, ?)";
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatement = connection.prepareStatement(queryGame)) {
  
        preparedStatement.setString(1, ID_Cos);
        preparedStatement.setString(2, namaGame);
        preparedStatement.setString(3, namaPerusahaan);
        preparedStatement.setString(4, tipeGame);

      
        preparedStatement.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data Game berhasil dimasukkan ke database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data Game GAGAL dimasukkan ke database.", "EROR", JOptionPane.INFORMATION_MESSAGE);
    }
}



    final public static DefaultTableModel getAllAnime(DefaultTableModel model) {
    String query = "SELECT ck.id_costume, ck.Jenis_Costume, ck.nama_karakter, ck.gender, " +
                   "a.nama_anime, a.nama_mangaka, a.nama_studio, ck.ukuran, ck.harga " +
                   "FROM costume_karakter ck " +
                   "LEFT JOIN anime a ON ck.id_costume = a.id_costume";

    boolean isSuccess = false;

    try (Connection koneksi = database.configDB();
         PreparedStatement preparedStatement = koneksi.prepareStatement(query);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        while (resultSet.next()) {
            Object[] row = {
                resultSet.getString("id_costume"),
                resultSet.getString("Jenis_Costume"),
                resultSet.getString("nama_karakter"),
                resultSet.getString("gender"),
                resultSet.getString("nama_anime"),
                resultSet.getString("nama_mangaka"),
                resultSet.getString("nama_studio"),
                resultSet.getString("ukuran"),
                resultSet.getString("harga")
            };
            // Menambahkan data ke dalam model tabel
            model.addRow(row);
            isSuccess = true;
        }

    } catch (SQLException e) {
        System.out.println("Gagal mengambil data dari database: " + e.getMessage());
    } catch (NullPointerException ex) {
        System.out.println("Objek bernilai null: " + ex.getMessage());
    }

    if (isSuccess) {
        JOptionPane.showMessageDialog(null, "Data berhasil dimuat dari database", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database", "Error", JOptionPane.ERROR_MESSAGE);
    }
        return model;
    }



final public static DefaultTableModel getAllGame(DefaultTableModel model) {
    model.addColumn("id_costume");
    model.addColumn("Jenis_Costume");
    model.addColumn("nama_karakter");
    model.addColumn("gender");
    model.addColumn("nama_game");
    model.addColumn("nama_perusahaan");
    model.addColumn("tipe_game");
    model.addColumn("ukuran");
    model.addColumn("harga");

    String query = "SELECT ck.id_costume, ck.Jenis_Costume, ck.nama_karakter, ck.gender, " +
                   "cg.nama_game, cg.nama_perusahaan, cg.tipe_game, ck.ukuran, ck.harga " +
                   "FROM costume_karakter ck " +
                   "LEFT JOIN game cg ON ck.id_costume = cg.id_costume";
    try (Connection connection = database.configDB();
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        while (resultSet.next()) {
            Object[] row = {
                resultSet.getString("id_costume"),
                resultSet.getString("Jenis_Costume"),
                resultSet.getString("nama_karakter"),
                resultSet.getString("gender"),
                resultSet.getString("nama_game"),
                resultSet.getString("nama_perusahaan"),
                resultSet.getString("tipe_game"),
                resultSet.getString("ukuran"),
                resultSet.getInt("harga")
            };
            model.addRow(row);
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data game: " + e.getMessage());
    }

    return model;
}


final public static Costume getCostumeById(String idCostume) {
    String query = "SELECT * FROM costume_karakter WHERE id_costume = ?";
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setString(1, idCostume);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return new Costume(
                resultSet.getString("id_costume"),
                resultSet.getString("nama_karakter"),
                resultSet.getString("gender"),
                resultSet.getInt("harga"),
                resultSet.getString("ukuran"),
                resultSet.getString("Jenis_Costume"),
                resultSet.getString("pelayanan_id_karyawan"),
                resultSet.getString("pemasok_id_karyawan")
            );
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data: " + e.getMessage());
    }
    return null;
}

   final public static void updateCostume(String idCostume, int newHarga, String newUkuran) {
    String query = "UPDATE `costume_karakter` SET `harga` = ?, `ukuran` = ? WHERE `id_costume` = ?";
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setInt(1, newHarga);
        preparedStatement.setString(2, newUkuran);
        preparedStatement.setString(3, idCostume);

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Costume berhasil diperbarui!");
        } else {
            System.out.println("Costume dengan ID " + idCostume + " tidak ditemukan.");
        }
    } catch (SQLException e) {
        System.out.println("Gagal memperbarui costume: " + e.getMessage());
    }
}
   

final public static void HapusCostumeAnime(String idCostume) {
    String queryCheckAnime = "SELECT * FROM `anime` WHERE `id_costume` = ?";
    String queryCheckGame = "SELECT * FROM `game` WHERE `id_costume` = ?";
    String queryDeleteAnime = "DELETE FROM `anime` WHERE `id_costume` = ?";
    String queryDeleteGame = "DELETE FROM `game` WHERE `id_costume` = ?";
    String queryDeleteCostume = "DELETE FROM `costume_karakter` WHERE `id_costume` = ?";
    
    try (Connection connection = database.configDB();
         PreparedStatement preparedStatementCheckAnime = connection.prepareStatement(queryCheckAnime);
         PreparedStatement preparedStatementCheckGame = connection.prepareStatement(queryCheckGame);
         PreparedStatement preparedStatementDeleteAnime = connection.prepareStatement(queryDeleteAnime);
         PreparedStatement preparedStatementDeleteGame = connection.prepareStatement(queryDeleteGame);
         PreparedStatement preparedStatementDeleteCostume = connection.prepareStatement(queryDeleteCostume)) {

        preparedStatementCheckAnime.setString(1, idCostume);
        ResultSet resultSetAnime = preparedStatementCheckAnime.executeQuery();

        preparedStatementCheckGame.setString(1, idCostume);
        ResultSet resultSetGame = preparedStatementCheckGame.executeQuery();

        boolean isAnimeDeleted = false;
        boolean isGameDeleted = false;

        if (resultSetAnime.next()) {
            preparedStatementDeleteAnime.setString(1, idCostume);
            int rowsAffectedAnime = preparedStatementDeleteAnime.executeUpdate();
            isAnimeDeleted = (rowsAffectedAnime > 0);}

        if (resultSetGame.next()) {
            preparedStatementDeleteGame.setString(1, idCostume);
            int rowsAffectedGame = preparedStatementDeleteGame.executeUpdate();
            isGameDeleted = (rowsAffectedGame > 0);
        }

        preparedStatementDeleteCostume.setString(1, idCostume);
        int rowsAffectedCostume = preparedStatementDeleteCostume.executeUpdate();

        if (rowsAffectedCostume > 0 || isAnimeDeleted || isGameDeleted) {
            System.out.println("Data di tabel Anime/Game dan Costume berhasil dihapus!");
            JOptionPane.showMessageDialog(null, "Data dengan ID " + idCostume + " berhasil dihapus dari database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Data dengan ID " + idCostume + " tidak ditemukan.");
            JOptionPane.showMessageDialog(null, "Data dengan ID " + idCostume + " tidak ditemukan dalam database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        System.out.println("Gagal menghapus data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

final public static DefaultTableModel getAllCostumes() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("id_costume");
    model.addColumn("Jenis_Costume");
    model.addColumn("nama_karakter");
    model.addColumn("gender");
    model.addColumn("nama_anime");
    model.addColumn("nama_mangaka");
    model.addColumn("nama_studio");
    model.addColumn("nama_game");
    model.addColumn("nama_perusahaan");
    model.addColumn("tipe_game");
    model.addColumn("ukuran");
    model.addColumn("harga");

    String query = "SELECT ck.id_costume, ck.Jenis_Costume, ck.nama_karakter, ck.gender, " +
                   "a.nama_anime, a.nama_mangaka, a.nama_studio, " +
                   "cg.nama_game, cg.nama_perusahaan, cg.tipe_game, ck.ukuran, ck.harga " +
                   "FROM costume_karakter ck " +
                   "LEFT JOIN anime a ON ck.id_costume = a.id_costume " +
                   "LEFT JOIN game cg ON ck.id_costume = cg.id_costume";

    try (Connection connection = database.configDB();
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        while (resultSet.next()) {
            Object[] row = {
                resultSet.getString("id_costume"),
                resultSet.getString("Jenis_Costume"),
                resultSet.getString("nama_karakter"),
                resultSet.getString("gender"),
                resultSet.getString("nama_anime"),
                resultSet.getString("nama_mangaka"),
                resultSet.getString("nama_studio"),
                resultSet.getString("nama_game"),
                resultSet.getString("nama_perusahaan"),
                resultSet.getString("tipe_game"),
                resultSet.getString("ukuran"),
                resultSet.getInt("harga")
            };
            model.addRow(row);
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil data costume: " + e.getMessage());
    }

    return model;
}
}

    