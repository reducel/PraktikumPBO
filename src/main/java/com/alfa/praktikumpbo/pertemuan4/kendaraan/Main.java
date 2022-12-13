package com.alfa.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    //main + tab
    public static void main(String[] args) {
        //membuat objek
        Mobil hehe = new Mobil();
        Kendaraan hehi = new Kendaraan();
        Motor ayo = new Motor();
        
        //memasukkan nilai ke atribut
        hehe.nama = "Avanza";
        hehe.jmlRoda = 10;
        hehe.maxGear = 12;
        
        hehi.nama = "Kendaraan doraemon";
        hehi.jmlRoda = 20;
        
        ayo.nama = "Honda";
        ayo.jmlRoda = 2;
        ayo.shockbreaker = "Mampu meredam";
        
        //memanggil method 
        hehe.Kendaraan();
        hehe.showInfo();
        hehe.belok("kiri");
        hehe.belok();
        hehe.extraInfo();
        
        System.out.println();
        hehi.showInfo();
        
        System.out.println();
        ayo.showInfo();
        ayo.melaju("melaju");
        ayo.extraInfo();
    }
}
