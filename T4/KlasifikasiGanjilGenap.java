package T4;
import java.util.Scanner;

public class KlasifikasiGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        // Menggunakan operator modulus (%)
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP.");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL.");
        }
    }
    
    
}
