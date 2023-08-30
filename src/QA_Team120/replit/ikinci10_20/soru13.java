package QA_Team120.replit.ikinci10_20;

import java.io.StringReader;
import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        /*
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kontrol edilecek sayi yada kelimeyi giriniz");
        String text=scanner.next();
        String[] textArr=text.split("");
        String tersten="";
        for (int i = textArr.length-1; i >=0 ; i--) {
            tersten+=textArr[i];
        }
        System.out.println(tersten);
        boolean kontrol =false;
        if (text.equalsIgnoreCase(tersten)){
            System.out.println("girilen deger palindrome");
            kontrol=true;
        }else{
            System.out.println("palindrom degil");
            kontrol=false;
        }
        System.out.println("--------------------------baska cozum---------------------");
        StringBuilder strbldr= new StringBuilder(text);
        if (strbldr.reverse().toString().equalsIgnoreCase(text)){
            System.out.println("palindrom");
        }else System.out.println("palindrom degil");
    }
}
