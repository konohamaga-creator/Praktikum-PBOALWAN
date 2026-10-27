package T31;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "transaksi.dat";

        try {
            // Input data dari user
            System.out.print("Nama Pembeli: ");
            String nama = sc.nextLine();
            System.out.print("Total Belanja: ");
            double totalBelanja = sc.nextDouble();
            System.out.print("Diskon (%): ");
            double diskonPersen = sc.nextDouble();
            System.out.print("Bayar: ");
            double bayar = sc.nextDouble();

            double nominalDiskon = totalBelanja * (diskonPersen / 100.0);
            double totalBayar = totalBelanja - nominalDiskon;
            double kembalian = bayar - totalBayar;

            // Menulis ke file menggunakan DataOutputStream
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskonPersen);
            dos.writeDouble(totalBayar);
            dos.writeDouble(bayar);
            dos.writeDouble(kembalian);
            dos.close();

            // Membaca dari file menggunakan DataInputStream
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            System.out.println("\n--- STRUK PEMBELANJAAN ---");
            System.out.println("Nama         : " + dis.readUTF());
            System.out.println("Total Belanja: Rp " + dis.readDouble());
            System.out.println("Diskon       : " + dis.readDouble() + "%");
            System.out.println("Total        : Rp " + dis.readDouble());
            System.out.println("Bayar        : Rp " + dis.readDouble());
            System.out.println("Kembalian    : Rp " + dis.readDouble());
            dis.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}
    

