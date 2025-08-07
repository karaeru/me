
package alsuda_1;

import java.util.Scanner;

public class Array_Bilangan_Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] bilangan = new int [6];
        
        System.out.println("Masukkan 5 nilai bilangan dari 0 sampai 10");
        for(int i = 1; i < 6 ; i++){
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan[i] = input.nextInt();
        } System.out.println("-----------------------");
        for(int i = 1; i < 6 ; i++){
            if (bilangan[i] % 2 != 0){
            System.out.println("Bilangan Ganjil yang ke-" + (i) + " adalah: " + bilangan[i]);
        }
    }
    }
}
