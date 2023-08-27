package QA_Team120.replit;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen buyuk harfe cevrilecek metni girin");
        String text= scanner.nextLine();
        String buyukText=text.toUpperCase();
        System.out.println("Girilen metin buyuk harfle yazildi: "+buyukText);
    }
}
