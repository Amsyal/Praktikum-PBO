package praktikum11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");

        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.infoPerpustakaan();

        Anggota anggota1 = new Anggota("Alice");
        Anggota anggota2 = new Anggota("Bob");

        Klub klub = new Klub("Klub Buku");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.infoKlub();

    }
}

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }   
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }   

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
    
}


class Anggota {
 private String nama;

 public Anggota(String nama) {
    this.nama = nama;
 }

 public void infoAnggota() {
    System.out.println("Nama Anggota: " + nama);
 }
}

class Klub {
 private String namaKlub;
 private List<Anggota> anggotaList;
 
 public Klub(String namaKlub) {
    this.namaKlub = namaKlub;
    this.anggotaList = new ArrayList<>();
 }
 
 public void tambahAnggota(Anggota anggota) {
    anggotaList.add(anggota);
 }
 
 public void infoKlub() {
    System.out.println("Nama Klub: " + namaKlub);
    for (Anggota anggota : anggotaList) {
        anggota.infoAnggota();
    }
 }
}
