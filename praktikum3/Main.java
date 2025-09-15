/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author amsal
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Udin", 25, "Mancing", 25000);
        System.out.println(pekerja.toString());
        
        pekerja.setNama("Rusdi");
        System.out.println(pekerja.toString());
    }
}

