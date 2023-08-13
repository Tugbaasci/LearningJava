package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class urunFiyatiForEach {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Toplam fiyat: 236.5
        List<Double> fiyat= new ArrayList<>();
        fiyat.add(12.5);
        fiyat.add(31.2);
        fiyat.add(28.9);
        fiyat.add(35.5);
        double toplam =0;
        for (double each:fiyat) {
            toplam+=each;
        }
        System.out.println("toplam: "+toplam);
    }
}
