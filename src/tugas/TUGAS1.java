package tugas;

import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {
        
        double angka1, angka2;
         double  penjumlahan,pengurangan, perkalian, pembagian;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Masukan angka pertama:");
         angka1 = input.nextDouble();
         
         System.out.println("Masukan angka kedua");
         angka2 = input.nextDouble();
         
         penjumlahan = angka1 + angka2;
         pengurangan = angka1 - angka2;
         perkalian = angka1 * angka2;
         pembagian = angka1 / angka2;
         
         System.out.println("Penjumlahan: " + penjumlahan);
         System.out.println("Peengurangan: " + pengurangan);
         System.out.println("Perkalian: " + perkalian);
         System.out.println("Pembagian: " + pembagian);                      
    }
}
