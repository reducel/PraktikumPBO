/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan3.tugas;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Main {
    public static void main(String[] args) {
        //membuat objek
        Alfa satu = new Alfa("Alfa", 19, "Game", 171, 57);
        
        satu.showProfile();
        
        //menggunakan method getter and setter
        System.out.println("Tinggi satu tahun lalu :" + satu.getTinggi());
        satu.setTinggi(173);
        System.out.println("Tinggi sekarang :" + satu.getTinggi());
        
        //fungsi untuk mencari berat ideal
        double beratt = (satu.getTinggi() - 100) - (0.15 * (satu.getTinggi() - 100));
        
        System.out.println("Berat ideal Alfa adalah " + beratt);
        System.out.println();
        
        //inheritance : Pewarisan
        Coba berat = new Coba();
        System.out.println("Apakah Berat Sudah ideal -> " + (berat instanceof Coba));
    }
}
