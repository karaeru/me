package tugas;

import java.util.Scanner;
import java.util.Stack;

public class antrianStack {
    public static void main(String[] args) {
        int nilai;
        String yesNo;
        
        Stack <Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();
        
        do{
        System.out.println("Pilih menu: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. rata rata");
        System.out.print("Masukkan pilihan menu: ");
        int menu = input.nextInt();
        

        if (menu == 1){
            if (stack.size() >= jumlah){
                System.out.println("Stack sudah penuh!");
            }else{
            System.out.println("Data saat ini: " + stack);
            System.out.print("Masukkan nilai: ");
            nilai = input.nextInt();
            stack.add(nilai);
            System.out.println("Data terbaru: " + stack);
            }
        }
        else if (menu == 2){
            if(stack.isEmpty()){
                System.out.println("Stack sudah kosong");
            }
            else{
            System.out.println("Data saat ini: " + stack);
            stack.pop();
            System.out.println("Data terbaru: " + stack);
            }
        }
        else if(menu == 3){
            double rata = 0;
            System.out.println("Nilai saat ini: " + stack);
            for (int n : stack ){ 
                rata += n;
            }
            double average;
            average = rata / stack.size();
            System.out.println("Rata rata: "+ average);
        }
            System.out.print("Apakah Andaingin melakukan operasi lagi? [y/n]");
             yesNo = input.next();
        }while(yesNo.equalsIgnoreCase("y"));    
    }
}
