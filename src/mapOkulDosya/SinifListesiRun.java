package mapOkulDosya;

import java.util.Map;

public class SinifListesiRun {
    // ogrenci map'de sinif ve sube verdigimizde
    // o sinifta bulunan ogrenci isim ve soyisimlerini yazdirin
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=Metodlar.ogrenciMapOlustur();
        Metodlar.isimSoyisimListesiOlustur(ogrenciMap);
        Metodlar.sinifSubesiVerilenOgrenciYaz(ogrenciMap,11,"h");
        Metodlar.isimSoyisimleOgrenciBul(ogrenciMap,"Sevgi","Can");
        Metodlar.ogrenciNoileOgrenciBilgisiYazdir(ogrenciMap,103);
        Metodlar.ogrenciNoileIsimListesiOlustru(ogrenciMap);
        System.out.println(Metodlar.sinifiBirArtir(ogrenciMap));
        Map<Integer,String> ogrenciMap1=Metodlar.ogrenciMapOlustur();
        System.out.println(Metodlar.ogrenciAlanDegistir(ogrenciMap1,"TM","EA"));
    }
}
