package com.alfa.praktikumpbo.pertemuan3.animal;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Main {
    //main + tab
    public static void main(String[] args) {
        //membuat objek
        Animal cat = new Animal("anjai", 10, "Aqua");
        Animal dog = new Animal("gile", 12, "Rainbow");
        Animal rabbit = new Animal("rrq", 10, "White");
        
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        System.out.println("Dog's name (before)" + dog.getName());
        dog.setName("alfi");
        System.out.println("Dog's age (after)" + dog.getName());
    }
}
