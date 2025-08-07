import java.util.Scanner;

public class ganjil_genap {
    
    public static void main(String[] args) {
        
        int bilangan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan bilangan: ");
        bilangan = input.nextInt();
        
        if (bilangan%2 == 0) {
            System.out.println("Genap");
        }
        else{
            System.out.println("Ganjil");
        }
    }
}