package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru17 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen uc harfli bir kelime giriniz:");
        String kelime = scanner.next();
        char bir = kelime.charAt(0);
        char iki = kelime.charAt(1);
        char uc = kelime.charAt(2);
        if (kelime.length()>3){
            System.out.println("Girdiginiz kelimenin uzunlugu 3 harften fazla olmamali");
        }else {
            if (bir==iki || iki==uc || bir==uc){
                System.out.println("Dize yinelenen karakterlere sahip");
            }else {
                System.out.println("Dize benzersiz karakterlere sahip");
            }
        }


    }
}
