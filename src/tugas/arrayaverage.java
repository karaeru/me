package tugas;

import java.util.Scanner;

public class arrayaverage {
    public static void main(String[] args) {
        int angka, total = 0;
        float average;
        
        int[] a= {8, 7, 7};
        int jumlahIndex = a.length;
        System.out.print("Deret angka \t: ");
        for (int i = 0; i < jumlahIndex; i++) {
            System.out.print(a[i] + " ");
            total += a[i];
          }
          System.out.println("");
          System.out.println("Total \t\t: " + total);
          average = total/jumlahIndex;
          System.out.println("Rata-rata \t: " + average);
    }
}
