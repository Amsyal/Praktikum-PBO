/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;

/**
 *
 * @author acer
 */
public class Kendaraan {

        private String merk;
        private String model;
        private int tahun;
        
        public Kendaraan(String merk, String model, int tahun) {
            this.merk = merk;
            this.model = model;
            this.tahun = tahun;
        }
        
        public String getMerk() {
            return merk;
        }
        
        public void setMerk(String merk) {
            this.merk = merk;
        }
        
        public String getModel() {
            return model;
        }
        
        public void setModel(String model) {
            this.model = model;
        }
        
        public int getTahun() {
            return tahun;
        }
        
        public void setTahun(int tahun) {
            this.tahun = tahun;
        }
        
    }
