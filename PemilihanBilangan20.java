import java.util.Scanner;

/**
 * PemilihanBilangan20
 */
public class PemilihanBilangan20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
    }
}