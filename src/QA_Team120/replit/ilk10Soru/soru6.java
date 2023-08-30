package QA_Team120.replit.ilk10Soru;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
         /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz:");
        String str=scanner.next();
        char harf=str.toLowerCase().charAt(0);
        if (harf>='a'&&harf<='z'&&str.length()==1){
            if (harf=='a'||harf=='e'||harf=='i'||harf=='o'||harf=='u'||harf=='A'||harf=='E'||harf=='I'||harf=='O'||harf=='U'){
                System.out.println("Girilen "+harf+" harfi sesli harftir");
            }else{
                System.out.println("Girilen "+harf+" harfi sessiz harftir");
            }
        }else {
            System.out.println("Yanlis karakter girdiniz!");
        }
    }
}
