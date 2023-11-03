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
public class Costume {

    final private  String ID_Cos;
    final private String namekarakter;
    final private String Gender;
    private int HargaRental;
    private String Ukuran;
    final private String Jenis_Costume;
    final private String idpelayan;
    final private String idpemasok;
   

    public Costume(String ID_Cos, String namekarakter, String Gender, int HargaRental, String Ukuran, String Jenis_Costume, 
            String idpelayan, String idpemasok) {
        this.ID_Cos = ID_Cos;
        this.namekarakter = namekarakter;
        this.Gender = Gender;
        this.HargaRental = HargaRental;
        this.Ukuran = Ukuran;
        this.Jenis_Costume = Jenis_Costume;
        this.idpelayan = idpelayan;
        this.idpemasok = idpemasok;}
    
    final public String getJenis_Costume() {
        return Jenis_Costume;}
    final public String getID_Cos() {
        return ID_Cos;}
    final public String getNamekarakter() {
        return namekarakter;}
    final public String getGender() {
        return Gender;}
    final public int getHargaRental() {
        return this.HargaRental;}
    final public void setHargaRental(int HargaRental) {
        this.HargaRental = HargaRental;}
    final public String getUkuran() {
        return Ukuran;}
    final public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;}
    final public String getIdpemasok() {
        return idpemasok;}
    final public String getIdpelayan() {
        return idpelayan;}
}
