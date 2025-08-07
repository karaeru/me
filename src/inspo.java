import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan {
    String nama;
    String noTelepon;

    Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", No. Telepon: " + noTelepon;
    }
}

class Kendaraan {
    String nomorPolisi;
    String jenisKendaraan;
    String pemilik;

    Kendaraan(String nomorPolisi, String jenisKendaraan, String pemilik) {
        this.nomorPolisi = nomorPolisi;
        this.jenisKendaraan = jenisKendaraan;
        this.pemilik = pemilik;
    }

    @Override
    public String toString() {
        return "No. Polisi: " + nomorPolisi + ", Jenis: " + jenisKendaraan + ", Pemilik: " + pemilik;
    }
}

class Servis {
    String nomorPolisi;
    String deskripsiServis;
    double biaya;

    Servis(String nomorPolisi, String deskripsiServis, double biaya) {
        this.nomorPolisi = nomorPolisi;
        this.deskripsiServis = deskripsiServis;
        this.biaya = biaya;
    }

    @Override
    public String toString() {
        return "No. Polisi: " + nomorPolisi + ", Servis: " + deskripsiServis + ", Biaya: Rp" + biaya;
    }
}

public class inspo {
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    static ArrayList<Servis> daftarServis = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Informasi Bengkel ===");
            System.out.println("1. Tambah Data Pelanggan");
            System.out.println("2. Tambah Data Kendaraan");
            System.out.println("3. Tambah Data Servis");
            System.out.println("4. Lihat Semua Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1 -> tambahPelanggan();
                case 2 -> tambahKendaraan();
                case 3 -> tambahServis();
                case 4 -> lihatSemuaData();
                case 5 -> System.out.println("Keluar dari sistem.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahPelanggan() {
        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("No. Telepon: ");
        String noTelepon = scanner.nextLine();
        daftarPelanggan.add(new Pelanggan(nama, noTelepon));
        System.out.println("Data pelanggan berhasil ditambahkan.");
    }

    static void tambahKendaraan() {
        System.out.print("No. Polisi: ");
        String nomorPolisi = scanner.nextLine();
        System.out.print("Jenis Kendaraan: ");
        String jenisKendaraan = scanner.nextLine();
        System.out.print("Nama Pemilik: ");
        String pemilik = scanner.nextLine();
        daftarKendaraan.add(new Kendaraan(nomorPolisi, jenisKendaraan, pemilik));
        System.out.println("Data kendaraan berhasil ditambahkan.");
    }

    static void tambahServis() {
        System.out.print("No. Polisi Kendaraan: ");
        String nomorPolisi = scanner.nextLine();
        System.out.print("Deskripsi Servis: ");
        String deskripsiServis = scanner.nextLine();
        System.out.print("Biaya Servis: ");
        double biaya = scanner.nextDouble();
        daftarServis.add(new Servis(nomorPolisi, deskripsiServis, biaya));
        System.out.println("Data servis berhasil ditambahkan.");
    }

    static void lihatSemuaData() {
        System.out.println("\n--- Data Pelanggan ---");
        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println(pelanggan);
        }

        System.out.println("\n--- Data Kendaraan ---");
        for (Kendaraan kendaraan : daftarKendaraan) {
            System.out.println(kendaraan);
        }

        System.out.println("\n--- Data Servis ---");
        for (Servis servis : daftarServis) {
            System.out.println(servis);
        }
    }
}
