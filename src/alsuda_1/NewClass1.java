package alsuda_1;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        int anakA;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah anak ayam: ");
        
        anakA = input.nextInt();
        
        System.out.println("Tek - kotek, kotek-kotek");
        System.out.println("Anak ayam turun berkotek");
        
        
        while(anakA >= 0) {
            System.out.println("Anak ayam turunlah" + anakA);
        }
    }
}
