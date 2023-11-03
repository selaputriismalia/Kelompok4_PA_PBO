/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SELLA
 */
public class Karyawan {
    private final String ID_Kar;
    private final String Nama_Karyawan;
    private final String Devisi;
    private int Nomor_Tlpn;
    private String Alamat;
    private final String ID_Kar_kep;

    public Karyawan(String ID_Kar, String Nama_Karyawan, String Devisi, int Nomor_Tlpn, String Alamat,  String ID_Kar_kep) {
        this.ID_Kar = ID_Kar;
        this.Nama_Karyawan = Nama_Karyawan;
        this.Devisi = Devisi;
        this.Nomor_Tlpn = Nomor_Tlpn;
        this.Alamat = Alamat;
        this.ID_Kar_kep = ID_Kar_kep;
    }

//    public Karyawan(String string, String string0, String string1, double aDouble, String string2, String string3, String string4, String string5) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public String getID_Kar_kep() {
        return ID_Kar_kep;
    }

    final public String getID_Kar() {
        return ID_Kar;
    }

    final public String getNama_Karyawan() {
        return Nama_Karyawan;
    }

    final public String getDevisi() {
        return Devisi;
    }

    final public double getNomor_Tlpn() {
        return Nomor_Tlpn;
    }

    final public String getAlamat() {
        return Alamat;
    }

    final public void setNomor_Tlpn(int Nomor_Tlpn) {
        this.Nomor_Tlpn = Nomor_Tlpn;
    }

    final public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

//    public abstract void tampilan();
}