package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class isimleriListedenSonIndextenYaz {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
        // Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.
        // Örnek çıktı:
        // Son isim: Ahmet
        // Son ikinci isim: Mehmet
        // ...
        List<String> isim = new ArrayList<>();
        isim.add("esra");
        isim.add("kubra");
        isim.add("ceyda");
        isim.add("filiz");
        isim.add("azra");
        List<String> yeniList= new ArrayList<>();
        for (int i =isim.size()-1; i >=0 ; i--) {
            yeniList.add(isim.get(i));
            System.out.println((yeniList.indexOf(isim.get(i))+1)+".isim:"+isim.get(i));
        }
        long sayi =132245336;







    }
}
