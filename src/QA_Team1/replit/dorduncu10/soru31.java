package QA_Team1.replit.dorduncu10;

import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
    /*31----
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen saniyeye cevirmek istediginiz saati yaziniz");
        int saat= scanner.nextInt();
        System.out.println("BeklenenCikti:\n "+saatiSnYap(saat));
    }

    public static int saatiSnYap(int saat) {
        int sn=saat*60*60;
        return sn;
    }


}
