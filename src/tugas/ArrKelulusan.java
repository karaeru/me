package tugas;

public class ArrKelulusan {
    public static void main(String[] args) {
     
          String [] tahun = {"2015", "2016", "Rata-Rata"};

          int [] sarjana = {40, 50, 45};
          int [] diploma = {60, 90, 75};
          String [] rataRata = {"50", "70", ""};
          
          String[] header = {"Thn / Prodi", "S1 Sistem Inf", "D3 Sist Inf", 
          "Rata-rata lulus "};
        
        for (String h : header){
        System.out.printf("| %-12s", h);
        }
        System.out.println("|");
        
        for (int i = 0; i < tahun.length; i++) {
            System.out.printf("| %-12s| %-13s| %-12s| %-16s|\n",
                    tahun[i], sarjana[i], diploma[i], rataRata[i]);
        }
    }
}
