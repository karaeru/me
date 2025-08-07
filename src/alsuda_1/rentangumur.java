
package alsuda_1;

import java.util.Scanner;

/**
 *
 * @author Kararara
 */
public class rentangumur {
    public static void main(String[] args) {
        int umur;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda: ");
        umur = input.nextInt();
        
        if (umur >= 0 && umur<= 5){
            System.out.println("Anda Balita");
        }else if (umur >=6 && umur<= 12){
            System.out.println("Anda Anak-anak");
        }else if (umur >= 13 && umur <= 17){
            System.out.println("Anda remaja: ");
        }else if (umur >= 18 && umur <= 50){
            System.out.println("Anda Fewasa");
        }else if (umur >= 50 && umur <= 100){
            System.out.println("Anda Lansia");
        }else if (umur > 100){
            System.out.println("Anda Sesepuh");
        }else {
            System.out.println("Anda belum lahir");
        }
    }
}
