
package tugas;

import java.util.Scanner;

public class tampilkanBintang {
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai N: ");
        n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
