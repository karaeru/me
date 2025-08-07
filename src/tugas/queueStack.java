package tugas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queueStack {
    public static void main(String[] args) {
        int menu, size, langkah;
        String data, yesNo, dataKeluar;
        
        Queue<String> queue = new LinkedList<>();
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
                System.out.println("\n*** Kelola Data Makanan ***");
                System.out.print("Masukkan data makanan yang akan ditambah: ");
                size = input.nextInt();
                
                
                do{
                System.out.println("\nPilih Langkah yang akan dilakukan: ");
                System.out.println("1. Memasukkan data makanan (Enqueue)");
                System.out.println("2. mengeluarkan data makanan (Dequeue)");
                System.out.print("Langkah yang akan dilakukan adalah nomor: ");
                langkah = input.nextInt();
                
                if(langkah == 1){
                    
                        if(queue.size() >= size){
                            System.out.println("Kuota penyimpanan telah penuh!!!");
                        }
                        else{
                            System.out.println("\n>> Memasukkan data makanan terbaru <<");
                            for (int i = 0; i <=size-1; i++){
                            System.out.print("Data makanan dengan index ke- "+ i +": ");
                            data = input.next();
                            queue.offer(data);
                            System.out.println(data + " berhasil ditambahkan!");
                            System.out.println("Data antrian terbaru: " + queue);
                        }
                    }
                }else if(langkah == 2){
                    if(queue.isEmpty()){
                        System.out.println("Data makanan sudah kosong!!!");
                        System.out.println("Tidak ada yang bisa dikeluarkan lagi!!!");
                    }
                    else{
                        System.out.println("\n>> Mengeluarkan data makanan lama <<");
                        System.out.println("Data antrian sebelumnya: " + queue);
                        dataKeluar = queue.poll();
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        System.out.println("Data antrian terbaru: " + queue);
                    }
                }
                
                System.out.print("\nApakah akan melakukan operasi lagi? (y/t): ");
                yesNo = input.next();
                System.out.println("");
                
                }while(yesNo.equalsIgnoreCase("y"));
            
                
                    
            }else if (menu == 2){
            System.out.println("\nXXX Kelola Data Pakaian XXX");
            System.out.print("Masukkan data pakaian yang akan ditambah: ");
            size = input.nextInt();
            
            do{
            System.out.println("\nPilih langkah yang akan dilakukan: ");
            System.out.println("1. Memasukkan data pakaian (Push)");
            System.out.println("2. Mengeluarkann data pakaian (Pop)");
            System.out.print("Langkah yang akan dilakukan adalah nomor: ");
            langkah = input.nextInt();
            
                if (langkah == 1){
                    if(stack.size() >= size){
                        System.out.println("Kuota gudang sudah penuh!");
                    }
                    else{
                        System.out.println("\nOOO Memasukkan data pakaian OOO");
                        for(int i = 0; i <= size-1; i++){  
                        System.out.print("Data baju dengan index ke-" + i +" : " );
                        data = input.next();
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
                        System.out.println("\nOOO Mengeluarkan data pakaian terbaru OOO");
                        System.out.println("Data tumpukan sebelumnya  : " + stack);
                        System.out.println("Data tumpukan teratas\t: "+ stack.peek());
                        dataKeluar = stack.pop();
                        System.out.println("Data yang dikeluarkan\t: "+ dataKeluar);
                        System.out.println("Data tumpukan terbaru\t: "+ stack);
                    }
                }System.out.print("\nApakah akan melakukan operasi lagi? (y/t): ");
                yesNo = input.next();
                System.out.println("");
                
                }while(yesNo.equalsIgnoreCase("y"));
        }
            else if(menu == 3 ){
                System.out.println("Anda keluar program!!!");
            }
        System.out.println("Anda Keluar program!!!");
    }
}
