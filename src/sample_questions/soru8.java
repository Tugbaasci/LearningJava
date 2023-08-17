package sample_questions;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        /*
        Kullanicidan uc basamakli bir sayi alin
        Kullanicidan alinan bu sayinin rakamlar toplamini
        ekranda yazdirin
         */
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Lutfen uc basamakli bir tamsayi giriniz");
      //nt girilenSayi = scanner.nextInt();
      //nt sayi = girilenSayi;
      //nt toplam=0;
      //int birler=sayi%10;
      //sayi/=10;
      //int onlar= sayi%10;
      //sayi/=10;
      //int yuzler= sayi%10;
      //int rakamTop= birler+onlar+yuzler;
      //System.out.println("Girilen "+girilenSayi+" sayisinin rakamlar toplami:" +
      //        rakamTop+"'dir");
        System.out.println("______________cozum_____________________");//Basamak sayisi istege bagli dusunuldu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;
        int toplam=0;
        while(sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);



    }
}
