import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("Masukkan merk sepatu (Converse, Sketcher, Nike): ");
        String merk = input20.nextLine();

        System.out.println("Masukkan kategori sepatu: ");
        String kategori = input20.nextLine();

        System.out.println("Masukkan ukuran sepatu: ");
        int ukuran = input20.nextInt();

        int harga = 0;

        // Menentukan harga berdasarkan merk, kategori, dan ukuran
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                } 
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                }
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
            }
        }

        if (harga != 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Maaf, data yang Anda masukkan tidak valid.");
        }
    }
}