package praktikum12;

import java.io.Serializable;

public class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }



    public void tampilkanInfo(){
        System.err.println("Nama produk: " + namaProduk);
        System.err.println("Harga: " + harga);
        System.err.println("Stok: " + stok);
    }
}
