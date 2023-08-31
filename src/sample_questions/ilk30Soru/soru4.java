package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin
        ve aldiginiz bu sayinin kupunun yarisini konsola yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        double sayi = scanner.nextDouble();
        double sayikup= sayi*sayi*sayi;
        double yarisi = sayikup/2;
        System.out.println("Girilen sayinin küpü: "+sayikup+
                "\nKüpün yarisi: "+yarisi);
    }
}
