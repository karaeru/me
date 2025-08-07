package tugas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class antrian {
    public static void main(String[] args) {
        int pilihan, data, datakeluar;
        String yn;
        
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        
        System.out.print("Masukkan jumlah data antrian: ");
        int size = input.nextInt();
        
        
        System.out.print("Masukkan nomor antrian pertama: ");
        data = input.nextInt();
        queue.offer(data);
        
        do{
            System.out.println("\nData antrian saat ini");
            System.out.println(queue);
            
            System.out.println("Pilih operasi yang akan dilakukan: ");
            System.out.println("1. Offer() ==> Input data");
            System.out.println("2. Poll() ==> keluarkan data");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            
            if(pilihan == 1){
                if(queue.size() >= size){
                    System.out.println("\nANTRIAN PENUH!!!!");
                    System.out.println("Data antrian saat ini");
                    System.out.println(queue);
                }else{
                    System.out.println("\n*** Menambahkan Data (Enque) ***");
                    System.out.print("Tambah antrian baru  : ");
                    data = input.nextInt();
                    queue.offer(data);
                    System.out.print("Data antrian terbaru: ");}
                    System.out.println(queue);
                
            }
            else if(pilihan == 2){
                if(queue.isEmpty()){
                    System.out.println("Antrian kosong!!!! \nTidak ada yang bisa dikeluarkan");
                }
                else{System.out.println("\n*** Mengeluarkan Data (Deque) ***");
                datakeluar = queue.poll();
                System.out.println("Antrean yang dikeluarkan : " + datakeluar);
                
                System.out.println("Data antrian terbaru: " + queue);
                }
            }
            System.out.print("\nApakah akan melakukan operasi lagi? (y/t): ");
            yn = input.next();
            System.out.println("");
        }while(yn.equalsIgnoreCase("y"));
    }
}

