import java.util.Scanner;

public class Pemilihan2Percobaan320 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori (Pekerja/Pebisnis): ");
        kategori = input20.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input20.nextInt();

        
        if (kategori.equals("Pekerja")) {
          
            if (penghasilan <= 2000000) {
                pajak = penghasilan * 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = penghasilan * 0.15;
            } else {
                pajak = penghasilan * 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih : " + gajiBersih);

            }
        } else if (kategori.equals("Pebisnis")) {
            
            if (penghasilan <= 2500000) {
                pajak = penghasilan * 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = penghasilan * 0.2;
            } else {
                pajak = penghasilan * 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih : " + gajiBersih);

            }
        } else {
            System.out.println("Masukan Kategori Salah");
            return;
        }

        gajiBersih = penghasilan - (int) pajak;

        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}