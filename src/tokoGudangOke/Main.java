package tokoGudangOke;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Deklarasi variable
        String nama_user, nama_barang;
        int jumlah_barang;
        double harga_jual, harga_beli;

        //membuat scanner
        Scanner key = new Scanner(System.in);

        //memasukkan nama pengguna
        System.out.print("Masukkan nama anda : ");
        nama_user = key.nextLine();

        //Welcome Message
        System.out.println("Stock Gudang Input Barang");
        System.out.println("#########################");

        System.out.println("Selamat Datang oko Gudang Oke, " + nama_user + " !");

        //memasukkan nama barang
        System.out.print("Masukkan nama barang yang akan ditambah : ");
        nama_barang = key.nextLine();

        //memasukkan jumlah barang
        System.out.print("Masukkan jumlah barang yang akan ditambah : ");
        jumlah_barang = key.nextInt();

        //memasukkan harga beli barang
        System.out.print("Masukkan harga beli barang tersebut : ");
        harga_beli = key.nextDouble();

        //memasukkan harga jual nbarang
        System.out.print("Masukkan harga jual barang tersebut : ");
        harga_jual = key.nextDouble();

        // menampilkan yang disimpan variable
        System.out.println("\nStock Gudang Rincian Barang");
        System.out.println("###########################");
        System.out.println("Nama barang   : " + nama_barang);
        System.out.println("Jumlah barang : " + jumlah_barang);
        System.out.println("harga beli    : " + String.format("%.02f", harga_beli));
        System.out.println("harga jual    : " + String.format("%.02f", harga_jual));

        System.out.println("\n###### Bye " +nama_user+", see u again! ######");
    }

}
