package com.alfa.praktikumpbo.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        //membuat array
        String[] names = {"yaya", "yuyu", "yeye"};
        
        //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //loop untuk menampilkan semua nilai array
        for(int i = 0; i < names.length; i++){
            System.out.println(i +": " + names[i]);
        }
    }
}
