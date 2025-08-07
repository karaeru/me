
package alsuda_1;

import java.util.Scanner;

/**
 *
 * @author Kararara
 */
public class uts_2 {
    public static void main(String[] args) {
        double lamaParkir, totalBiaya,biayaParkir,
                jamMasuk,jamKeluar,jamTambah,totaljam,totalJamlebih;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam masuk: " );
        jamMasuk = input.nextDouble();
        
        System.out.print("Masukkan jam keluar: ");
        jamKeluar = input.nextDouble();
        
        lamaParkir = jamKeluar-jamMasuk;
        System.out.println("Lama parkir: " + lamaParkir);
        
        biayaParkir = 2000;
        totaljam = jamKeluar + jamMasuk;
        
        if (lamaParkir == 1){
            System.out.println("Biaya Parkir : " + biayaParkir);
        } else if(lamaParkir  == 2 ){
            System.out.println("Biaya Parkir : " + (biayaParkir*2) );
        } else if (lamaParkir > 2 ){
         
                jamTambah = totaljam - 2;
                totalJamlebih = jamTambah*500;
                totalBiaya = totalJamlebih + 3000;
                System.out.println("Biaya Parkir : " + totalBiaya);
            } 
        }
        
        
        
    }

