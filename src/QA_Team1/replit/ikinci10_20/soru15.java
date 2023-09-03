package QA_Team1.replit.ikinci10_20;

public class soru15 {
     /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */
     public static void main(String[] args) {
          String str="Java is fun";
          for (int i = 0; i <str.length() ; i++) {
               System.out.println(i+". pozisyondaki karakter "+str.charAt(i));
          }
     }
}
