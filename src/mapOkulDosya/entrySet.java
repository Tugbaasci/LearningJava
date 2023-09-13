package mapOkulDosya;

import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=Metodlar.ogrenciMapOlustur();
        Set<Map.Entry<Integer,String >> ogrenciEntrySet=ogrenciMap.entrySet();
        for (Map.Entry<Integer,String > eachEntry:ogrenciEntrySet) {
            String eachValue=eachEntry.getValue();
            String[] valueArr=eachValue.split("-");
            switch (valueArr[2]){
                case "9":
                    valueArr[2]="10";
                    break;
                case "10":
                    valueArr[2]="11";
                    break;
                case "11":
                    valueArr[2]="12";
                    break;
                case "12":
                    valueArr[2]="Mezun";
                    break;
            }
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3];
            eachEntry.setValue(yeniValue);
        }
        System.out.println(ogrenciMap );
    }
}
