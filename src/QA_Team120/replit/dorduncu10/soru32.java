package QA_Team120.replit.dorduncu10;

import java.util.Scanner;

public class soru32 {
    public static void main(String[] args) {
         /*32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz");
        int sayi1= scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2= scanner.nextInt();
        sayilarEsit(sayi2,sayi1);
    }

    public static void sayilarEsit(int sayi2, int sayi1) {
        if (sayi2==sayi1){
            System.out.println("Girilen sayilar esittir");
        }else{
            System.out.println("Girilen sayilar esit degil");
        }
    }
}
