public class soru1 {
    public static void main(String[] args) {
 /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */
        int sayi=34;
        int birler=sayi%10;
        sayi/=10;
        int onlar=sayi%10;
        int toplam= birler+onlar;
        System.out.println("Beklenen Cikti: "+toplam);
    }
}
