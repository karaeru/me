import java.util.Scanner;

public class pembayaran_kost {
    public static void main(String[] args) {
        
        int uang,sisa1,sisa2, pembayaranLain;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan uang anda: ");
        uang = input.nextInt();
        System.out.println("Uang anda: " + uang);
        sisa1 = uang - 500000;
        
        if (uang >= 500000){
            System.out.println("Anda dapat membayar kost");
            System.out.println("Sisa uang anda akan menjadi: " + sisa1);
            
            if (sisa1 >= 100000) {
                System.out.println("Anda dapat melakukan pembayaran lain");
                System.out.println("Masukkan uang untuk melakukan pembayaran lain: ");
                pembayaranLain = input.nextInt();
            
                sisa2 = sisa1 - pembayaranLain;
            
                System.out.println("Sisa uang anda akan menjadi: " + sisa2); 
                     
        }
        } else {
            System.out.println("Anda tidak dapat bayar kost");
        }
        
        
        
    }
}
