package tugas;
import java.util.Scanner;

public class arrNegaraASEAN {
    public static void main(String[] args) {
        String[][] data = new String[11][11];
        

        Scanner input = new Scanner (System.in);

        
        for (int i = 0; i < 11; i++){
            System.out.println("Data Negara ke-" + (i+1));
            System.out.print("Masukkan Nama Negara : ");
            data [i][0] = input.nextLine();
            System.out.print("Masukkan Nama Ibu Kota Negara : ");
            data [i][1] = input.nextLine();
            System.out.println("");
            
        }
            System.out.println("----------DAFTAR NEGARA ASEAN BESERTA IBU"
                    + " KOTA NEGARA----------");
            System.out.printf("| %-4s | %-24s | %-25s |%n",
                "NO", "NEGARA", "IBU KOTA");
            for(int i = 0; i < 11; i++){
                System.out.printf("| %-4s | %-24s | %-25s |%n", 
                        (i+1), data [i][0] ,  data [i][1]);
            }
   }
            
}
    

