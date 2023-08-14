import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
 /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */
        //int sayi=34;
        //int birler=sayi%10;
        //sayi/=10;
        //int onlar=sayi%10;
        //int toplam= birler+onlar;
        //System.out.println("Beklenen Cikti: "+toplam);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin:");
        int sayi= scanner.nextInt();
        int adet=0, toplam=0;
        while(sayi>0){//sayi!=0 olunca da calisiyor
            toplam=(sayi%10)+toplam;
            sayi/=10;
            ++adet;
        }
        System.out.println("basamak toplami: "+toplam);
    }
}
