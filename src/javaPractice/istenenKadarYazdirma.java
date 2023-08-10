package javaPractice;

import java.util.Scanner;

public class istenenKadarYazdirma {
    public static void main(String[] args) {
        /*
        Kullanicidan 3 harften uzun bir kelime ve
        10'dan kucuk bir sayi alin
        Kelimenin son iki harfini girilen sayi kadar
        yanyana yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 3 harften uzun " +
                "bir kelime giriniz: ");
        String kelime = scanner.next();
        System.out.print("Lütfen bi rakam giriniz:");
        int tekrar = scanner.nextInt();
        for (int i = 1; i <=tekrar ; i++) {
            System.out.print(kelime.substring
                    (kelime.length()-2));
        }
    }
}
