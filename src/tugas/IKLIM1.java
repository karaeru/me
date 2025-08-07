package tugas;


import java.util.Scanner;

public class IKLIM1 {

    public static String iklimNegara(String negara){
        if (negara.equalsIgnoreCase("Indonesia") ||
                negara.equalsIgnoreCase("Malaysia") ||
                    negara.equalsIgnoreCase("Singapura")){
            return "Iklim Tropis";
        } else if (negara.equalsIgnoreCase("Jepang") || 
                        negara.equalsIgnoreCase("Turki") || 
                            negara.equalsIgnoreCase("Mesir")) {
            return "Iklim Subtropis";
        } else if (negara.equalsIgnoreCase("Kutub Selatan") || 
                      negara.equalsIgnoreCase("Kutub Utara")) {
            return "Iklim Dingin";
        } else if (negara.equalsIgnoreCase("Jerman") || 
                        negara.equalsIgnoreCase("Inggris") || 
                            negara.equalsIgnoreCase("Prancis")) {
            return "Iklim Sedang";
        } else
            return "Negara tidak terdaftar";
    }
        
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nama negara: ");
        String negaraInput = scanner.nextLine();

        
        String iklim = iklimNegara(negaraInput);
        System.out.println("Iklim di " + negaraInput + ": " + iklim);

        scanner.close();
        }
    }



