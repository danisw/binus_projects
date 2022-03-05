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
        System.out.println("Masukkan Data Anda:");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda : ");
        nama_user = key.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        umur_user = Integer.parseInt(key.nextLine());

        System.out.println("Masukkan Data Pasangan Anda:");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        nama_pasangan = key.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        //di parse jd int biar kebaca
        umur_pasangan = Integer.parseInt(key.nextLine());

        //menghitung kecocokan
        kecocokan = calcFitness();

        //tampilkan hasil
        System.out.println(nama_user+" ["+umur_user+"]");
        System.out.println("    ♥   ");
        System.out.println(nama_pasangan+" ["+umur_pasangan+"]");

        System.out.println("kecocokan anda dan pasangan : "+kecocokan+" %");

    }

    private static Double calcFitness(){
        int random_num;
        Double kecocokan = null;
        System.out.print("Tekan enter untuk melihat hasil... ");
        try
        {
            System.in.read();
            random_num = (int) ((random() * (100 - 50)) + 50);
            kecocokan=random_num/1.1;
        }
        catch(Exception e)
        {
             System.out.println(""+e);
        }
        return kecocokan;
    }

}
