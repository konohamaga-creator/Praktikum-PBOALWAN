package T2;


public class KonversiSuhu {
    public static void main(String[] args) {
        // Nilai awal
        double C = 10;
        double F = 15;
        double R = 5;

        System.out.println("=== PROGRAM KONVERSI SUHU ===");
        System.out.println("Nilai Awal -> C = " + C + ", F = " + F + ", R = " + R + "\n");

        // a. Celcius ke Fahrenheit dan sebaliknya
        double CtoF = (9.0 / 5.0 * C) + 32;
        double FtoC = 5.0 / 9.0 * (F - 32);
        System.out.println("a. Celcius <-> Fahrenheit:");
        System.out.println("   " + C + " Celcius    = " + CtoF + " Fahrenheit");
        System.out.println("   " + F + " Fahrenheit = " + FtoC + " Celcius\n");

        // b. Celcius ke Reamur dan sebaliknya
        double CtoR = 4.0 / 5.0 * C;
        double RtoC = 5.0 / 4.0 * R;
        System.out.println("b. Celcius <-> Reamur:");
        System.out.println("   " + C + " Celcius = " + CtoR + " Reamur");
        System.out.println("   " + R + " Reamur  = " + RtoC + " Celcius\n");

        // c. Fahrenheit ke Reamur dan sebaliknya
        double FtoR = 4.0 / 9.0 * (F - 32);
        double RtoF = (9.0 / 4.0 * R) + 32;
        System.out.println("c. Fahrenheit <-> Reamur:");
        System.out.println("   " + F + " Fahrenheit = " + FtoR + " Reamur");
        System.out.println("   " + R + " Reamur     = " + RtoF + " Fahrenheit");
    }
    
}
