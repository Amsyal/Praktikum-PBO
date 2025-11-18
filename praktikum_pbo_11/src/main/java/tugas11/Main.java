package tugas11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }
}


class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String infoBuku() {
        return judul;
    }
}

class pengarang {
    private String namaPengarang;

    public pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String infoPengarang () {
        return namaPengarang;
    }
}

class perpustakaan {
    private List<Buku> bukuList;

    public perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            System.out.println(buku.infoBuku());
        }
    }


}