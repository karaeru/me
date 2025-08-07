import java.util.Scanner;

public class keliling_luas_persegiPanjang {

    public static void main(String[] args) {
        
        double p, l, keliling, luas;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan nilai panjang: ");
        p = input.nextDouble();
         
        System.out.println("Masukan nilai lebar: ");
        l = input.nextDouble();
        
        keliling = 2*p + 2*l;
        luas = p*l;
        
        System.out.println("Keliling: " + keliling);
        System.out.println("Luas: " + luas);
    }
}
