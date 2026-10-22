package T31;
import java.util.Scanner;


public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- WAKTU PERTAMA ---");
        System.out.print("Jam   : "); int j1 = input.nextInt();
        System.out.print("Menit : "); int m1 = input.nextInt();
        System.out.print("Detik : "); int d1 = input.nextInt();

        System.out.println("--- WAKTU KEDUA ---");
        System.out.print("Jam   : "); int j2 = input.nextInt();
        System.out.print("Menit : "); int m2 = input.nextInt();
        System.out.print("Detik : "); int d2 = input.nextInt();

        int totalDetik1 = j1 * 3600 + m1 * 60 + d1;
        int totalDetik2 = j2 * 3600 + m2 * 60 + d2;

        int selisihDetik = Math.abs(totalDetik1 - totalDetik2);

        int jam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("\nSelisih Waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
    
}
