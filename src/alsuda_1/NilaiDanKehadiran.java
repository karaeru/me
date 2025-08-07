package alsuda_1;

import java.util.Scanner;

public class NilaiDanKehadiran {
    public static void main(String[] args) {
        double nilai, kehadiran;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai: ");
        nilai = input.nextDouble();
        
        System.out.println("Masukkan Jumlah Kehadiran: ");
        kehadiran = input.nextDouble();
        
        if ((nilai >= 81 && nilai<= 100) && (kehadiran >=12 && kehadiran<=14)){
            System.out.println("A");
    }   else if ((nilai >= 61 && nilai<= 100) && (kehadiran >=10 && kehadiran<=14)){
            System.out.println("B");
    }   else if ((nilai >= 41 && nilai<= 60) && (kehadiran >=10 && kehadiran<=14)){
            System.out.println("C");
    }   else if ((nilai >= 0 && nilai<= 40) && (kehadiran >=0 && kehadiran<=9)){
            System.out.println("D");
    }   else if ((nilai >= 0 || nilai<= 20) && (kehadiran >=0 || kehadiran<3)){
            System.out.println("E");
    }
    
  }
}    
    
