package tugas;

import java.util.Scanner;

public class berat_tinggi_ideal {
    public static void main(String[] args) {
        
        double tinggi, berat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan berat badan Anda: ");
        berat = input.nextDouble();
        System.out.println("Masukan Tinggi badan Anda");
        tinggi = input.nextDouble();
        
        
        if (berat >= 90 && (tinggi < 180)) {
            System.out.println("Gemuk");
        } else if(berat >= 70 && (tinggi > 160)) {
            System.out.println("Ideal");
        } else if(berat >= 55 && (tinggi > 160)) {
            System.out.println("Kurus");
        } else if(berat < 55 && (tinggi > 150)) {
            System.out.println("Anda perlu makan banyak!");
        } else {
            System.out.println("Nilai idak ditemukan");
        }
        
                
    }
}