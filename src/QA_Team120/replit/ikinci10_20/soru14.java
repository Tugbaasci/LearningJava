package QA_Team120.replit.ikinci10_20;

public class soru14 {
     /*14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.


    Test data:
    1. String : techproed.com
    2. String : Techproed.com

    Beklenen Çıktı:
    False

    Test data:
    1. String : techproed.com
    2. String : techproed.com

    Beklenen Çıktı:
    true
    */
     public static void main(String[] args) {
     String str1="techproed.com";
     String str2="Techproed.com";
          System.out.println(str1.equals(str2));
     }
}
