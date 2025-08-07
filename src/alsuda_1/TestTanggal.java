package alsuda_1;

import java.util.Date;

public class TestTanggal{

  public static void main(String args[]) {
     // object tanggal
     Date date = new Date();

     // menampilkan tanggal dan waktu menggunakan toString()
     String tanggal = String.format("Tanggal dan waktu saat ini : %tc", date );

     System.out.println(tanggal);
  }
}