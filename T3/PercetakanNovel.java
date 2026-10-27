package T31;
import java.util.Scanner;


public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Novel yang Akan Dicetak: ");
        int jumlahNovel = input.nextInt();
        System.out.print("Masukkan Tebal Lembar per Novel: ");
        int lembarPerNovel = input.nextInt();

        // Kecepatan = 1 lembar/detik, jadi total lembar = total detik
        long totalDetik = (long) jumlahNovel * lembarPerNovel;

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n--- WAKTU PROSES PERCETAKAN ---");
        System.out.println("Total Lembar : " + totalDetik + " lembar");
        System.out.println("Waktu Dibutuhkan: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
    
}
