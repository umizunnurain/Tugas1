//*13020210097
//*Umi Zunnurain
//*Rabu/03/2023

import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam, menit, detik, konversi;
        
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        jam     = konversi/3600;
        menit   = (konversi%3600)/60;
        detik   = (konversi%3600)%60;
        
        System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
    }
    
}