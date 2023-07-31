package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class soru3 {
    public static void main(String[] args) {
        /*
        Verilen String bir listede istenmeyen harf iceren
        elementleri silip, kalan kismini list olarak bize
        donduren bir method olusturun
         */
        String[] arr ={"Mehmet","Ramazan","Ozan","Berk","Nergiz",
                "Ayfer","Bugra"};
        List<String> isimListesi = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            isimListesi.add(arr[i]);
        }
        System.out.println(isimListesi);
        System.out.println(istenmeyeniSil(isimListesi,"r"));

    }
    public static List<String> istenmeyeniSil(List<String> isimler,
                                              String istenmeyen){
        List<String> yenilist =new ArrayList<>();
        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyen)){
                yenilist.add(isimler.get(i));
            }
        }return yenilist;
    }
}
