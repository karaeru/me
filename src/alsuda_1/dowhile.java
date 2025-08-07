package alsuda_1;

import java.util.Scanner;

public class dowhile {

public class LoopTokoBuah {
    public static void main(String[] args) {
        int harga, jumlah;
        int sum = 0;
        int totalHarga = 0;
        String varian, pilihan;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("================================");
            System.out.println("Varian Buah Yang Tersedia");
            System.out.println("1. Alpukat   || Rp.27.500");
            System.out.println("2. Buah Naga || Rp.38.000");
            System.out.println("3. Jeruk     || Rp.17.000");
            System.out.println("4. Mangga    || Rp.22.000");
            System.out.println("5. Pepaya    || Rp.25.000");
            System.out.println("================================");

            System.out.print("Varian Buah : ");
            varian = input.next();

            System.out.print("Harga : ");
            harga = input.nextInt();

            System.out.print("Jumlah Beli : ");
            jumlah = input.nextInt();
            
            System.out.println("");
            System.out.println("*** RINCIAN BELANJA ***");
            System.out.println("Nama Buah : " + varian);
            System.out.println("Harga Buah : " + harga);
            System.out.println("Total Harga Buah : " + (jumlah * harga));
            System.out.println("");

            sum += jumlah;
            totalHarga += (jumlah * harga); // Menghitung total harga berdasarkan jumlah dan harga

            System.out.print("Apakah Anda masih mau membeli buah? [Y/N]: ");
            pilihan = input.next();

            System.out.println("");

        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("");
        System.out.println("Total buah yang dibeli: " + sum);
        System.out.println("Total harga belanja: Rp " + totalHarga);
        System.out.println("");
        System.out.println("Terima kasih telah berbelanja!");
    }
}

}
