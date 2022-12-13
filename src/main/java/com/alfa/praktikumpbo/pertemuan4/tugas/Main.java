package com.alfa.praktikumpbo.pertemuan4.tugas;

public class Main {
    public static void main(String[] args) {
        Batuk pilek = new Batuk();
        Penyakit flu = new Penyakit();
        
        pilek.nama = "Batuk Pilek";
        pilek.gejala = "Hidung tersumbat";
        pilek.durasi = 5;
        
        pilek.virus ="rhinovirus";
        
        flu.nama = "Flu";
        flu.gejala = "Badan pegal-pegal";
        flu.durasi = 6;
        
        pilek.Penyakit();
        pilek.showInfo();
        pilek.parah(" Parah Banget");
        pilek.extraInfo();
        System.out.println();
        
        flu.Penyakit();
        flu.showInfo();
        
    }
}
