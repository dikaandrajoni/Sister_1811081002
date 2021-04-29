/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081002;

import java.io.Serializable;

/**
 *
 * @author USER DSC
 */
public class Pesan_1811081002 implements Serializable{
    private String Nama;
    private String Pesan;

    @Override
    public String toString() {
        return "["+Nama+"] "+Pesan; //To change body of generated methods, choose Tools | Templates.
    }

    public Pesan_1811081002(String Nama, String Pesan) {
        this.Nama = Nama;
        this.Pesan = Pesan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getPesan() {
        return Pesan;
    }

    public void setPesan(String Pesan) {
        this.Pesan = Pesan;
    }
    
    
    
    
}
