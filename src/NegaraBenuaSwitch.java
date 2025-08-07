
import java.util.Scanner;

public class NegaraBenuaSwitch {
    public static void main(String[] args) {
        int kodeBenua;
        String bagianBenua;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Masukkan kode benua: ");
        kodeBenua = input.nextInt();
       
        switch (kodeBenua) {
            case 1:
                System.out.println("Benua Asia");
                System.out.println("Masukkan Bagian Benua: ");
                  bagianBenua = input.next().toLowerCase();
                    switch (bagianBenua){
                        case("timur") :
                            System.out.println("Negara Asia bagian Timur adalah:");
                            System.out.println("China, Jepang, Korut,Korsel");
                            break;
                        case("barat") : 
                            System.out.println("Negara Asia bagian Barat adalah:");
                            System.out.println("Irak, Iran, Yordania, Palestina");
                            break;
                        case("selatan") : 
                            System.out.println("Negara Asia bagian Selatan adalah:");
                            System.out.println("Bangladesh, Bhutan, India, Maladewa");
                            break;
                        case("tenggara") : 
                            System.out.println("Negara Asia bagian Tenggara adalah:");
                            System.out.println("Indonesia, Singapura, Malaysia");
                            break;
                        case("tengah") : 
                            System.out.println("Negara Asia bagian Tengah adalah:");
                            System.out.println("Kazakhstan, Kirgistan, Taijikistan");
                            break;
                        default:
                            System.out.println("Bagian benua tidak valid");
                    }break;

            case 2:
                System.out.println("Benua Eropa");
                System.out.println("Masukkan bagian benua: ");
                bagianBenua = input.next().toLowerCase();
                    switch (bagianBenua){
                        case("timur") :
                            System.out.println("Negara Eropa bagian Timur dalah:");
                            System.out.println("Rusia, Ukraina, Moldova");
                            break;
                        case("barat") : 
                            System.out.println("Negara Eropa bagian Barat adalah:");
                            System.out.println("Austria, Jerman, Prancis");
                            break;
                        case("selatan") : 
                            System.out.println("Negara Eropa bagian Selatan adalah:");
                            System.out.println("Portugal, Spanyol, Italia");
                            break;
                        default:
                            System.out.println("Bagian benua tidak valid");
                    }break;
                    
            case 3:
               System.out.println("Benua Amerika");
               System.out.println("Masukkan Bagian Benua");
               bagianBenua = input.next().toLowerCase();
                    switch (bagianBenua){
                        case("utara") : 
                            System.out.println("Negara Amerika bagian Utara adalah:");
                            System.out.println("Amerika Serikat, Meksiko, Kanada");
                            break;
                        case("tengah") : 
                            System.out.println("Negara Amerika bagian Tengah adalah:");
                            System.out.println("Guetemala, Honduras, El Salvador");
                            break;
                        case("selatan") : 
                            System.out.println("Negara Amerika bagian Selatan adalah:");
                            System.out.println("Amerika Serikat, Meksiko, Kanada");
                            break;
                        default:
                            System.out.println("Bagian benua tidak valid");
                    }break;
                    
            default: 
                System.out.println("Kode benua tidak valid");
        }
    }
}
    
