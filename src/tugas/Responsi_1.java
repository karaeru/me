
package tugas;

import java.util.Scanner;

public class Responsi_1 {
    public static void main(String[] args) {
        int namaCam = 0,kodeCam;
        String namaPel, pilihan;
        double subtotal, hargasewa=0, totalsewa=0, totalbayar=0;
        float lamasewa=0;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("         KATALOG RENTAL KAMERA");
        System.out.println("=======================================");
        System.out.println("Jenis kamera yang disewakan:");
        System.out.println("1. Action Cam");
        System.out.println("2. DSLR");
        System.out.println("3. Mirrorless");
        System.out.println("=======================================");
        
        
        do{
        System.out.print("Pilih jenis kamera yang akan disewa: ");
        kodeCam = input.nextInt();
        System.out.println("");
        
        if (kodeCam == 1){
            System.out.println("Daftar nama dan harga Kamera Mirrorless:");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("No ||      Nama Kamera       ||   Harga Sewa /24jam   ||   Harga Sewa /12jam");
            System.out.println("1. || Go Pro Hero 9          ||      Rp.140.000       ||      Rp. 100.000");
            System.out.println("2. || Insta 360 One X3       ||      Rp.200.000       ||      Rp. 150.100");
            System.out.println("3. || Dji Osmo Pocket 3      ||      Rp.250.000       ||      Rp. 180.100");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("");
            
            System.out.print("Pilih nama kamera berdasarkan kode: ");
            namaCam = input.nextInt();
                
            System.out.print("Ingin sewa berapa lama? ");
            lamasewa = input.nextFloat();
            System.out.println("");
            
            if (namaCam == 1){
                hargasewa= 140000;
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Action Cam");
                System.out.println("Nama Kamera: Go Pro Hero 9");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 100000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 140000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 140000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
                
            }else if (namaCam == 2){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Action Cam");
                System.out.println("Nama Kamera: Insta 360 One X3");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 150000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 200000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 200000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
                
            }else if (namaCam == 3){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Action Cam");
                System.out.println("Nama Kamera: Dji Osmo Pocket 3");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 180000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 250000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 250000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
                
            }
            
        }else if (kodeCam == 2){
            System.out.println("Daftar nama dan harga Kamera Mirrorless:");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("No ||      Nama Kamera       ||   Harga Sewa /24jam   ||   Harga Sewa /12jam");
            System.out.println("1. || Canon 600D             ||      Rp.100.000       ||      Rp. 70.000");
            System.out.println("2. || Canon 1500D Kit        ||      Rp.95.000        ||      Rp. 65.100");
            System.out.println("3. || Nikon D5200            ||      Rp.100.000       ||      Rp. 70.100");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("");
            
            System.out.print("Pilih nama kamera berdasarkan kode: ");
            namaCam = input.nextInt();
                
            System.out.print("Ingin sewa berapa lama? ");
            lamasewa = input.nextFloat();
            System.out.println("");
            
            if (namaCam == 1){
                hargasewa= 100000;
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera DSLR");
                System.out.println("Nama Kamera: Canon 600D");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 70000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 100000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 100000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
                
            }else if (namaCam == 2){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera DSLR");
                System.out.println("Nama Kamera: Canon 1500D Kit");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 65000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 95000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 95000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
                
            }else if (namaCam == 3){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera DSLR");
                System.out.println("Nama Kamera: Nikon D5200");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 70000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 100000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 100000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
            }
            
            
        }else if (kodeCam == 3){
            System.out.println("Daftar nama dan harga Kamera Mirrorless:");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("No ||      Nama Kamera       ||   Harga Sewa /24jam   ||   Harga Sewa /12jam");
            System.out.println("1. || Fuji Film XA-3         ||      Rp.120.000       ||      Rp. 85.000");
            System.out.println("2. || Sony A7II BO           ||      Rp.190.000       ||      Rp. 150.100");
            System.out.println("3. || Sony A6000             ||      Rp.150.000       ||      Rp. 110.100");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("");
            
            System.out.print("Pilih nama kamera berdasarkan kode: ");
            namaCam = input.nextInt();
                
            System.out.print("Ingin sewa berapa lama? ");
            lamasewa = input.nextFloat();
            System.out.println("");
            
            if (namaCam == 1){
                hargasewa= 100000;
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Mirrorless");
                System.out.println("Nama Kamera: Fuji Film XA-3");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 85000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 120000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 120000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
               totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar; 
            }else if (namaCam == 2){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Mirrorless");
                System.out.println("Nama Kamera: Sony A7II BO");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 150000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 190000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 190000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
            }else if (namaCam == 3){
                
                System.out.println("--- DETAIL PEMBAYARAN KAMERA ---");
                System.out.println("Jenis Kamera: Kamera Mirrorless");
                System.out.println("Nama Kamera: Sony A6000");
                System.out.println("Lama Sewa : " + lamasewa + " hari");
                if(lamasewa == 0.5){
                    hargasewa = 110000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa == 1){
                    hargasewa = 150000;
                    System.out.println("Harga Sewa : " + hargasewa);
                }else if (lamasewa > 1){
                    hargasewa = 150000;
                    subtotal  = (hargasewa*lamasewa);
                    System.out.println("Harga Sewa : " + subtotal);}
                
                    totalsewa = lamasewa+totalsewa;
            totalbayar = hargasewa+totalbayar;
            }
            
        }System.out.print("Apakah Anda ingin menyewa lagi? [Y/N]: ");
                    pilihan = input.next();
                    System.out.println("");
                    
    }while(pilihan.equalsIgnoreCase("y"));

//    totalbayar = totalbayar + totalbayar;
        
        System.out.println("--------------------------------");
        System.out.println("     *** Nota Pembayaran ***");
        System.out.print("Nama Pelanggan: ");
        namaPel = input.next();
        System.out.println("Lama sewa kamera: "  + totalsewa + "hari");
        System.out.println("Total Pembayaran: " + "Rp." + (totalbayar));
        System.out.println("     ### Terima Kasih ###");
        System.out.println("--------------------------------");
    } 
}

