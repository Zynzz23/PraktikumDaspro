import java.util.Scanner;

public class PemilihanHariDenganIf20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int day = input.nextInt();
        
        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
        
        input.close();
    }
}
