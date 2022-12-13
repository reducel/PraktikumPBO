/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan4.tugas;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Penyakit {
    String nama;
    String gejala;
    int durasi;
    
    public void Penyakit(){
        System.out.println("Kamu terdiagnosa " + nama + " harap ke dokter");
    }
    
    public void showInfo(){
        System.out.println("Nama penyakit : " +nama);
        System.out.println("Gejala : " + gejala );
        System.out.println("Perkiraan sembuh : " + durasi + " hari");
    }
    
    public void extraInfo(){
        
    }
}
