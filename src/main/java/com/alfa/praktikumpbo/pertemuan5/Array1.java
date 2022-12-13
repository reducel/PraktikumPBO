package com.alfa.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        //membuat array
        String[] names = new String [5];
        
        //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //memasukkan nilai ke array
        names[0] = "Saint";
        names[1] = "Seiya";
        names[2] = "Ryu";
        
        //loop untuk menampilkan semua nilai array
        for(int i = 0; i < names.length; i++){
            System.out.println(i +": " + names[i]);
        }
    }
}
