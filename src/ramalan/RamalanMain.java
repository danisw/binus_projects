package ramalan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import static java.lang.Math.random;

public class RamalanMain {
    public static void main(String[] args) {

        //deklarasi variable
        String nama_user, nama_pasangan;
        int umur_pasangan, random_num, umur_user;
        double kecocokan;


        //membuat scanner
        Scanner key = new Scanner(System.in);

        //welcome message
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        //Data Awal
        System.out.println("Masukkan Data anda:");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda : ");
        nama_user = key.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        umur_user = key.nextInt();
        System.out.print("Masukkan Nama Pasangan Anda : ");
        nama_pasangan = key.nextLine();
        //line ini untuk consume /n dari string sebelumnya. biar gak skip
        key.nextLine();

        System.out.print("Masukkan Umur Pasangan Anda : ");
        umur_pasangan = key.nextInt();
        System.out.println("Tekan enter untuk melihat hasil ");
        try
        {
            System.in.read();
            random_num = (int) ((random() * (100 - 50)) + 50);
            kecocokan=random_num/1.1;
            System.out.println("Kecocokan anda adalah " +kecocokan+ "%");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
