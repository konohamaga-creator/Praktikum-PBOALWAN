package T2;


public class MengubahString {
    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        // Mengubah string 'a' menjadi huruf kecil semua
        String hasilA = a.toLowerCase();
        
        // Mengubah string 'b' menjadi huruf besar semua
        String hasilB = b.toUpperCase();
        
        // Menampilkan hasil ke layar
        System.out.println("Hasil a: " + hasilA);
        System.out.println("Hasil b: " + hasilB);
    }
}
