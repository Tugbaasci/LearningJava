package sample_questions;

import java.util.Scanner;

public class soru18 {
    public static void main(String[] args) {
        /*
        Girilen araç hızı ve yol kilometresinden,
        gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım,
        bunu methoda gönderelim ve bize varış süremizi hesaplasın
        yol=hiz*zaman
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen hizinizi giriniz:");
        int hiz = scanner.nextInt();
        System.out.println("Lütfen varacaginiz yerin uzakligini km olarak giriniz");
        double yol = scanner.nextDouble();
        System.out.println(zamanHesapla(hiz,yol));

    }
    public static double zamanHesapla(int hiz, double yol){
        double zaman = yol/hiz;
        System.out.println("varacaginiz sure: "+zaman+" saattir");
        return zaman;
    }
}
