
package tugas;
import java.util.Scanner;

public class tes {
  

 public static void main(String[] args) {
        double angka,average,total;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak angka yang ingin di input: ");
        int size = input.nextInt();
        
        double[] a= new double [size];
        total = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan angka ke- " + (i+1)+ ": ");
            a[i] = input.nextDouble();
            total += a[i];
          }
          average = total/size;
          System.out.println("Rata-rata \t: " + average);
    }
}


