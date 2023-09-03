package QA_Team1.replit.ucuncu10_30;

public class soru28 {
    public static void main(String[] args) {
         /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        int[] arr={1,2,3,4,5,6,7,8,9};
        int tekSayac=0;
        int ciftSayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                ciftSayac++;
            }else {
                tekSayac++;
            }
        }
        System.out.println("Beklenen Cikti: \nTek Sayilar: "+tekSayac+"\nCift Sayilar: "+ciftSayac);
    }
}
