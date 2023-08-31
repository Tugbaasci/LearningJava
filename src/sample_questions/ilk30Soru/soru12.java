package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        /*
        Verilen iki sayinin toplamini -sifirdan buyuk veya esit olabilir-
        hesaplamak ve yazdirmak icin bir program olusturalim
        Eger verilen tamsayilarin veya toplamin 10'dan fazla basamagi varsa
        "fazla yuklenme" yazdiralim
        Orn:
        iki tamsayi girin:
        25 veya 45887655678
        46 veya 46768
        konsolda cikti:
        Sayilarin toplami: 71 veya fazla yuklenme
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplanmak uzere iki tamsayi giriniz:");
        long sayi1 = scanner.nextLong();
        long sayi2 = scanner.nextLong();
        long toplam = sayi1+ sayi2;
        String sayi1str= String.valueOf(sayi1);
        String sayi2str= String.valueOf(sayi2);
        String toplamstr= String.valueOf(toplam);
        if (sayi1str.length()>10||sayi2str.length()>10||toplamstr.length()>10){
            System.out.println("Fazla Yuklenme");
        }else{
            System.out.println("sayilarin toplami: "+ toplam);
        }
    }
}
