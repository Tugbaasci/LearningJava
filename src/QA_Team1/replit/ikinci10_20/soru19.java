package QA_Team1.replit.ikinci10_20;

import java.util.Scanner;

public class soru19 {
     /*19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Lütfen artik yil olup olmadigini ogrenmek istediginiz yili giriniz");
         int girilenYil= scanner.nextInt();
         if (girilenYil%4==0||girilenYil%100==0){
             System.out.println(girilenYil+" yili artik yildir");
         }else {
             System.out.println(girilenYil+" yili artik yil degildir");
         }
     }
}
