/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan2;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Perulangan {
    public static void main(String[] args) {
        // --For--
        // Akan melakukan perulangan hinggan kondisi tercapai(< 5)
        // perulangan dimulai dari 0 hingga 4 jadi total 5 perulangan
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping... (" + i + "/5)");
            
        }
        System.out.println("For loop selesai \n");
        
        // --While--
        // Akan melakukan perulangan hinggan kondisi tercapai(< 5)
        // perulangan dimulai dari 0 hingga 4 jadi total 5 perulangan
        int j = 0;
        while(j<5){
            System.out.println("Looping... (" + j + "/5)");
            j++;
        }
        System.out.println("While loop selesai \n");
        
        // --Do While--
        // Akan melakukan perulangan hinggan kondisi tercapai(< 5)
        // perulangan dimulai dari 0 hingga 4 jadi total 5 perulangan
        int k=0;
        do {
            System.out.println("Looping ... (" + k + "/5)");
            k++;
        }while(k<5);
        System.out.println("Do while loop selesai");
    }       
}
