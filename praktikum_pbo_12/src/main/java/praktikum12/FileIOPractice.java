package praktikum12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) throws IOException {
        String filePath = "data.txt";

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrogramman Berorientasi Objek.\n");

            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch(IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }

        try(FileReader reader = new FileReader(filePath)) {
            int character;
            System.err.println("\nIsi File:");

            while((character = reader.read()) != -1) {
                System.err.print((char) character);
            }
        } catch(IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
