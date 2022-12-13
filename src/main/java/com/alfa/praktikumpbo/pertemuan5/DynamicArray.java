
package com.alfa.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        //deklarasi scanner untuk input user
        Scanner input = new Scanner(System.in);
    
        //membuat agar panjang array ditentukan input user
        System.out.println("==Program input Nilai==");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
        
        //membuat array input dengan panjang matkul input user
        int[] nilai = new int[jml];
        
        //memasukkan nilai ke array
        for(int i =0 ; i<jml; i++){
            System.out.print("Memasukkan nilai ke " + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();
        
        //menampilkan semua nilai array
        for(int i = 0; i < jml; i++){
            System.out.println(i + ": " + nilai[i]);
        }
        
        //mencari nilai rata-rata
        float total = 0;
        float rata2;
        
        for(int i = 0; i<jml; i++){
            total = total+nilai[i];
        }
        rata2 = (total/jml);
        System.out.println("Nilai rata2 dari " + jml + " matkul adalah : " + rata2);
    }
}
