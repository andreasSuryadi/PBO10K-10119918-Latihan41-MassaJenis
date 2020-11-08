/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan41massajenis;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan massa jenis menggunakan 
 * getter setter
 *
 */

public class PBO10K10119918Latihan41MassaJenisKubus {
    private static int volume, massaJenis;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus objKubus = new Kubus();
        
        System.out.println("====Massa Jenis Kubus====");
        objKubus.setSisi(5);
        System.out.println("Sisi : " + objKubus.getSisi());
        
        objKubus.setMassa(250);
        System.out.println("Massa : " + objKubus.getMassa());
        
        volume = objKubus.hitungVolume(objKubus.getSisi());
        massaJenis = objKubus.hitungMassaJenis(objKubus.getMassa(), volume);
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + massaJenis);
    }
    
}
