package alsuda_1;

import java.util.Scanner;

public class bilanganGanjil {
    public static void main(String[] args) {
        int awal, akhir;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai awal: ");
        awal = input.nextInt();
        
        System.out.println("Masukkan nilai akhir: ");
        akhir = input.nextInt();
        
        for(int i = awal; i <= akhir ; i ++) {
            if (i % 2 == 1 ){
                System.out.println("Bilangan Ganjil = " + i);
        } else if(i % 2 == 0){
                System.out.println("Bilangan Genap = " + i);
        }
     }
  }
}
