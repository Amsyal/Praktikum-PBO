/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_5;

/**
 *
 * @author amsal
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.bahanBakar = "Solar";
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.bahanBakar = "Bensin";
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}


class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan);
    }
}

class KendaraanDarat extends Kendaraan {
    String bahanBakar;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
//        System.out.println("Bahan bakar: " + bahanBakar);
    }
}

class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}

class SepedaMotor extends KendaraanDarat {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        
        System.out.println("Jenis mesin: " + jenisMesin);
    }
}

