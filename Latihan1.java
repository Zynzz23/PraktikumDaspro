import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan nilai bil1: ");
        int bil1 = input20.nextInt();

        System.out.print("Masukkan nilai bil2: ");
        int bil2 = input20.nextInt();

        System.out.print("Masukkan nilai bil3: ");
        int bil3 = input20.nextInt();

        int terbesar = bil2;

        if (bil2 < bil3) {
            terbesar = bil2;
        } else if (bil1 > terbesar) {
            terbesar = bil2;
        }

        System.out.println("BilanganTerbesar: " + terbesar);
    }
}