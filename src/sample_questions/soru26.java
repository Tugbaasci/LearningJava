package sample_questions;

import java.util.Scanner;

public class soru26 {
    public static void main(String[] args) {
        /*
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse,
        bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile
        bu soruyu çözebilirsiniz
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kontrol etmek istediginiz sayiyi giriniz:");
        int sayi= scanner.nextInt();
        int sayiBolenTop=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                sayiBolenTop+=i;
            }
        }
        if (sayiBolenTop==sayi){
            System.out.println(sayi+" Mukemmel sayidir");
        }else {
            System.out.println(sayi+" Mukemmel sayi degildir");
        }
    }
}
