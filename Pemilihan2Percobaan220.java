import java.util.Scanner;

public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)"); 
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = input20.nextInt();
        input20.nextLine(); 

        System.out.print("Apakah punya member (y/n) ? = ");
        String member = input20.nextLine();

        double harga = 0;
        double diskon = 0;
        double total_bayar = 0;

        if (member.equals("y")) { 
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) { 
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar"); 
                return; 
            }

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else {
            if (pilihan_menu == 1) { 
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar"); 
                return; 
            }

            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        }
         if (member.equals("n")) { 
            if (pilihan_menu == 1) { 
                harga = 14000;

            } else if (pilihan_menu == 2) {
                harga = 3000;

            } else if (pilihan_menu == 3) {
                harga = 15000;

            } else {
                System.out.println("Masukkan pilihan menu dengan benar"); 
                return; 
            }

        } else {
        }
        System.out.println("------------------------------");
    }
}