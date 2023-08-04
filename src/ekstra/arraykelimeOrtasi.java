package ekstra;

import java.util.ArrayList;
import java.util.List;

public class arraykelimeOrtasi {
    //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip, -
    // Kelimenin uzunlugu cift sayi ise ilk yarisini -
    // Kelimenin uzunlugu tek sayi ise
    // ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.
    public static void main(String[] args) {
        String [] str ={"Burhan", "Nergiz","Seref","Senol"};
        // bunun kontrolunu saglamak icin bir method olusturacaz
        System.out.println(yeniKelimeList(str));
    }
    public static List<String> yeniKelimeList(String[] arr){
        List<String> yeni = new ArrayList<>();
        for (String each:arr
             ) {
            if (each.length()%2==0){
                yeni.add(each.substring(0,each.length()/2));
            }else {
                yeni.add(each.substring((each.length()-1)/2));
            }
        }return yeni;
    }

}
