
package tugas;

import java.util.Scanner;

public class ArrayDataBarang {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah barang yang akan dicatat: ");
        size = input.nextInt();
        
          String [] kodebarang = new String [size];
          String [] namabarang = new String [size];
          int [] hargabarang = new int [size];
        
        
        
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan Kode Barang ke-" + (i+1) + ": ");
            kodebarang[i] = input.next();
            System.out.print("Masukkan Nama Barang ke-" + (i+1) + ": ");
            namabarang[i] = input.next();
            System.out.print("Masukkan Harga Barang ke-" + (i+1) + ": ");
            hargabarang[i] = input.nextInt();
            System.out.println("");
        }
        
        System.out.println("---   DAFTAR BARANG YANG DIMILIKI   ---");
        System.out.printf("| %-3s | %-10s | %-10s | %-8s |%n",
                "No", "Kode Barang", "Nama Barang", "Harga");
        
        for(int i = 0; i < size; i++) {
            System.out.printf("| %-3d | %-11s | %-11s | %-8d |%n",
            (i + 1), kodebarang[i], namabarang[i], hargabarang[i]);
            
        }
    }
}
