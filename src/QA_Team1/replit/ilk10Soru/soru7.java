package QA_Team1.replit.ilk10Soru;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*7-----
    Ugly Number:
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için
    bir Java programı yazın.

    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari
    2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13

    Beklenen çıktı:
    ugly number  degildir

    Test Data:
    25

    Beklenen Çıktı:
    ugly number
    */
        //Scanner scan= new Scanner(System.in);
        //System.out.println("Lütfen bir tamsayi giriniz");
        //int girilenSayi= scan.nextInt();
        //int[] sayilar ={2,3,5};
        //String cirkin="";
        //for (int i = 0; i < sayilar.length; i++) {
        //    if (girilenSayi%sayilar[i]==0){
        //        cirkin="cirkin sayidir";
        //        break;
        //    }else {
        //        cirkin="cirkin sayi degildir";
        //    }
        //}
        //System.out.println("Girilen "+girilenSayi+" sayisi "+cirkin);
        System.out.println("-----------------------farkli cozum---------------\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        int[] sayilar ={2,3,5};
        boolean kontrol =true;
        for (int each:sayilar) {
            while(girilenSayi%each==0){
                girilenSayi/=each;//
            }
        }if (girilenSayi!=1){
           kontrol=false;
        }if (kontrol){
            System.out.println("cirkin sayi");
        }else {
            System.out.println("cirkin degil");
        }


    }
}
