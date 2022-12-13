/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan4.tugas;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Batuk extends Penyakit{
    String virus;
    
    public void parah(String parah){
        System.out.println("Penyakit " + nama + parah + " ");
    }
    
    public void extraInfo(){
        System.out.println("Virus : " + virus);
    }
}
