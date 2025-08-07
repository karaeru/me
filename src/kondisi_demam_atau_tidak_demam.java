
import java.util.Scanner;

public class kondisi_demam_atau_tidak_demam {
  
    public static void main(String[] args) {
        float suhu;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Suhu tubuh: ");
        suhu = input.nextFloat();
        
        if (suhu > 39) {
            System.out.println("Demam");
        } else {
            System.out.println("Normal");
        }
    }
}
