package QA_Team1.replit.ucuncu10_30;

public class soru21 {
    /*21----
    Array deki sayıları tolpayan Java kodunu yazınız.

    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Beklenen Çıktı:
    Array toplamı: 55
    */
    public static void main(String[] args) {
        int[] sayiarr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam=0;
        for (int sayi:sayiarr) {
            toplam+=sayi;
        }
        System.out.println("Sayilarin toplami: "+toplam);
    }

}
