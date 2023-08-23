package javaPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class urunFiyatiForEach {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Toplam fiyat: 236.5
        //List<Double> fiyat= new ArrayList<>();
        //fiyat.add(12.5);
        //fiyat.add(31.2);
        //fiyat.add(28.9);
        //fiyat.add(35.5);
        //double toplam =0;
        //for (double each:fiyat) {
        //    toplam+=each;
        //}
        //System.out.println("toplam: "+toplam);
        Scanner scanner=new Scanner(System.in);
        List<Double> sayilar= new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            System.out.println("Lütfen "+i+". urun fiyatini ekleyin");
            double sayi= scanner.nextDouble();
            sayilar.add(sayi);
        }
        double toplam=0.0;
        for (double each:sayilar) {
            toplam+=each;
        }
        System.out.println(toplam);
    }


}
