package T31;
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIP: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok (P1): ");
        double p1 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Jabatan (P2): ");
        double p2 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Istri (P3): ");
        double p3 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Anak (P4): ");
        double p4 = input.nextDouble();

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.println("NIP            : " + npm);
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Total Gaji     : Rp " + totalGaji);
        System.out.println("Pajak (10%)    : Rp " + pajak);
        System.out.println("Gaji Bersih    : Rp " + gajiBersih);
    }
}