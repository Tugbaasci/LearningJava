package QA_Team1.replit.ikinci10_20;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Son karakteri silinecek olan kelimeyi girin");
        String text= scanner.next();
        System.out.println(text.substring(0,text.length()-1));
    }
}
