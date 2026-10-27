//Perbedaan: 
//Scanner: Mudah digunakan karena memiliki method pemparsing bawaan seperti nextInt(), nextDouble(), dll. Namun, kecepatannya lebih lambat karena melakukan parsing data input secara langsung.
//BufferedReader: Membaca input sebagai karakter/teks dalam buffer besar, sehingga proses membaca data jauh lebih cepat. Namun, data yang dibaca harus diurai (parsed) secara manual (misalnya menggunakan Integer.parseInt()).

package T31;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerBufferReader {
    public static void main(String[] args) throws IOException {
        // Menggunakan Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan Angka: ");
        int angkaScanner = scanner.nextInt();
        System.out.println("Hasil Scanner: " + angkaScanner);

        // Menggunakan BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan Angka: ");
        int angkaReader = Integer.parseInt(reader.readLine());
        System.out.println("Hasil BufferedReader: " + angkaReader);
    }
}
    
