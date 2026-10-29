package T4;
import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun: ");
        int tahun = input.nextInt();
        
        // Aturan tahun kabisat: habis dibagi 4 dan tidak habis dibagi 100, ATAU habis dibagi 400
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " Bukan Tahun Kabisat.");
        }
    }
    
}
