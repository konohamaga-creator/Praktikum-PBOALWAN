package T2;


public class WaktuTempuhCahaya {
    public static void main(String[] args) {
        
        double kecepatanCahaya = 300000; // dalam km/s
        double jarakBulan = 384400;       // dalam km
        double jarakMatahari = 152100000; // 152.1 juta km dalam angka penuh
        
        // Rumus Waktu = Jarak / Kecepatan
        double waktuKeBulan = jarakBulan / kecepatanCahaya;
        double waktuKeMatahari = jarakMatahari / kecepatanCahaya;
        
        // Menampilkan hasil waktu tempuh dalam satuan detik
        System.out.println("=== WAKTU TEMPUH BUMI DENGAN KECEPATAN CAHAYA ===");
        System.out.println("Waktu tempuh ke Bulan   : " + waktuKeBulan + " detik");
        System.out.println("Waktu tempuh ke Matahari: " + waktuKeMatahari + " detik");
    }
    
}
