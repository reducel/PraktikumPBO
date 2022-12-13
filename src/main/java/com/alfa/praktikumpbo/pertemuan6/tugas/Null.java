package com.alfa.praktikumpbo.pertemuan6.tugas;

public class Null {
    public static void main(String[] args) {
        String nama = null;
        try{
            System.out.println(nama.length());
        }
        catch(NullPointerException e){
            System.out.println("Tidak dapat menampilkan panjang karena tidak ada data");
        }
    }
}