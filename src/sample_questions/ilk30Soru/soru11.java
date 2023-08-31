package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        /*
        Kullaniciya Adini,Soyadini ve kredi karti numaralarini sorup
        bunlari ozel forma donusturun
        Ad ve soyadin ilk harfleri buyuk olmalidir
        Kredi karti numarasini kontrol edin
        16 hane yoksa "Gecersiz kredi karti numarasi" yazdirin
        Kredi karti 16 hane ise asagida belirtilen sekilde cikti alin
        Giris:
        Gandalf Grey 563245879632
        Cikti:
        Isim: G****** G***
        CCN: **** **** 9632
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen adinizi giriniz: ");
        String isim= scanner.next();
        System.out.print("Lütfen soyadinizi giriniz: ");
        String soyad= scanner.next();
        System.out.print("Lütfen kredi karti numaranizi 16 hane olacak sekilde giriniz: ");
        String ccn = scanner.next();
        ccn = ccn+ "";
        if ((ccn.length())!=16){
            System.out.println("GECERSIZ KART NUMARASI");
        }else{
            String duzenlisim=isim.toUpperCase().charAt(0)+isim.substring(1).
                    replaceAll("\\w","*");
            String duzenliSoyad= soyad.toUpperCase().charAt(0)+soyad.substring(1).
                    replaceAll("\\w","*");
            String duzenliccn= ccn.substring(0,4).replaceAll("\\d","*")+" "
                    +ccn.substring(4,8).replaceAll("\\d","*")+" "+
                    ccn.substring(8,12).replaceAll("\\d","*")+" "+
                    ccn.substring(12);
            System.out.println("Isim : " +duzenlisim+" "+duzenliSoyad+"" +
                    "\nCCN : "+duzenliccn);
        }
    }
}
