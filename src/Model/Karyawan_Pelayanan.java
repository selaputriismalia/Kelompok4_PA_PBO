/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SELLA
 */
final public class Karyawan_Pelayanan extends Karyawan {
    private String Username;
    private String Password;

    public Karyawan_Pelayanan(String ID_Kar, String Nama_Karyawan, String Devisi, int Nomor_Tlpn, String Alamat, String ID_Kar_kep, String Username, String Password) {
        super(ID_Kar, Nama_Karyawan, Devisi, Nomor_Tlpn, Alamat, ID_Kar_kep);
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
