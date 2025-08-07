package tugas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queueStackTest2 {
    public static void main(String[] args) {
        int menu;
        
        Stack<String> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        
         do {
            System.out.println("1. Mengelola Data Makanan (Queue)");
            System.out.println("2. Mengelola Data Pakaian (Stack)");
            System.out.println("3. Keluar Program");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            if (menu < 1 || menu > 3) {
                System.out.println("Menu tidak valid. Silakan pilih ulang!\n");
            }
        } while (menu < 1 || menu > 3);

        
        if (menu == 1){
            queue(input);
        }
        else if (menu == 2){
            stack(input);
        }
        
    }

    private static void queue(Scanner input) {
        String yesNo;
        
        Queue<String> queue = new LinkedList<>();
        
        System.out.println("\n>> Kelola data makanan <<");
        System.out.print("Masukkan jumlah data makanan: ");
        int jumlah = input.nextInt();
        
        do{
        System.out.println("Pilih langkah yang akan dilakukan: ");
        System.out.println("1. Masukkan data makananan (Enqueue)");
        System.out.println("2. Mengeluarkan data makanan (Dequeue)");
        System.out.print("langkah yang akan dilakukan adalah: ");
        int langkah = input.nextInt();
        
        
        
        if (langkah == 1){
            
                for(int i = 0; i < jumlah; i++){
                    if(queue.size() >= jumlah){
                        System.out.println("Antrian sudah penuh!!!");
                        break;
                    }
                    System.out.print("\nMasukkan data makanan index ke-"+i+" : ");
                    String data = input.next();
                    queue.offer(data);
                    System.out.println(data + " berhasil ditambahkan!");
                    System.out.println("Antrian saat ini: " + queue);
                    
                }
            
    }else if(langkah == 2){
                if(queue.isEmpty()){
                    System.out.println("Antrian sudah kosong le!!!");
                }else{
                    System.out.println("\n>>> Mengeluarkan data makanan lama <<<");
                    System.out.println("Data sebelumnya: " + queue);
                    String dataKeluar = queue.poll();
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    System.out.println("Data terbaru: " + queue);
                    
                }
                
    
       }System.out.println("\nApakah anda ingin melakukan operasi lagi? [y/t]");
            System.out.print("Pilihan anda: ");
       yesNo = input.next();
    }while(yesNo.equalsIgnoreCase("y"));
}

    private static void stack(Scanner input) {
            String yesNo;
            
            Stack<String> stack = new Stack<>();
    
        
            System.out.println("\nXXX Kelola Data Pakaian XXX");
            System.out.print("Masukkan data pakaian yang akan ditambah: ");
            int size = input.nextInt();
            
            do{
            System.out.println("\nPilih langkah yang akan dilakukan: ");
            System.out.println("1. Memasukkan data pakaian (Push)");
            System.out.println("2. Mengeluarkann data pakaian (Pop)");
            System.out.print("Langkah yang akan dilakukan adalah nomor: ");
            int langkah = input.nextInt();
            
                if (langkah == 1){
                    if(stack.size() >= size){
                        System.out.println("Kuota gudang sudah penuh!");
                    }
                    else{
                        System.out.println("\nOOO Memasukkan data pakaian OOO");
                        for(int i = 0; i <= size-1; i++){  
                        System.out.print("Data baju dengan index ke-" + i +" : " );
                        String data = input.next();
                        stack.push(data);
                        System.out.println(data + " telah ditambahkan ke gudang!");
                        System.out.println("Data tumpukan terbaru: " + stack);
                    }
                }
            }
                
                else if (langkah == 2){
                    if(stack.isEmpty()){
                        System.out.println("Tidak ada yang bisa dikeluarkan lagi!");
                    }
                    else{
                        System.out.println("OOO Mengeluarkan data pakaian terbaru OOO");
                        System.out.println("Data tumpukan sebelumnya  : " + stack);
                        System.out.println("Data tumpukan teratas\t: "+ stack.peek());
                        String dataKeluar = stack.pop();
                        System.out.println("Data yang dikeluarkan\t: "+ dataKeluar);
                        System.out.println("Data tumpukan terbaru\t: "+ stack);
                    }
                }System.out.print("\nApakah akan melakukan operasi lagi? (y/t): ");
                yesNo = input.next();
                System.out.println("");
        
    }while(yesNo.equalsIgnoreCase("y"));
    
    } 
}