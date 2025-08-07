package tugas;

import java.util.Scanner;

public class pangkatNilai {
    public static void main(String[] args) {
        int angka, pangkat, hasil = 1;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Program Menentukan Nilai Pangkat");
        System.out.print("Masukkan Angka: ");
        angka = input.nextInt();
        
        System.out.print("Masukkan Pangkat: ");
        pangkat = input.nextInt();
        
        
        do{
            hasil = hasil*angka;
            pangkat--;
        } while(pangkat>0);
        System.out.println("Hasil Pangkat: " + hasil);
    }
}
