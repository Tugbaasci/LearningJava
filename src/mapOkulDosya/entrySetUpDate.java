package mapOkulDosya;

import java.util.Map;
import java.util.Set;

public class entrySetUpDate {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=Metodlar.ogrenciMapOlustur();
        //Set<Map.Entry<Integer,String>> ogrenciSoyisimBuyuk=ogrenciMap.entrySet();
        //for (Map.Entry<Integer,String> entryValue :ogrenciSoyisimBuyuk) {
        //    String valueStr=entryValue.getValue();
        //    String[] valueArr=valueStr.split("-");
        //    valueArr[1]=valueArr[1].toUpperCase();
        //    String yeniValue=valueArr[0]+" "+valueArr[1]+" "+
        //            valueArr[2]+" "+valueArr[3];
        //    entryValue.setValue(yeniValue);
        //}
        //System.out.println(ogrenciMap);
        //Subesi H olan ogrencilerin subesini T yapin
        Set<Map.Entry<Integer,String>> subeDegistirilmis=ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> each:subeDegistirilmis) {
            String value=each.getValue();
            String[] arr=value.split("-");
            if (arr[3].equalsIgnoreCase("h")){
                arr[3]="T";
            }
            String yeniValue=arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4];
            each.setValue(yeniValue);
        }
        System.out.println(ogrenciMap);
    }
}
