/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan4.kendaraan;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Mobil extends Kendaraan{
    int maxGear;
    
    public void belok (String arah){
        System.out.println("\nMobil " + nama + " belok ke " + arah + "!");
    }
    
    public void belok (){
        System.out.println("Error : Mohon masukkan arah");
    }
    
    public void extraInfo(){
        System.out.println("Max Gear : " + maxGear);
    }
}
