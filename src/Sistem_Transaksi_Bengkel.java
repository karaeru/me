
import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan{
    String nama, noTelp;
    
    public Pelanggan(String nama, String noTelp){
        this.nama = nama;
        
    }
}


public class Sistem_Transaksi_Bengkel {
    public static void main(String[] args) {
        int menu;

        System.out.println("=======================================");
        System.out.println("\t\t   MENU");
        System.out.println("=======================================");
        System.out.println("1. Tambah Data Pelanggan");
        System.out.println("2. Tambah Servis Kendaraan");
        System.out.println("3. Lihat Data");
        System.out.println("4. Tampilkan Struk");
        System.out.println("5. Keluar");
        System.out.println("=======================================");
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Pilih Menu: ");
        menu = input.nextInt();
        
        if (menu == 1){
            data();
        }
        else if (menu == 2){
            kendaraan();
        }
    }

    private static void data() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> namaPel = new ArrayList<>();
        ArrayList<String> noTelp = new ArrayList<>();
        
        namaPel.toArray();
        
        int jumlah = namaPel.size();
                
        for(int i = 0; i<2; i++){
        System.out.print("Nama Pelanggan: ");
        String nama = input.next();
        namaPel.add(nama);
        
        System.out.print("Masukkan notelp: ");
        String notelp = input.next();
        noTelp.add(notelp);
        }
        String [] datapel= namaPel.toArray(new String[namaPel.size()]);
        
        
        for(int i = 0; i <= jumlah; i++)
        System.out.println("Daftar pelanggan: " + datapel[i] + noTelp);
        
        int i = 0;
        
        System.out.println("Masukkan antrian yang akan dikeluarkan: ");
        int index = input.nextInt();
        System.out.println("Daftar pelanggan: " + namaPel.get(index) + noTelp.get(index));

    }

    private static void kendaraan() {
        Scanner input = new Scanner (System.in);
        ArrayList<String> kendaraan = new ArrayList<>();
        
        String jenis = input.next();
        kendaraan.add(jenis);
        
        System.out.println(kendaraan);
        kendaraan.remove(jenis);
        System.out.println(kendaraan);
        
    }
}
