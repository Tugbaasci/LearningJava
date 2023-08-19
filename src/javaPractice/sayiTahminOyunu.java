package javaPractice;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
         /*
        Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
        Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
        bilince de tebrik edip durduran bir kod yazalim
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ile 10 arasi bir sayi giriniz");
        Random rndm =new Random();
        int sayi= rndm.nextInt(10);//aralik belirliyorsun-0 ile 10 arasi
        Boolean kontrol=true;
        while(kontrol){
            int tahmin= scanner.nextInt();
            if (tahmin>sayi){
                System.out.println("cok soyledin dusur");
            }else if (sayi>tahmin){
                System.out.println("dusuk soyledin,artir");
                kontrol=true;
            }else if (sayi==tahmin){
                System.out.println("dogru bildin");
                kontrol=false;
            }
        }

    }
}
