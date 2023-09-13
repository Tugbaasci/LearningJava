package mapOkulDosya;

import java.util.*;

public class Metodlar {
    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap=new TreeMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        return ogrenciMap;
    }
    public static void isimSoyisimListesiOlustur(Map<Integer,String> ogrenciMap){
      Collection<String> ogrenciIsimSoyisim= ogrenciMap.values();
      int siraNo=1;
        for (String value:ogrenciIsimSoyisim) {
            String[] arr=value.split("-");
            System.out.println(siraNo+"  "+arr[0]+" "+arr[1]);
            siraNo++;
        }
    }
    public static void sinifSubesiVerilenOgrenciYaz(Map<Integer,String> ogrenciMap,
                                                    int sinif, String sube){
        Collection<String> listele=ogrenciMap.values();
        System.out.println(sinif+".sinif "+sube+" subesindeki ogrenci listesi");
        System.out.println("====================================");
        for (String each:listele) {
            String[] arr=each.split("-");
            String sinifStr=sinif+"";
            if (sinifStr.equals(arr[2])&&sube.equalsIgnoreCase(arr[3])){
                System.out.println(arr[0]+" "+arr[1]);
            }
        }
    }
    public static void isimSoyisimleOgrenciBul(Map<Integer,String> ogrenciMap,
                                               String isim,String soyisim){
        Collection<String> value=ogrenciMap.values();
        for (String eachValue:value) {
            String[] strarr=eachValue.split("-");
            if (strarr[0].equalsIgnoreCase(isim) && strarr[1].equalsIgnoreCase(soyisim)) {
                System.out.println(strarr[0]+" "+strarr[1]+" "+strarr[2]+" "+strarr[3]);

            }
        }
    }
    public static void ogrenciNoileOgrenciBilgisiYazdir(Map<Integer,String> ogrenciMap,int ogrenciNo){
        String ogrenciBilgi=ogrenciMap.get(ogrenciNo);
        String[] ogrenciBilgiArr=ogrenciBilgi.split("-");
        System.out.println("isim: "+ogrenciBilgiArr[0]+" "+"soyisim: "+ogrenciBilgiArr[1]+
                " "+"sinif: "+ogrenciBilgiArr[2]+" "+"sube: "+ogrenciBilgiArr[3]);
    }
    public static void ogrenciNoileIsimListesiOlustru(Map<Integer,String> ogrenciMap){
        Set<Integer>ogrenciNoSet= ogrenciMap.keySet();
        for (Integer each:ogrenciNoSet) {
            System.out.print(each+" ");
            String str=ogrenciMap.get(each);
            String[] strArr=str.split("-");
            System.out.println(strArr[0]+" "+strArr[1]);
        }
    }

    public static Map<Integer, String> sinifiBirArtir(Map<Integer, String> ogrenciMap) {
        Set<Integer> ogrenciKeySet= ogrenciMap.keySet();
        for (Integer eachValue:ogrenciKeySet) {
            String ogrenciBilgileri=ogrenciMap.get(eachValue);
            String[] valueArr=ogrenciBilgileri.split("-");
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

            ogrenciMap.put(eachValue,yeniValue);
        }return ogrenciMap;
    }
    public static Map<Integer,String> ogrenciAlanDegistir(Map<Integer,String> ogrenciMap,String eskiAlan,String yeniAlan){
        Set<Integer> KeySet=ogrenciMap.keySet();
        for (Integer eachKey:KeySet) {
            String str=ogrenciMap.get(eachKey);
            String[] strArr =str.split("-");
            if (strArr[4].equalsIgnoreCase(eskiAlan)){
                strArr[4]=yeniAlan;
        } String yeniValue=strArr[0]+" "+strArr[1]+" "+strArr[2]+" "+strArr[3]+" "+strArr[4];
            ogrenciMap.put(eachKey,yeniValue);
        }return ogrenciMap;

    }


}
