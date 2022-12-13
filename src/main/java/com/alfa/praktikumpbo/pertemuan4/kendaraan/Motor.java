/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan4.kendaraan;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Motor extends Kendaraan {
    String shockbreaker;
    
    public void melaju(String keadaan){
        System.out.println("Kendaraan " + nama + " sedang " + keadaan);
        
    }
    
    public void extraInfo(){
        System.out.println("Shockbreaker " + shockbreaker);
    }
}
