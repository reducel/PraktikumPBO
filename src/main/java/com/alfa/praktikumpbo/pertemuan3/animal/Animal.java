package com.alfa.praktikumpbo.pertemuan3.animal;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Animal {
    private String name;
    private int age;
    private String color;
    
    //Constructor :method atau function yang kita panggil saat kita ingin  
    //membuat sebuah Object dari Class tersebut
    public Animal(){}
    
    //alt + insert -> constructor -> select all -> generate
    //Constructor dengan parameter
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
            
    public void showProfile() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " years old");
        System.out.println("Color : " + color);
        System.out.println();
    }
    
    //alt + insert -> getter and setter -> select all -> generate
    //getter and setter untuk mengambil dan memperbarui nilai variabel
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showProile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


