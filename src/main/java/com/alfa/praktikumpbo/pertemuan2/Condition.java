/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat : ");
        int bilangan = input.nextInt();
        
        //jika bilangan yang dimasukkan lebih dari 0 maka bilangan positif
        if(bilangan > 0){
            System.out.println(bilangan + " adalah bilangan positif");
        }
        //jika bilangan yang dimasukkan kurang dari 0 maka bilangan negatif
        else if(bilangan < 0){
            System.out.println(bilangan + " adalah bilangan negatif");
        }
        //jika bilangan yang dimasukkan 0 maka itu adalah 0
        else {
            System.out.println(bilangan + " adalah 0");
        }
    }    
}
