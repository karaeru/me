
package tugas;

import java.util.Scanner;

public class bilanganFaktorial {
    public static void main(String[] args) {
        int bilangan, faktorial = 1,i;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Program Bilangan Faktorial");
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();
        
        for (i = 1; i <= bilangan; i++)
            
        faktorial = faktorial*i;
            
        System.out.println("Nilai Faktorial: " + faktorial);
    }
}
