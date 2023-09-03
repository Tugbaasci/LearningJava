package QA_Team1.replit.ucuncu10_30;

public class soru22 {
    public static void main(String[] args) {
        /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    */
        int[] arr={20, 30, 25, 35, -16, 60, -100};
        double top=0.0;
        int sayiAdedi=0;
        for (int i = 0; i < arr.length; i++) {
            top+=arr[i];
            sayiAdedi++;
        }double notOrt=top/sayiAdedi;
        System.out.println(notOrt);
    }
}
