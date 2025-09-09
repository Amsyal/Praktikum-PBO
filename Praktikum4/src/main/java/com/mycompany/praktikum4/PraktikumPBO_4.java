/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author acer
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);
        
        System.out.println("merk: " + mobil.getMerk());        
        System.out.println("model: " + mobil.getModel());
        System.out.println("tahun: " + mobil.getTahun());

        mobil.setModel("Inova");
        mobil.setTahun(2021);
        
        System.out.println("model: " + mobil.getModel());
        System.out.println("tahun: " + mobil.getTahun());
        
    }
}
