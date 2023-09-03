package QA_Team1.replit.ilk10Soru;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
         /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen cümlenizi giriniz:");
        String text= scanner.nextLine().toLowerCase();
        System.out.print("Lütfen aranan kelimeyi giriniz:");
        String aranan= scanner.next().toLowerCase();
        System.out.println(arananVarMi(text, aranan));

    }
    public static boolean arananVarMi(String metin,String aranan){
        boolean kontrol = false;
        if (metin.contains(aranan)){
            kontrol=true;
        }return kontrol;
    }
}
