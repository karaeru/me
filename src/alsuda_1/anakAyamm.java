package alsuda_1;

import java.util.Scanner;

public class anakAyamm {
    public static void main(String[] args) {
        int anakA;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah anak ayam: ");
        anakA = input.nextInt();
        
        System.out.println("Tek-kotek,kotek-kotek");
        System.out.println("Anak ayam turun berkotek");
        
        for(int i = anakA; i >= 1; i--){
            if (i > 1){
                System.out.println("Anak ayam turunlah " + i + ", mati satu tinggallah " + (i-1));
            } else {
                System.out.println("Anak ayam turunlah 1, mati satu tinggal induknya");
            }
            
        }
    }
}
