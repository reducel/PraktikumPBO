/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan2;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Break {
    public static void main(String[] args) {
        int j = 0;
        while (j<100){
            System.out.println("Looping... " + j + "%");
            j += 10;
            if (j == 60){
                System.out.println("Au ah males");
                break;
            }
        }
    }
}
