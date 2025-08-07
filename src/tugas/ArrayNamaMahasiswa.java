package tugas;

import java.util.Scanner;

public class ArrayNamaMahasiswa {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah data yang ingin diinputkan: ");
        size = input.nextInt();
        
        String [] nama = new String [size];
        
        
        for (int i = 0; i < size; i++) {
            System.out.print("Mahasiswa ke-" + (i+1) + "= ");
            nama[i] = input.next();
        }
        
        System.out.println("=====================================");
        System.out.println("***             OUTPUT            ***");
        
        for(int i = 0; i < size; i++) {
            System.out.println("Urutan mahasiswa ke-" + (i+1) + " adalah " + nama[i]);
        }
        
    }
}
