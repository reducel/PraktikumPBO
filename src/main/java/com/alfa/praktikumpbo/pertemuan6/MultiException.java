package com.alfa.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Masukkan bilangan: ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukkan pembagi: ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println("Hasil pembagian (dibulatkan: " + hasil);
        }
        
        catch(ArithmeticException e){
            System.out.println("Bilangan tidak dapat dibagi 0");
        }
        
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja");
        }
    }
 
}
