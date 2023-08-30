package QA_Team120.replit.ilk10Soru;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
         /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen cümlenizi giriniz");
        String str= scanner.nextLine();
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("-------------baska cozum-------------------");

        System.out.println("Lütfen metni girin");
        String metin= scanner.nextLine();
        String[] metinArr=metin.split("");
        for (int i = metinArr.length-1; i >=0 ; i--) {
            System.out.print(metinArr[i]);
        }
    }
}
