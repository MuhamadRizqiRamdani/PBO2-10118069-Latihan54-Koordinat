/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan54.koordinat;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : koordinat
 */
public class WarnaKoordiinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordiinat(int x, int y, String namaWarna){
        super(x, y);
        this.x = x;
        this.y = y;
        this.namaWarna = namaWarna;        
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
    
}
