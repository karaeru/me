
package tugas;

import java.util.Scanner;

public class qs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
          int nilai [] = {5, 2, 8, 9};  
          int jumlah = nilai.length;
//        int[] nilai = new int[jumlah];
//        for(int i = 0; i < jumlah; i++){
//            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
//            nilai [i] = input.nextInt();
//        }
        quicksortasc(nilai, 0, jumlah-1);
        System.out.println("\nUrutan nilai asc: ");
        for(int a : nilai){
            System.out.print(a+ " ");
        }
        quicksortdesc(nilai, 0, jumlah-1);
        System.out.println("\nUrutan nilai desc: ");
        for(int b : nilai){
            System.out.print(b+ " ");
        }
    }

    private static void quicksortasc(int[] nilai, int low, int high)
    {
        if (low<high)
        {
            int pivot = partisiasc(nilai, low, high);
            
            quicksortasc(nilai, low, pivot - 1 );
            quicksortasc(nilai, pivot + 1, high );
        }
    }

    private static int partisiasc(int[] nilai, int low, int high) {
        int pivot = nilai[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++)
        {
            if(nilai[j] < pivot){
                i++;
                int tempat = nilai[i];
                nilai[i] = nilai[j];
                nilai [j] = tempat;
            }
        }
                int tempat = nilai[i+1];
                nilai[i+1] = nilai[high];
                nilai[high] = tempat;
                
                return i+1;
    }
     private static void quicksortdesc(int[] nilai, int low, int high)
    {
        if (low<high)
        {
            int pivot = partisidesc(nilai, low, high);
            
            quicksortdesc(nilai, low, pivot - 1 );
            quicksortdesc(nilai, pivot + 1, high );
        }
    }

    private static int partisidesc(int[] nilai, int low, int high) {
        int pivot = nilai[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++)
        {
            if(nilai[j] > pivot){
                i++;
                int tempat = nilai[i];
                nilai[i] = nilai[j];
                nilai [j] = tempat;
            }
        }
                int tempat = nilai[i+1];
                nilai[i+1] = nilai[high];
                nilai[high] = tempat;
                
                return i+1;
    }
}
