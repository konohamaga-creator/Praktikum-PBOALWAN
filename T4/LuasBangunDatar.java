package T4;
import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan Menu Bangun Datar
        System.out.println("========== MENU HITUNG LUAS BANGUN DATAR ==========");
        System.out.println("1. Luas Persegi"); 
        System.out.println("2. Luas Segitiga"); 
        System.out.println("3. Luas Lingkaran"); 
        System.out.println("4. Luas Trapesium"); 
        System.out.println("5. Luas Layang-layang"); 
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        System.out.println("---------------------------------------------------");

        switch (pilihan) {
            case 1:
                // Luas Persegi = sisi * sisi
                System.out.print("Masukkan panjang sisi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi = " + luasPersegi);
                break;

            case 2:
                // Luas Segitiga = 0.5 * alas * tinggi
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;

            case 3:
                // Luas Lingkaran = π * r * r
                System.out.print("Masukkan jari-jari (r): ");
                double r = input.nextDouble();
                double luasLingkaran = Math.PI * r * r;
                System.out.println("Luas Lingkaran = " + luasLingkaran);
                break;

            case 4:
                // Luas Trapesium = 0.5 * (a + b) * tinggi
                System.out.print("Masukkan panjang sisi sejajar a: ");
                double a = input.nextDouble();
                System.out.print("Masukkan panjang sisi sejajar b: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = input.nextDouble();
                double luasTrapesium = 0.5 * (a + b) * tinggiTrapesium;
                System.out.println("Luas Trapesium = " + luasTrapesium);
                break;

            case 5:
                // Luas Layang-layang = 0.5 * d1 * d2
                System.out.print("Masukkan Diagonal 1 (d1): ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2 (d2): ");
                double d2 = input.nextDouble();
                double luasLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luasLayang);
                break;

            default:
                System.out.println("Pilihan menu tidak valid! Silakan masukkan angka 1 - 5.");
                break;
        }
    }
    
}
