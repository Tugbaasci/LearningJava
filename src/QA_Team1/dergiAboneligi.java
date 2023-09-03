package QA_Team1;

import java.util.Scanner;

public class dergiAboneligi {
    public static void main(String[] args) {
         /*
      Bir dergi aboneliginin ücretini hesaplayabilmek icin
      kullanicidan
      Abonelik zamanini ay olarak alin.
      1 - Girilen sayi negatif ise hata oldugunu bildirin ve
      programi bitirin
      2- 6 ay'dan az bir abonelik icin aylik ücret 6,50 Euro
      3- en az 6 ay ama 12 aydan az bir zaman icin aylik ücret 5,90
      4- 1 yildan uzun abonelikler icin kullanicidan 4 haneli bir
      posta kodu isteyin
          4a.) Posta Kodu <1000 veya >9999 ise Hata kodu yazin ve
          programi bitirin
          4b) Gcerli bir Posta Kodu icin   aylik ücret 5,xx olacak-
          ücretin XX degeri Posta kodunun
          ortadaki haneleri (Yüzler ve onlar)   olmali.
       5- En sonunda hesaplanan aylik ücreti ve yillik ücreti yazdirin

       */
        int abonelikZamani;
        double aylikUcret;
        int postaKodu;
        double yillikUcret;
        int yuzluk =0;
        int onluk =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen abonelik yapmak istediginiz sureyi " +
                "ay olarak giriniz");
        abonelikZamani = scanner.nextInt();
        if (abonelikZamani<=0){
            System.out.println("Hatali giris yapildi");
        } else if (abonelikZamani<6) {
            aylikUcret = 6.50;
            System.out.println("aylikUcret : "+ aylikUcret+" €");
            System.out.println("Yapilmasi gereken toplam odeme: "+abonelikZamani*aylikUcret +"€");
        } else if (abonelikZamani<12) {
            aylikUcret = 5.90;
            System.out.println("aylikUcret : "+ aylikUcret+" €");
            System.out.println("Yapilmasi gereken toplam odeme: "+abonelikZamani*aylikUcret +"€");
        }else {
            System.out.println("Lütfen bulundugunuz yerin posta kodunu giriniz");
            postaKodu = scanner.nextInt();
            if (postaKodu<1000||postaKodu>9999){
                System.out.println("Hatali posta kodu girisi yapildi");
            } else if(postaKodu<=9999&&postaKodu>=1000){
                postaKodu/=10;
                onluk=postaKodu%10;
                postaKodu/=10;
                yuzluk=postaKodu%10;

                String virguldenSonra =yuzluk  + "" + onluk;
                String yeniaylik ="5."+virguldenSonra;
                double yeniFiyat = Double.parseDouble(yeniaylik);
                System.out.println("aylik ucret: "+yeniaylik+" €");
                System.out.println("Yapilmasi gereken toplam odeme: "+abonelikZamani*yeniFiyat +"€");

            }
        }
    }
}


