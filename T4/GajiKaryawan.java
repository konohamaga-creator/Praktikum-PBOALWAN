package T4;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = input.nextInt();
        
        System.out.print("Status Pernikahan (1 = Menikah, 0 = Belum/Cerai): ");
        int statusNikah = input.nextInt();
        
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        // Menentukan gaji pokok berdasarkan golongan
        switch (gol) {
            case 1:
                gajiPokok = 1200000; 
                break;
            case 2:
                gajiPokok = 1500000; 
                break;
            case 3:
                gajiPokok = 1750000; 
                break;
            case 4:
                gajiPokok = 2000000; 
                break;
            default:
                System.out.println("Kode Golongan Tidak Valid!");
                return;
        }
        
        // Perhitungan Tunjangan
        // 1. Hitung Tunjangan Pasangan
        double tunjanganPasangan = 0;
            if (statusNikah == 1) {
                tunjanganPasangan = 0.10 * gajiPokok;
        }

        // 2. Hitung Tunjangan Anak
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        // 3. Hitung Total Tunjangan
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;

        // 4. Hitung Gaji Bersih
        double gajiBersih = gajiPokok + totalTunjangan;
        
        
        
        // Output hasil
        System.out.println("\n========== RINCIAN GAJI ==========");
        System.out.println("NIK               : " + nik);
        System.out.println("Nama              : " + nama);
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan);
        System.out.println("Tunjangan Anak    : Rp " + tunjanganAnak);
        System.out.println("Total Tunjangan   : Rp " + totalTunjangan);
        System.out.println("----------------------------------");
        System.out.println("Gaji Bersih       : Rp " + gajiBersih);
    }
}
    
