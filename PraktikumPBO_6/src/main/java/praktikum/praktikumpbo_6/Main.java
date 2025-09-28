/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.praktikumpbo_6;

/**
 *
 * @author amsal
 */
public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.bersuara();
        hewan.makan("ikan");
        hewan.makan("ikan", 2);
        
        System.out.println("\n");
        
        Kucing kucing = new Kucing();
        kucing.bersuara();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);
        
        System.out.println("\n");

        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3);
    }
}

class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}