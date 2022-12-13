/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan4.kendaraan;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Kendaraan {
    //atribut
    String nama;
    int jmlRoda;
    
    //method
    public void Kendaraan(){
        System.out.println("Mesin " + nama + " Telah dinyalakan!");
    }   
    
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jml Roda : " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo(){
        
    }
}
