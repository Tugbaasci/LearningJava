package sample_questions;

import java.util.Scanner;

public class soru28 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tersine cevrilecek sayiyi giriniz:");
        int sayi = scanner.nextInt();
        String ters = sayi +"";
        for (int i = ters.length()-1; i >=0 ; i--) {
            System.out.print(ters.charAt(i));
        }
    }
}
