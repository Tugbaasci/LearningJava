package QA_Team1.replit.ucuncu10_30;

import java.util.ArrayList;
import java.util.List;

public class soru24 {
    public static void main(String[] args) {
         /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */
        int[] arr={1551,1223,1443,1267,1789,1023,2020};
        int aranan=2020;
        boolean kontrol= false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==aranan){
                kontrol=true;
            }else {
                kontrol=false;
            }
        }
        System.out.println(kontrol);
        System.out.println("-----------------------------baska cozum-------------------------");
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1551);
        sayilar.add(1223);
        sayilar.add(1443);
        sayilar.add(1267);
        sayilar.add(1267);
        sayilar.add(1789);
        sayilar.add(1023);
        sayilar.add(2020);
        System.out.println(sayilar.contains(2020));
        System.out.println("aranan element var mi: "+sayilar.contains(1073));

    }
}
