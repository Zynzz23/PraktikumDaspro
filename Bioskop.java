import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         final int HARGA_TIKET = 50000;
         int totalTiketTerjual = 0;
         int totalPenjualan = 0;
         int jumlahTiket;
 
         while (true) {
             System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
             jumlahTiket = sc.nextInt();
 
             if (jumlahTiket == 0) {
                 break;
             }
             if (jumlahTiket < 0) {
                 System.out.println("Jumlah tiket tidak valid. Coba lagi.");
                 continue;
             }
             int hargaSebelumDiskon = jumlahTiket * HARGA_TIKET;
             double diskon = 0;

             if (jumlahTiket > 10) {
                 diskon = 0.15; 
             } else if (jumlahTiket > 4) {
                 diskon = 0.10; 
 
            
             int hargaSetelahDiskon = (int) (hargaSebelumDiskon * (1 - diskon));
             totalTiketTerjual += jumlahTiket;
             totalPenjualan += hargaSetelahDiskon;
 
             
             System.out.println("Harga yang harus dibayar: Rp " + hargaSetelahDiskon);
         }
 
         System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
         System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
     }
 }   
}