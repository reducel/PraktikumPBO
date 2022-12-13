package com.alfa.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
        //deklarasi scanner untuk input user
        Scanner input = new Scanner(System.in);
    
        //membuat agar panjang array ditentukan input user
        System.out.println("==Program Input Umur Mahasiswa==");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jml = input.nextInt();
        System.out.println();
        
        //membuat array input dengan panjang input dari user
        String[] mhsw = new String[jml];
        int[] umur = new int[jml];
        
        //memasukkan mhsw ke array
        for(int i =0 ; i<jml; i++){
            System.out.print("Mahasiswa ke " + (i+1) + ": ");
            mhsw[i] = input.next();
        }
        
        System.out.println();
        
        //memasukkan umur ke array
        for(int i =0 ; i<jml; i++){
            System.out.print("Umur " + mhsw[i] + ": ");
            umur[i] = input.nextInt();
        }
        
        System.out.println();
        
        //menampilkan semua mahasiwa dan umurnya array
        for(int i = 0; i < jml; i++){
            System.out.println(mhsw[i] +" berumur " + umur[i]);
        }
    }
}
