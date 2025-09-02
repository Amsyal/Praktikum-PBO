package tugas3;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda", "civic", 2020, "Putih");
        Mobil mobil2 = new Mobil("Isuzu", "panther", 2007, "Hitam");

        mobil1.info();
        mobil1.startEngine();

        mobil2.info();
        mobil2.startEngine();

    }
}