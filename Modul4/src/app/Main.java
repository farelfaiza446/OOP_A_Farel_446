package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Dilan", "Arek Arek", "Romansa Arek Arek Dewe");
        Buku buku2 = new Fiksi("Pengepungan di Muharto", "Gus Iqdam", "Nggedabrus");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Farel Pro", "A446");
        Anggota anggota2 = new Anggota("Rivan Gamink", "A443");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Dilan");
        anggota2.pinjamBuku("Pengepungan di Muharto", 10);

        anggota1.kembalikanBuku("Dilan");
        anggota2.kembalikanBuku("Pengepungan di Muharto");
    }
}
