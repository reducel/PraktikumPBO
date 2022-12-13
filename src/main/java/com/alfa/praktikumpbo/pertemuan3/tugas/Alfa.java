/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan3.tugas;

/**
 *
 * @author Alfa <your.name at your.org>
 */
public class Alfa {
    private String name;
    private int age;
    private String hobi;
    private int tinggi;
    private float berat;
    
    //Constructor :method atau function yang kita panggil saat kita ingin  
    //membuat sebuah Object dari Class tersebut
    public Alfa(){}
    
    //alt + insert -> constructor -> select all -> generate
    //Constructor dengan parameter

    public Alfa(String name, int age, String hobi, int tinggi, float berat) {
        this.name = name;
        this.age = age;
        this.hobi = hobi;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public void showProfile() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " years old");
        System.out.println("Hobi : " + hobi);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Berat : " + berat);
        System.out.println();
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    //alt + insert -> getter and setter -> select all -> generate
    //getter and setter untuk mengambil dan memperbarui nilai variabel
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showProile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}