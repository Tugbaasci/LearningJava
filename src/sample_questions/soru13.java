package sample_questions;

import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        /*
        Char cevap degiskeninin degerini test edelim ve asagidaki eylemleri gerceklestiren
        bir kod yazalim
        Cevap a ise; konsolda isteginiz isleniyor mesaji yazsin
        Cevap b ise; konsolda Degerlendirmeniz icin yine de tesekkur ederiz yazsin
        Cevap c ise; konsolda üzgünüm su anda yardimci olamiyoruz mesaji
        Yanitin baska bir degeri icin ise;
        Gecersiz giris lutfen tekrar deneyin yazsin

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen a,b veya c seceneklerinden birini seciniz:");
        char harf = scanner.next().toLowerCase().charAt(0);
        switch (harf){
            case 'a':
                System.out.println("Isteginiz isleniyor");
                break;
            case 'b':
                System.out.println("Degerlendirmeniz icin yine de tesekkur ederiz");
                break;
            case 'c':
                System.out.println("Uzgünüm su anda yardimci olamiyoruz");
                break;
            default:
                System.out.println("Gecersiz giris lutfen tekrar deneyin");
        }
    }
}
