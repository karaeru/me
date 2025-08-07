package tugas;

import java.util.Scanner;

public class arrBuku {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Jumlah buku yang akan dicatat: ");
        size = input.nextInt();
        String[][] data = new String[size][];
        System.out.println("");



        
        for (int i = 0; i < size; i++){
            System.out.println("Data Buku ke-" + (i+1));
            System.out.print("Masukkan ISBN Buku      : ");
            data [i][0] = input.next();
            input.nextLine();
            System.out.print("Masukkan Judul Buku     : ");
            data [i][1] = input.nextLine();
            System.out.print("Masukkan Nama Pengarang : ");
            data [i][2] = input.nextLine();
            System.out.print("Masukkan Nama Penerbit  : ");
            data [i][3] = input.nextLine();
            System.out.print("Masukkan Jumlah Halaman : ");
            data [i][4] = input.nextLine();
            System.out.println("");
            
        }
            System.out.println(" --------------------------"
                    + "-------DAFTAR BUKU PERPUSTAKAAN"
                    + " CIHUY----------------------------------");
            System.out.printf("| %-15s | %-22s | %-17s | %-17s | %-17s |%n",
                "ISBN BUKU", "JUDUL BUKU", "NAMA PENGARANG", "NAMA PENERBIT",
                "JUMLAH HALAMAN");
            for(int i = 0; i < size; i++){
                System.out.printf("| %-15s | %-22s | %-17s | %-17s | %-17s |%n",
                        data [i][0] ,  data [i][1], data [i][2],data [i][3]
                        ,data [i][4]);
            }
   }
}
