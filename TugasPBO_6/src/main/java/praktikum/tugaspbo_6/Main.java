/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.tugaspbo_6;

/**
 *
 * @author amsal
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        Buku buku = new Buku("10 Dosa Besar Jkw", 10000);
        Elektronik elektronik = new Elektronik("Radio", 34090);
        Pakaian pakaian = new Pakaian("Celana", 90000);
        
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        
        keranjang.tampilkanKeranjang();
        System.out.println("====================================+");
        System.out.println("Total:         " + "Rp " + keranjang.totalHarga());
    }
}

class KeranjangBelanja {
    ArrayList<Produk> daftarProduk = new ArrayList<>();
    
    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }
    
    public double totalHarga() {
        double total = 0;
        for(Produk produk: daftarProduk) {
            total += produk.getHargaSetelahDiskon();
        }
        return total;
        
    }
    
    public void tampilkanKeranjang() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Keranjang kosong.");
            return;
        }
        
        for(int i = 0; i < daftarProduk.size(); i++) {
            System.out.println((i + 1) + ". " + daftarProduk.get(i));
        }
    }
    
}

abstract class Produk {
    String nama;
    double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract double hitungDiskon();
    
    public double getHargaSetelahDiskon(){
        return harga - hitungDiskon();
    }
    
    @Override
    public String toString() {
        return String.format("%s - Rp %.2f (Diskon: Rp %.2f, Final: Rp %.2f)", 
                nama, harga, hitungDiskon(), getHargaSetelahDiskon());
    }
}

class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.1;
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.05;    
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.2;    
    }
}
