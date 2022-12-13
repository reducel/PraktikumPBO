package com.alfa.praktikumpbo.pertemuan6.tugas;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        try{
            String kata = "Merokok membunuhmu";
            char a = kata.charAt(18);
            System.out.println(a);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Char tidak ditemukan");
        }
    }
}