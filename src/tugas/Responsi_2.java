package tugas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Responsi_2 {
    public static void main(String[] args) {
        int size = 5;
        int i;
        String yesno;
        
        Scanner input = new Scanner (System.in);
        Queue<String> queue = new LinkedList<>();
        String [] nama = new String [size];
        String [] matkul = new String [size];
        int [] tanggal = new int [size];
        
        
        do{
        System.out.println("\nSISTEM PENCATATAN TUGAS");
        System.out.println("1. Tambah Data tugas");
        System.out.println("2. Tampilkan data tugas");
        System.out.println("3. Urutkan data berdasarkan tanggal deadline (Quicksort)");
        System.out.println("4. Keluarkan data berdasarkan tanggal deadline (Queue)");
        
        System.out.print("Pilih menu: ");
        int menu = input.nextInt();
        
        
        switch (menu){
            case 1:
                
                if (queue.size() >= size){
                    System.out.println("Kapasitas Sudah Penuh");
                }else{
                 for(i = 0; i < size; i++){
                System.out.println("\n<> MEMASUKKAN DATA TUGAS <>");
                System.out.print("Masukkan Nama Tugas \t\t: ");
                nama [i]= input.next();
                System.out.print("Masukkan Mata Kuliah \t\t: ");
                matkul [i]= input.next();
                System.out.print("Masukkan Tanggal Deadline (yyyy-mm-dd) \t: ");
                tanggal [i] = input.nextInt();
                 }
                
                System.out.println("Data tugas berhasil ditambahkan!");
                
                }
                break;
                
            case 2:
//                if (queue.isEmpty()){
//                    System.out.println("Belum ada data!");
//                }else{
                System.out.println("\n-----------DATA TUGAS YANG TERSIMPAN--------------");
                System.out.printf("| %-15s| %-22s | %-17s |%n",
                "NAMA TUGAS", "MATA KULIAH", "TANGGAL DEADLINE");
                for(i = 0; i <= size; i++) {
            System.out.printf("|%-15s | %-23s | %-17d|%n",
            nama[i], matkul[i], tanggal[i]);
//                }
            }break;
                
            case 3:
                if (queue.isEmpty()){
                    System.out.println("Belum ada data!");
                }else{
                System.out.println("-----------DATA TUGAS YANG SUDAH DIURUTKAN--------------");
                System.out.printf("| %-15s | %-22s | %-17s |%n",
                "NAMA TUGAS", "MATA KULIAH", "TANGGAL DEADLINE");
                for(i = 0; i < size; i++) {
            System.out.printf("|%-11s | %-11s | %-8d |%n",
             nama[i], matkul[i]);
                }
            }break;
            case 4:
                if (queue.isEmpty()){
                    System.out.println("Data sudah kosong!");
                }else{
                System.out.println("<> MENGELUARKAN DATA BERDASARKAN DEADLINE <>");
                System.out.println("Data tugas yang dikeluarkan: ");
                System.out.println(queue.poll());
                
                System.out.println("-----------DATA TUGAS SETELAH DIKELUARKAN--------------");
                System.out.printf("| %-15s | %-22s | %-17s |%n",
                "NAMA TUGAS", "MATA KULIAH", "TANGGAL DEADLINE");
         
                for(i = 0; i < size; i++) {
            System.out.printf("| %-3d | %-11s | %-11s | %-8d |%n",
            (i + 1), nama[i], matkul[i], tanggal[i]);
                }
        }   
        }
            System.out.print("Apakah akan melakukan lagi [y/n]: ");
            yesno = input.next();
    }while (yesno.equalsIgnoreCase("y"));
        }
    
}

    

