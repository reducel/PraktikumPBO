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
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user = "alfa";
        String pass = "bload";
        
        boolean login = false;
        
            System.out.println("Login Sederhana");
            int j = 0;
            do{
                System.out.println("Username : ");
                String username = input.nextLine();
            
                System.out.println("Password : ");
                String password = input.nextLine();
            
                if(username.equals(user) && password.equals(pass)){
                    login = true;
                    System.out.println("Berhasil login");
                    break;
                }
                else{
                    System.out.println("Gagal login\n");
                    j++;
               
                }
                
            }while(j < 3);
                if(login != true){
                    System.out.println("Anda sudah salah 3x");
                    System.out.println("Coba lagi nanti");
                }
    }
}