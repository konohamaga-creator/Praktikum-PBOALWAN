package T4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input status member dan total belanja
        System.out.print("Apakah memiliki kartu member? (iya/tidak): ");
        String isMember = input.nextLine().trim().toLowerCase();

        System.out.print("Masukkan Total Belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        // Logika penentuan diskon
        if (isMember.equals("iya")) {
            if (totalBelanja > 500000) {
                diskon = 50000; 
            } else if (totalBelanja > 100000) {
                diskon = 15000; 
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        // Perhitungan total bayar
        double totalBayar = totalBelanja - diskon;

        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("--------------------------------------");

        // Input uang bayar dan hitung kembalian
        System.out.print("Masukkan Uang yang Diberikan (Rp): ");
        double uangBayar = input.nextDouble();

        if (uangBayar >= totalBayar) {
            double kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian     : Rp " + kembalian);
        } else {
            System.out.println("Uang Anda tidak cukup!");
        }
    }
    
}
