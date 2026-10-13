package T2;


public class OperatorIncrement {
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Nilai awal: " + angka);
        
        // Post-increment: nilai dicetak dulu, baru ditambah 1
        System.out.println("Post-increment (angka++): " + angka++);
        System.out.println("Nilai setelah post-increment: " + angka);
        
        // Pre-increment: nilai ditambah 1 dulu, baru dicetak
        System.out.println("Pre-increment (++angka): " + ++angka);
    }
    
}
