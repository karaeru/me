
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        double nilai, kehadiran;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai");
        nilai = input.nextDouble();
        
        System.out.println("Masukkan kehadiran");
        kehadiran = input.nextDouble();
        
        if (nilai >= 81 && kehadiran >= 12) {
            System.out.println("Nilai Akhir : A");
        } else if (nilai >= 61 && kehadiran >= 10) {
            System.out.println("Nilai Akhir : B");
        } else if (nilai >= 41 && kehadiran >= 10) {
            System.out.println("Nilai Akhir : C");
        } else if (nilai < 21 && kehadiran < 4) {
            System.out.println("Nilai Akhir : E");
        } else if (nilai < 41 && kehadiran < 10) {
            System.out.println("Nilai Akhir : D");
        }
                
    }
}
