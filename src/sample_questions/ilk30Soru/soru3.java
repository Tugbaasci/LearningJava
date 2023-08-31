package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alin
        alinan bu sayilarin ortalamasini hesaplayin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ortalamasi alinmak uzere " +
                "5 tane pozitif tamsayi giriniz");
        int sayi= scanner.nextInt();
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();
        int sayi4= scanner.nextInt();
        int ort = (sayi+sayi1+sayi2+sayi3+sayi4)/5;
        System.out.println("Girilen sayilarin ortalamasi: "+ort);
    }
}
