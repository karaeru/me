package tugas;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        double angka1, angka2, pilihanMenu;
        double penjumlahan, pengurangan, perkalian, pembagian;
        
        
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("");
        System.out.println("===================================");
            System.out.println("          MENU KALKULATOR");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Berhenti");
        System.out.println("===================================");
    
        System.out.print("Pilih menu: ");
        pilihanMenu = input.nextInt();
        System.out.println("");
        
        if (pilihanMenu == 1){
            System.out.println("Penjumlahan");
            System.out.print("Masukkan angka Pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka Kedua: ");
            angka2 = input.nextInt();
            
            penjumlahan = angka1 + angka2;
            
            System.out.println("Hasil penjumlahan: " + penjumlahan);
            
        }
        else if (pilihanMenu == 2){
            System.out.println("Pengurangan");
            System.out.print("Masukkan angka Pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka Kedua: ");
            angka2 = input.nextInt();
            
            pengurangan = angka1 - angka2;
            
            System.out.println("Hasil pengurangan: " + pengurangan);
        }
        else if (pilihanMenu == 3){
            System.out.println("Perkalian");
            System.out.print("Masukkan angka Pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka Kedua: ");
            angka2 = input.nextInt();
            
            perkalian = angka1 * angka2;
            
            System.out.println("Hasil perkalian: " + perkalian);
        }
        else if (pilihanMenu == 4){
            System.out.println("Pembagian");
            System.out.print("Masukkan angka Pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka Kedua: ");
            angka2 = input.nextInt();
            
            pembagian = angka1 / angka2;
            
            System.out.println("Hasil perkalian: " + pembagian);
        }
    }while(pilihanMenu >=1 && pilihanMenu <=4);
        System.out.println("*** PROGRAM BERHENTI ***");
  }
}