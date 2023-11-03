/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SELLA
 */
final public class Costume_Game extends Costume{
    final private  String namaGame;
    final private  String namaPerusahaan;
    final private  String tipeGame;

    public Costume_Game(String ID_Cos, String namekarakter, String Gender, int HargaRental, String Ukuran, String Jenis_Costume, String idpemasok, String idpelayan, String namaGame, String namaPerusahaan, String tipeGame) {
        super(ID_Cos, namekarakter, Gender, HargaRental, Ukuran, Jenis_Costume, idpemasok, idpelayan);
        this.namaGame = namaGame;
        this.namaPerusahaan = namaPerusahaan;
        this.tipeGame = tipeGame;}

    public String getNamaGame() {
        return namaGame;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getTipeGame() {
        return tipeGame;
    }
    
} 

