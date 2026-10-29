package T4;
import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Penjualan Hari Ini (Rp): ");
        double penjualan = input.nextDouble();
        
        double uangJasa = 0;
        double persenKomisi = 0;
        
        if (penjualan <= 2000000) {
            uangJasa = 100000; 
            persenKomisi = 0.10; // 10%
        } else if (penjualan <= 5000000) {
            uangJasa = 200000; 
            persenKomisi = 0.15; // 15%
        } else {
            uangJasa = 300000; 
            persenKomisi = 0.20; // 20%
        }
        
        double komisi = penjualan * persenKomisi; 
        double totalPendapatan = uangJasa + komisi; 
        
        System.out.println("\n========== RINCIAN PENDAPATAN SALESMAN ==========");
        System.out.println("Hasil Penjualan : Rp " + penjualan);
        System.out.println("Uang Jasa       : Rp " + uangJasa);
        System.out.println("Komisi          : Rp " + komisi);
        System.out.println("-------------------------------------------------");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
    
}
