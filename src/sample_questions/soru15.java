package sample_questions;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan
        yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse
        yeni bir kelime  girmesini isteyin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bes harfli bir kelime giriniz");
        String metin = scanner.next();
        String yeni = "";
        boolean tamamMi = true;
        while(tamamMi){
            if (!(metin.length()>=5)){
                System.out.println("Lütfen yeni kelime giriniz");
                metin =scanner.next();
            }else {
                yeni =metin.substring(metin.length()-3)+
                        metin.substring(metin.length()-3);
                tamamMi=false;
            }System.out.println(yeni);
        }


    }
}
