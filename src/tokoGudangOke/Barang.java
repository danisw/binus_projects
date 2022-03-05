package tokoGudangOke;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Barang {
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
        System.out.println("Hello ini Toko Gudang Oke!\n");
        System.out.println("Stock Gudang Input Barang\n");
        System.out.println("#########################\n");

        System.out.println("Selamat Datang " + nama_user + " !");

        //memasukkan nama barang
        System.out.print("Masukkan nama barang yang akan ditambah : ");
        nama_barang = key.nextLine();

        //memasukkan jumlah barang
        System.out.print("\nMasukkan jumlah barang yang akan ditambah : ");
        jumlah_barang = key.nextInt();

        //memasukkan harga beli barang
        System.out.print("\nMasukkan harga beli barang tersebut : ");
        harga_beli = key.nextDouble();

        //memasukkan harga jual nbarang
        System.out.print("\nMasukkan harga jual barang tersebut : ");
        harga_jual = key.nextDouble();

        // menampilkan yang disimpan variable
        System.out.println("------------------------------------");
        System.out.println("Nama barang : " + nama_barang);
        System.out.println("Jumlah barang : " + jumlah_barang);
        System.out.println("harga beli : " + String.format("%.02f", harga_beli));
        System.out.println("harga jual : " + String.format("%.02f", harga_jual));
    }

}
