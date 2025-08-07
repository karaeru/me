package tugas;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        int bilangan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat: ");
        bilangan = input.nextInt();
        System.out.println("Tabel perkalian untuk " + bilangan + ":");
        
        for(int i = 1; i <= 10; i++){
            System.out.println(bilangan + " x " + i + " = " +
                    " " + (bilangan * i));
        }
            
        
    }
}
