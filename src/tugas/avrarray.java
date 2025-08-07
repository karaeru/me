
package tugas;

import java.util.Scanner;

public class avrarray {
    public static void main(String[] args) {
        
    int angka,size, total = 0;
        double average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah barang yang akan dicatat: ");
        size = input.nextInt();
        int [] array = new int [size];
        
         for (int i = 0; i < size; i++) {
             System.out.print("Angka ke- " + (i+1) + ": ");
             array [i] = input.nextInt();
         }
     
    }
}
