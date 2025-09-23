/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.tugaspbo_5;

/**
 *
 * @author amsal
 */
public class Main {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Sumbul";
        kucing.jenis = "Persia";
        kucing.umur = 3;
        kucing.warna = "putih";
        kucing.info();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Rusdi";
        anjing.jenis = "Bulldog";
        anjing.berat = 9;
        anjing.info();
    }
}

class Hewan {
    String nama;
    String jenis;
    
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class Kucing extends Hewan {
    String suara = "meong";
    int umur;
    String warna;
    
    @Override
    public void info () {
        super.info();
        System.out.println("Umur: " + umur + "Tahun");
        System.out.println("Warna: " + warna);
        System.out.println("Suara: " + suara);

    }
}

class Anjing extends Hewan {
    String suara = "guk";
    int berat;
    
    @Override
    public void info () {
        super.info();
        System.out.println("Berat: " + berat + "Kg");
        System.out.println("Suara: " + suara);
    }
}
