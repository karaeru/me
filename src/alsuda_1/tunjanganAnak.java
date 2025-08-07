
package alsuda_1;

import java.util.Scanner;

public class tunjanganAnak {
    public static void main(String[] args) {
        double anak, gaji, tunjangan, hasiltunjangan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah anak: ");
        anak = input.nextDouble();
        
        System.out.print("Masukkan gaji: ");
        gaji = input.nextDouble();
     
        tunjangan = gaji*0.1;
        hasiltunjangan = tunjangan*anak;
 
        
        if (anak>=1 && anak<=3){
            System.out.println("Tunjangan: " + hasiltunjangan );
        } else if(anak == 0){
            System.out.println("Tunjangan: " + hasiltunjangan);
        } else{
            System.out.println("Tujangan: " + (tunjangan * 3)); 
        }
    }
}
