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
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Usia : ");
        int usia = input.nextInt();
        
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
}
