package sample_questions;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        /*
        Girilen zamani saniyeye cevirin
        Ornek: 2 saat 3 dakika 10 saniye ==> 7390 saniye
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen saniyeye cevirmek istediginiz zamani giriniz ");
        System.out.print("Saat: ");
        int saat= scanner.nextInt();
        System.out.print("Dakika: ");
        int dakika = scanner.nextInt();
        System.out.print("Saniye: ");
        int saniye = scanner.nextInt();
        System.out.println("Girdiginiz degerler toplam: "
                +((saat*3600)+(dakika*60)+(saniye))+" saniyedir");

    }
}
