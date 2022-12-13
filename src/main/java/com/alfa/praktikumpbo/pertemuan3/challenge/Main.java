/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan3.challenge;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Main {
    public static void main(String[] args) {
        Library joko = new Library("Harry", 5, 2019);
        Library dodo = new Library("Potter", 1000, 1998);
        
        joko.showProfile();
                
        System.out.println("Name : " + joko.getName());
        joko.setName("Mojo");
        System.out.println("Name : " + joko.getName());
        System.out.println();
        
        System.out.println("Visitors Today : " + joko.getVisitorsToday());
        joko.setVisitorsToday(4);
        System.out.println("Visitors Today (after) : " + joko.getVisitorsToday());
        System.out.println();
        
        System.out.println("Year Built : " + joko.getYearBuilt());
        joko.setYearBuilt(2021);
        System.out.println("Year Built (after) : " + joko.getYearBuilt());
    }
}
