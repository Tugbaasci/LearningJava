package javaPractice;

import java.util.ArrayList;

public class meyveForEach {
    // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
    // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın. (forEachLoop kullanın)
    // Örnek çıktı:
    // Meyveler: ELMA ARMUT ÇİLEK
    public static void main(String[] args) {
        ArrayList<String> meyve=new ArrayList<>();
        meyve.add("elma");
        meyve.add("cilek");
        meyve.add("armut");
        for (String each:meyve) {
            System.out.print(each.toUpperCase()+" ");
        }

    }
}
