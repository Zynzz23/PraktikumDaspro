import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (1. Kamus, 2. Novel, 3. Lainnya): ");
        int jenisBuku = input20.nextInt();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input20.nextInt();

        System.out.print("Masukkan harga per buku: ");
        double hargaBuku = input20.nextDouble();

        double diskon = 0;
        String namaJenisBuku = "";

        if (jenisBuku == 1) {
            namaJenisBuku = "Kamus";
            if (jumlahBuku > 27) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenisBuku == 2) {
            namaJenisBuku = "Novel";
            if (jumlahBuku > 37) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else if (jenisBuku == 3) {
            namaJenisBuku = "Lainnya";
            if (jumlahBuku > 37) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        } else {
            System.out.println("Jenis buku tidak valid");
            return;
        }

        double totalHarga = hargaBuku * jumlahBuku;
        double jumlahDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - jumlahDiskon;

        System.out.println("Jenis buku: " + namaJenisBuku);
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Jumlah diskon: Rp" + jumlahDiskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
    }
}