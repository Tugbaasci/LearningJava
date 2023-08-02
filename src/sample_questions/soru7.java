package sample_questions;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*
        Kullanicidan double turunde bir sayi alin
        Alinan bu sayiyi tamsayiya cevirerek konsolda yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double sayi = scanner.nextDouble();
        int sayi1 = (int)sayi;
        System.out.println("Girilen ondalikli sayinin tamsayiya donusmus hali: "
                +sayi1);
    }
}
