/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author AKBAR ALFARIZI
 */
public class sepatu {
    String merk;
    String warna;
    String bahan;
    String size;
    String madein;
    
    void CetakInfo(){
        System.out.println("-----------------------");
        System.out.println("Nama   : "+merk );
        System.out.println("Warna  : "+warna );
        System.out.println("Bahan  : "+bahan );
        System.out.println("Size   : "+size );
        System.out.println("MadeIn : "+madein );
        System.out.println("-----------------------");
        
    }
    
    double penjelasanKeterangan(){
        double keterangan;
        keterangan=size+madein;
        return keterangan;
    }
    void cetakKeterangan(){
        System.out.println("Keterangan adalah : " + penjelasanKeterangan());
        jalan.cetakKeterangan;
    }
}