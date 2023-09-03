package sample_questions;

import java.util.Scanner;

public class hesapMakinesi {
    /*
    Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yapacaginiz islemi seciniz\nToplama: '+'\nCikarma: '-'\nCarpma: '*'\nBolme: '/'");
        String secim= scanner.next();
        System.out.println("Lütfen islem yapmak icin iki tamsayi giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sonuc=0;
        //int cikarma=0;
        //int carpma=1;
        //double bolme=1;
        switch (secim){
            case "+":
                sonuc=sayi2+sayi1;
                //System.out.println(toplam);
                break;
            case "-":
                sonuc=sayi2>sayi1?sayi2-sayi1:sayi1-sayi2;
                //System.out.println(cikarma);
                break;
            case "*":
                sonuc=sayi2*sayi1;
                //System.out.println(carpma);
                break;
            case "/":
                sonuc=sayi2>sayi1?sayi2/sayi1:sayi1/sayi2;
                //System.out.println(bolme);
                break;
        }
        System.out.println(sonuc);
    }
}
