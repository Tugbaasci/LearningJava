package QA_Team1.replit.ilk10Soru;

import java.util.Scanner;

public class soru1 {
        public static void main(String[] args) {
 /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */
            //System.out.println("-----------------1.Cozum-----------------------");
            //int sayi=34;
            //int birler=sayi%10;
            //sayi/=10;
            //int onlar=sayi%10;
            //int toplam= birler+onlar;
            //System.out.println("Beklenen Cikti: "+toplam);
            //System.out.println("-----------------2.Cozum-----------------------");
            //Scanner scanner = new Scanner(System.in);
            //System.out.print("Bir sayi girin:");
            //int girilenSayi= scanner.nextInt();
            //int sayi=girilenSayi;
            //int adet=0, toplam=0;
            //while(sayi>0){//sayi!=0 olunca da calisiyor
            //    toplam+=(sayi%10);
            //    sayi/=10;
            //    adet++;
            //}
            //System.out.println(adet+" basamakli "+girilenSayi+" sayisinin toplami: "+toplam);
            //System.out.println("-----------------3.Cozum-----------------------");
            //Scanner scanner = new Scanner(System.in);
            //System.out.println("Lütfen sayi degerleri toplanacak olan sayiyi girin:");
            //int sayi= scanner.nextInt();
            //int basamakSayisi=(sayi+"").length();
            //int toplam=0;
            //for (int i = 1; i <=basamakSayisi ; i++) {
            //    int birlerBas=sayi%10;
            //    toplam+=birlerBas;
            //    sayi/=10;
            //}
            //System.out.println("Toplam: "+toplam);
            System.out.println("----------------4.cozum--------------------");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen bi sayi giriniz");
            String sayi =scanner.next();
            int toplam=0,birler=0;
            for (int i = 0; i < sayi.length(); i++) {
                birler=sayi.charAt(i);
                Integer yeni= Integer.parseInt(String.valueOf(birler));
                toplam+=yeni;
            }
            System.out.println(toplam);

        }
    }

