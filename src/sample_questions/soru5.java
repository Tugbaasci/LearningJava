package sample_questions;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan karenin kenar uzunlugunu alin
        Aldiginiz uzunluklarla karenin alanini ve cevresini hesaplayin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen karenin bir kenar uzunlugunu giriniz:");
        double kenar = scanner.nextDouble();
        double alan= kenar*kenar;
        double cevre = 4*kenar;
        System.out.println("Kenar uzunlugu girilen karenin alani: "+alan+"\n" +
                "Cevresi: "+cevre);
    }
}
