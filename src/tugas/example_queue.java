package tugas;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class example_queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.print("Masukkan banyak data: ");
        int data = input.nextInt();
        
        for(int i = 0; i < data; i++){
        System.out.print("Tambahkan antrian: ");
        queue.add(input.next());
        }
        
        System.out.println("Queue setelah enqueue: " + queue);


        System.out.println("Elemen di depan: " + queue.peek());


        System.out.println("Elemen yang dikeluarkan: " + queue.poll());


        System.out.println("Queue setelah dequeue: " + queue);
    }
}
