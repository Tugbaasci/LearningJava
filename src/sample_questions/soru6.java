package sample_questions;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        Kullaniciya günde ne kadar cay ictigini ve
        ne kadar seker kullandigini sorun
        Yilda kac cay ictigini ve kac kg seker kullandigin hesaplayin
        konsola yazdirin
        1 kup seker = 1.5 gr
        1 kg = 1000 gr
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay ictiginizi yaziniz");
        int bardak= scanner.nextInt();
        System.out.println("Bir bardak cay icin kac adet seker " +
                "kullaniyorsunuz");
        double seker = scanner.nextDouble()*1.5;

        System.out.println("Bir yilda "+bardak*365+" bardak cay iciyorsunuz"+"\n" +
                "ve "+bardak*seker*365/1000+" kg seker tuketiyorsunuz");
    }
}
