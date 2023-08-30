package QA_Team120.replit.ilk10Soru;

import java.util.Scanner;

public class soru3 {
        public static void main(String[] args) {
        /*
        5'lerin carpim tablosu
        Belirlenen sayinin 1'den 10'a kadar carpim sonuclarini yapan java programi yapiniz
        orn:5x1=5
         */
            Scanner scanner= new Scanner(System.in);
            System.out.println("Lütfen carpim sonuclarini gormek istediginiz sayiyi giriniz:");
            int sayi= scanner.nextInt();
            for (int i = 1; i <=10 ; i++) {
                System.out.println(sayi+" x "+i+" = "+sayi*i);
            }
        }
    }

