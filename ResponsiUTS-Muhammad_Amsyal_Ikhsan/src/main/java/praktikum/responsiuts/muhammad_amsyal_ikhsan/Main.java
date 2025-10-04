/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.responsiuts.muhammad_amsyal_ikhsan;

/**
 *
 * @author amsal
 */
abstract class Produk {
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public String getNamaProduk(){
        return this.namaProduk;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga(){
        return this.harga;
    }
    
    abstract void tampilkanInfo();
}

class Elektronik extends Produk{
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return this.garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.printf("Nama produk: %s%nHarga: %,.0f%nGaransi: %d Tahun%n",
                      getNamaProduk(), getHarga(), getGaransi());
    }
}

class Makanan extends Produk{
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(String tanggal) {
        this.tanggalKadaluarsa = tanggal;
    }
    
    public String getTanggalKadaluarsa() {
        return this.tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.printf("Nama makanan: %s%nHarga: %,.0f%nTanggal Kadaluarsa: %s",
                      getNamaProduk(), getHarga(), getTanggalKadaluarsa());
    }
}

abstract class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public String getNama() {
        return this.namaPegawai;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public double getGaji() {
        return this.gaji;
    }
    
    abstract void tampilkanInfo();
}

class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan() {
        return this.tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("Nama: %s%nGaji: %,.0f%nTunjangan: %,.0f%n",
                      getNama(), getGaji(), getTunjangan());
    }
}

class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    public int getLamaKontrak() {
        return this.lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.printf("Nama: %s%nGaji: %,.0f%nLama Kontrak: %d Bulan%n",
                      getNama(), getGaji(), getLamaKontrak());

    }
}


public class Main {
    public static void main(String[] args){
        Elektronik elektronik = new Elektronik("Laptop", 15000000, 2);
        elektronik.tampilkanInfo();
        
        System.out.println("\n");
        
        PegawaiTetap pegawai = new PegawaiTetap("Amsal", 5000000, 1000000);
        pegawai.tampilkanInfo();
        
        System.out.println("\n");

        Makanan makanan = new Makanan("Snack", 15000, "2023-12-30");
        makanan.tampilkanInfo();        
        
        System.out.println("\n");

        PegawaiKontrak pegawai2 = new PegawaiKontrak("Wowo", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
    
}





