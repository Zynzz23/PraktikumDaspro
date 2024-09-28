import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Variabel untuk menyimpan usia
        int usia = -1;

        // Meminta input usia dari pengguna
        System.out.println("Masukkan usia Anda: ");
        
        // Memastikan input adalah angka positif
        while (usia < 0) {
            // Cek apakah input adalah angka
            if (input.hasNextInt()) {
                usia = input.nextInt();
                
                // Cek apakah usia bernilai positif
                if (usia < 0) {
                    System.out.println("Usia harus bernilai positif. Silakan masukkan kembali usia Anda: ");
                }
            } else {
                // Jika input bukan angka, tampilkan pesan kesalahan
                System.out.println("Input tidak valid! Silakan masukkan angka yang benar.");
                input.next(); // Mengabaikan input yang salah
            }
        }

        // Menentukan kategori usia
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        // Menampilkan kategori usia
        System.out.println("Kategori usia Anda adalah: " + kategori);

        // Menutup Scanner
        input.close();
    }
}
