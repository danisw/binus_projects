package forum;

import java.util.Scanner;

public class Kurs {

    public static void main(String[] args) {


        //inisiasi object
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What would you like to convert?");
        System.out.println("1. IDR to MYR?");
        System.out.println("2. MYR to IDR?");
        System.out.println("3. IDR to CNY?");
        System.out.println("4. CNY to IDR?");
        System.out.println("5. IDR to SGD?");
        System.out.println("6. SGD to IDR?");
        System.out.println("7. JPY to IDR?");
        System.out.println("8. IDR to JPY?");

        convert(keyboard);

    }
    public static void convert(Scanner keyboard){
        //inisiasi variable menampung pilihan konversi
        int choice;

        //inisiasi variable nilai currency dalam rupiah
        double valMYR=3415.66, valCNY=2259.85,valSGD=10635.56, valJPY=122.15;

        //inisiasi variable inputan user dan variable hasil
        double value, result;
        //pilihan uuser di assign ke variable choice
        System.out.print("input the number : ");
        choice = keyboard.nextInt();

        switch(choice){
            case 1 :
                System.out.print("Enter IDR to be converted to MYR: ");
                value = keyboard.nextDouble();
                result = value / valMYR;
                System.out.println("MYR: " + String.format("%.02f",result));
                break;
            case 2 :
                System.out.print("Enter MYR to be converted to IDR: ");
                value = keyboard.nextDouble();
                result = value * valMYR;
                System.out.println("IDR: " + String.format("%.02f",result) );
                break;
            case 3 :
                System.out.print("Enter IDR to be converted to CNY: ");
                value = keyboard.nextDouble();
                result = value / valCNY;
                System.out.println("CNY: " + String.format("%.02f",result) );
                break;
            case 4  :
                System.out.print("Enter CNY to be converted to IDR: ");
                value = keyboard.nextDouble();
                result = value * valCNY;
                System.out.println("IDR: " +  String.format("%.02f",result) );
                break;
            case 5 :
                System.out.print("Enter IDR to be converted to SGD: ");
                value = keyboard.nextDouble();
                result = value / valSGD;
                System.out.println("SGD: " +  String.format("%.02f",result) );
                break;
            case 6 :
                System.out.print("Enter SGD to be converted to IDR: ");
                value = keyboard.nextDouble();
                result = value * valSGD;
                System.out.println("IDR: " +  String.format("%.02f",result) );
                break;
            case 7 :
                System.out.print("Enter JPY to be converted to IDR: ");
                value = keyboard.nextDouble();
                result = value / valJPY;
                System.out.println("IDR: " +  String.format("%.02f",result) );
                break;
            case 8 :
                System.out.print("Enter IDR to be converted to JPY: ");
                value = keyboard.nextDouble();
                result = value * valJPY;
                System.out.println("JPY: " +  String.format("%.02f",result) );
                break;
            default :
                System.out.println("Please choose your conversion");
        }
    }
}