import java.util.Scanner;

public class NegaraBerdasarkanBenua {
    public static void main(String[] args) {
        int kodeBenua;
        String bagianBenua;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Masukkan Kode Benua: ");
        kodeBenua = input.nextInt();
        
        if (kodeBenua == 1) {
                System.out.println("Benua Asia");
                System.out.println("Masukkan Bagian Benua: ");
                bagianBenua = input.next();
                if (bagianBenua.equalsIgnoreCase("Timur")){
                    System.out.println("Negara di Asia bagian Timur adalah:");
                    System.out.println("China, Jepang, Korut,Korsel");
                } else if (bagianBenua.equalsIgnoreCase("Barat")){
                    System.out.println("Negara di Asia bagian Barat adalah:");
                    System.out.println("Irak, Iran, Yordania, Palestina");
                } else if (bagianBenua.equalsIgnoreCase("Selatan")){
                    System.out.println("Negara di Asia bagian Selatan adalah:");
                    System.out.println("Bangladesh, Bhutan, India, Maladewa");
                } else if (bagianBenua.equalsIgnoreCase("Tenggara")){
                    System.out.println("Negara di Asia bagian Tenggara adalah:");
                    System.out.println("Indonesia, Singapura, Malaysia");
                } else if (bagianBenua.equalsIgnoreCase("Tengah")){
                    System.out.println("Negara di Asia bagian Tengah adalah:");
                    System.out.println("Kazakhstan, Kirgistan, Taijikistan");
                }else System.out.println("Bagian benua tidak valid");
                
        } else if (kodeBenua == 2){
                System.out.println("Benua Eropa");
                System.out.println("Masukkan Bagian Benua");
                bagianBenua = input.next();
                if (bagianBenua.equalsIgnoreCase("Timur")){
                    System.out.println("Negara di Eropa bagian Timur dalah:");
                    System.out.println("Rusia, Ukraina, Moldova");
                } else if (bagianBenua.equalsIgnoreCase("Barat")){
                    System.out.println("Negara di Eropa bagian Barat dalah:");
                    System.out.println("Austria, Jerman, Prancis");
                } else if (bagianBenua.equalsIgnoreCase("Selatan")){
                    System.out.println("Negara di Eropa bagian Selatan dalah:");
                    System.out.println("Portugal, Spanyol, Italia");
                } else if (bagianBenua.equalsIgnoreCase("Utara")){
                    System.out.println("Negara di Eropa bagian Utara dalah:");
                    System.out.println("Inggris, Irlandia, Norwegia");
                }else System.out.println("Bagian benua tidak valid");
       
        } else if (kodeBenua == 3){
                System.out.println("Benua Amerika");
                System.out.println("Masukkan Bagian Benua");
                bagianBenua = input.next();
                if (bagianBenua.equalsIgnoreCase("Utara")){
                    System.out.println("Negara di Amerika bagian Utara adalah:");
                    System.out.println("Amerika Serikat, Meksiko, Kanada");
                } else if (bagianBenua.equalsIgnoreCase("Tengah")){
                    System.out.println("Negara di Amerika bagian Tengah adalah:");
                    System.out.println("Guetemala, Honduras, El Salvador");
                } else if (bagianBenua.equalsIgnoreCase("Selatan")){
                    System.out.println("Negara di Amerika bagian Selatan adalah:");
                    System.out.println("Argentina, Brasil, Chili, dll");
                } else System.out.println("Bagian benua tidak valid");
            
        } else 
            System.out.println("Kode benua tidak valid");
      }
  }

