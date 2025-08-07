package alsuda_1;

import java.util.Scanner;

public class ALSUDA_1 {

    public static void main(String[] args) {
        final double phi = 3.14;
        double r, keliling, luas;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai jari-jari: ");
        r = input.nextDouble();
        
        keliling = 2 * phi * r;
        luas = phi * r * r;
        
        System.out.println("Keliling = " + keliling);
        System.out.println("Luas= " + luas);
        
    }
    
}
