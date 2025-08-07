// NAMA : CAHYA BAGASKARA
// NPM: 5240311018
// KELAS: A/1


package tugas;
import java.util.*;

public class SistemBengkelMotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> pelangganList = new ArrayList<>();
        ArrayList<ArrayList<String>> servisPelangganList = new ArrayList<>();
        ArrayList<ArrayList<Double>> biayaPelangganList = new ArrayList<>();

        String[] daftarServis = {"Servis Rutin", "Servis Lengkap", "Ganti Oli Mesin", 
                "Ganti Oli Gardan/Samping", "Ganti Kampas Rem", "Ganti Busi", "Balancing "
                + "dan Spooring", "Ganti Ban Dalam", "Ganti Ban Luar", "Tambal Ban"};
        double[] biayaServis = {120000, 200000, 40000, 15000, 60000, 30000,50000,
                                35000, 250000, 15000};

        int pilihan;

        do {
            System.out.println("\n=========================================");
            System.out.println("\t    BENGKEL SUPRI MOTOR");
            System.out.println("=========================================");
            System.out.println("1. Tambah Data Pelanggan");
            System.out.println("2. Tambah Servis Kendaraan");
            System.out.println("3. Lihat Data");
            System.out.println("4. Tampilkan Struk Pelanggan Tertentu");
            System.out.println("5. Urutkan Data Pelanggan (Nama)");
            System.out.println("6. Keluar");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    pelangganList.add(nama);
                    servisPelangganList.add(new ArrayList<>());
                    biayaPelangganList.add(new ArrayList<>());
                    System.out.println("Data pelanggan berhasil ditambahkan!\n");
                    break;

                case 2:
                    if (pelangganList.isEmpty()) {
                        System.out.println("Harap tambahkan data pelanggan terlebih dahulu!\n");
                        break;
                    }

                    System.out.println("\n=== Pilih Pelanggan ===");
                    for (int i = 0; i < pelangganList.size(); i++) {
                        System.out.println((i + 1) + ". " + pelangganList.get(i));
                    }

                    System.out.print("Masukkan nomor pelanggan: ");
                    int pelangganIndex = input.nextInt();
                    input.nextLine();

                    if (pelangganIndex < 1 || pelangganIndex > pelangganList.size()) {
                        System.out.println("Nomor pelanggan tidak valid!\n");
                        break;
                    }

                    boolean tambahServisLagi;
                    do {
                        System.out.println("=== Pilih Jenis Servis ===");
                        for (int i = 0; i < daftarServis.length; i++) {
                            System.out.println((i + 1) + ". " + daftarServis[i] + " - Rp. " + biayaServis[i]);
                        }

                        System.out.print("Masukkan nomor jenis servis: ");
                        int nomorServis = input.nextInt();
                        input.nextLine();

                        if (nomorServis < 1 || nomorServis > daftarServis.length) {
                            System.out.println("Nomor servis tidak valid!\n");
                            break;
                        }

                        String jenisServis = daftarServis[nomorServis - 1];
                        double biaya = biayaServis[nomorServis - 1];

                        servisPelangganList.get(pelangganIndex - 1).add(jenisServis);
                        biayaPelangganList.get(pelangganIndex - 1).add(biaya);
                        System.out.println("Data servis kendaraan berhasil ditambahkan!");

                        System.out.print("Apakah ingin menambah servis lagi? (y/n): ");
                        tambahServisLagi = input.next().equalsIgnoreCase("y");
                    } while (tambahServisLagi);

                    break;

                case 3:
                    System.out.println("=== Data Pelanggan ===");
                    if (pelangganList.isEmpty()) {
                        System.out.println("Belum ada data pelanggan.");
                    } else {
                        for (int i = 0; i < pelangganList.size(); i++) {
                            System.out.println((i + 1) + ". " + pelangganList.get(i));
                            if (servisPelangganList.get(i).isEmpty()) {
                                System.out.println("   Belum ada servis.");
                            } else {
                                for (int j = 0; j < servisPelangganList.get(i).size(); j++) {
                                    System.out.println("   - " + servisPelangganList.get(i).get(j) +
                                            " Rp. " + biayaPelangganList.get(i).get(j));
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    if (pelangganList.isEmpty()) {
                        System.out.println("Data pelanggan masih kosong!\n");
                        break;
                    }

                    System.out.println("=== Pilih Pelanggan ===");
                    for (int i = 0; i < pelangganList.size(); i++) {
                        System.out.println((i + 1) + ". " + pelangganList.get(i));
                    }

                    System.out.print("Masukkan nomor pelanggan yang ingin ditampilkan: ");
                    int strukIndex = input.nextInt();
                    input.nextLine();

                    if (strukIndex < 1 || strukIndex > pelangganList.size()) {
                        System.out.println("Nomor pelanggan tidak valid!\n");
                        break;
                    }

                    String pelanggan = pelangganList.get(strukIndex - 1);
                    ArrayList<String> servis = servisPelangganList.get(strukIndex - 1);
                    ArrayList<Double> biaya = biayaPelangganList.get(strukIndex - 1);

                    System.out.println("\n=== Struk Pelanggan ===");
                    System.out.println("Nama: " + pelanggan);

                    double totalBiaya = 0;
                    for (int i = 0; i < servis.size(); i++) {
                        System.out.println(servis.get(i) + " - Biaya: Rp " + biaya.get(i));
                        totalBiaya += biaya.get(i);
                    }

                    System.out.println("Total Biaya: Rp " + totalBiaya + "\n");

                    System.out.print("Apakah ingin menghapus data pelanggan ini? (y/n): ");
                    if (input.next().equalsIgnoreCase("y")) {
                        pelangganList.remove(strukIndex - 1);
                        servisPelangganList.remove(strukIndex - 1);
                        biayaPelangganList.remove(strukIndex - 1);
                        System.out.println("Data pelanggan berhasil dihapus.\n");
                    } else {
                        System.out.println("Data pelanggan tidak dihapus.\n");
                    }
                    break;


                case 5:
                    if (pelangganList.isEmpty()) {
                        System.out.println("Belum ada data pelanggan untuk diurutkan!\n");
                        break;
                    }

                    System.out.println("Mengurutkan data pelanggan berdasarkan nama...");
                    ArrayList<String> pelangganListUrut = new ArrayList<>(pelangganList);
                    Collections.sort(pelangganListUrut);
                    System.out.println("Data pelanggan setelah diurutkan:");
                    for (String pelangganSort : pelangganListUrut) {
                        System.out.println("- " + pelangganSort);
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Program Dihentikan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        } while (pilihan != 6);
        
    }
}
