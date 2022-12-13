package com.alfa.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        //membuat array isi 3
        int[] myNumbers = {1, 2, 3};
        
        //uji coba print nilai array index 10
        //System.out.println(myNumbers[10]);
        
        try {
            System.out.println(myNumbers[10]);    
        }
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array gk sebesar itu!");
        }
    }
}