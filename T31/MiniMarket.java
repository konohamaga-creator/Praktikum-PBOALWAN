package T31;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MiniMarket {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Mangga: 70 pcs dikurangi 15 pcs yang busuk
        int manggaAwal = 70;
        int manggaBusuk = 15;
        int manggaBagus = manggaAwal - manggaBusuk;

        // Jambu: 4 tetangga x 30 pcs
        int tetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = tetangga * jambuPerTetangga;

        int totalBuah = manggaBagus + totalJambu;

        System.out.println("--- PERHITUNGAN BUAH IBU SISCA ---");
        System.out.println("Jumlah Mangga Bagus : " + manggaBagus + " pcs");
        System.out.println("Jumlah Total Jambu  : " + totalJambu + " pcs");
        System.out.println("Total Buah Keseluruhan: " + totalBuah + " pcs");
    }
    
    
}
