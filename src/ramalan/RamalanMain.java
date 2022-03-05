package ramalan;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

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

        System.out.println("\nMasukkan Data Pasangan Anda:");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        nama_pasangan = key.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        //di parse jd int biar kebaca
        umur_pasangan = Integer.parseInt(key.nextLine());

        //menghitung kecocokan
        kecocokan = calcFitness();
        //bulatkan 2 angka dibelakang koma
        String kecocokan_fin = String.format("%.02f",kecocokan);

        //tampilkan hasil
        System.out.println("\n"+nama_user+" ["+umur_user+"] tahun");
        System.out.println("  ♥♥♥    ♥♥♥ ");
        System.out.println(" ♥♥♥♥♥,,♥♥♥♥♥ ");
        System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥♥ ");
        System.out.println("  ♥♥♥♥♥♥♥♥♥♥ ");
        System.out.println("    ♥♥♥♥♥♥ ");
        System.out.println("      ♥♥♥ ");

        //loveIcon();
        System.out.println(nama_pasangan+" ["+umur_pasangan+"] tahun");

        System.out.println("\nkecocokan anda dan pasangan : "+kecocokan_fin+" %");

    }

    private static Double calcFitness(){
        int random_num;
        Double kecocokan = null;
        System.out.print("\nTekan enter untuk melihat hasil... ");
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
    private static void loveIcon(){
       // HERE, we have set the size of Heart, size = 10
        int a, b, size = 8;

        /* FOR THE APEX OF HEART */
        for (a = size / 2; a <= size; a = a + 2) {

            // FOR SPACE BEFORE PEAK-1 : PART 1
            for (b = 1; b < size - a; b = b + 2)
                System.out.print(" ");

            // FOR PRINTING PEAK-1 : PART 2
            for (b = 1; b <= a; b++)
                System.out.print("♥");

            // FOR SPACE B/W PEAK-1 AND PEAK-2 : PART 3
            for (b = 1; b <= size - a; b++)
                System.out.print(" ");

            // FOR PRINTING PEAK-2 : PART 4
            for (b = 1; b <= a - 1; b++)
                System.out.print("♥");

            System.out.print("\n");
        }

        /*FOR THE BASE OF HEART ie. THE INVERTED TRIANGLE */

        for (a = size; a >= 0; a--) {

            // FOR SPACE BEFORE THE INVERTED TRIANGLE : PART 5
            for (b = a; b < size; b++)
                System.out.print(" ");

            // FOR PRINTING THE BASE OF TRIANGLE : PART 6
            for (b = 1; b <= ((a * 2) - 1); b++)
                System.out.print("♥");

            System.out.print("\n");
        }
    }

}

