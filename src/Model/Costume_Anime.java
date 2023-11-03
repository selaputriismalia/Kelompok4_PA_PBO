/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author SELLA
 */
final public class Costume_Anime extends Costume {
    final private  String namaAnime;
    final private  String namaMangaka;
    final private  String studio;

    public Costume_Anime(String ID_Cos, String namekarakter, String Gender, int HargaRental, String Ukuran, String Jenis_Costume, 
            String idpemasok, String idpelayan, String namaAnime, String namaMangaka, String studio) {
        super(ID_Cos, namekarakter, Gender, HargaRental, Ukuran, Jenis_Costume, idpemasok, idpelayan);
        this.namaAnime = namaAnime;
        this.namaMangaka = namaMangaka;
        this.studio = studio;
    }

    final public String getNamaAnime() {
        return namaAnime;
    }

    final public String getNamaMangaka() {
        return namaMangaka;
    }

    final public String getStudio() {
        return studio;
    }   
}