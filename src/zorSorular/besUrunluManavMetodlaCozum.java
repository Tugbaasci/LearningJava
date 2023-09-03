package zorSorular;

import java.util.Scanner;

public class besUrunluManavMetodlaCozum {
    /* Basit bir 5 ürünlü manav alisveris programi yaziniz.

            1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
            2. Adim : Baska bir urun almak isteyip istemedigini sor.
            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
            3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
            toplam fiyata ekle.
            4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
    */

    //String[] urunler ={"elma" ,"armut" , "muz", "kivi", "uzum"};
    //double[] fiyat = {2.0 , 3.5 , 5.9 , 4.0 , 5.0} ;
    static String urunAdi="";
    static double urunFiyati=0.0;
    static double toplam = 0;
    static boolean devamEt = true;
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        urunSec();
    }
    public static void girisEkrani(){
        System.out.println("===========HOSGELDINIZ============\n\t\t\t" +
                "SEN MANAV\n" +
                "1. Elma\n2. Armut\n3. Muz\n4. Kivi\n5. Uzum");
        }
    public static void urunSec(){
        girisEkrani();
        System.out.println("Lütfen almak istediginiz urunu girin:");
        int urun= scanner.nextInt();
        switch (urun){
            case 1:
                urunAdi="Elma";
                urunFiyati=3.90;
                break;
            case 2:
                urunAdi="Armut";
                urunFiyati=4.50;
                break;
            case 3:
                urunAdi="Muz";
                urunFiyati=2.30;
                break;
            case 4:
                urunAdi="Kivi";
                urunFiyati=6.70;
                break;
            case 5:
                urunAdi="Uzum";
                urunFiyati=3.40;
                break;
        }System.out.println("Lütfen almak istediginiz urunden kac kilo almak istediginizi girin");
        double kilo= scanner.nextDouble();
        toplam+=kilo*urunFiyati;
        System.out.println(urunAdi+" "+urunFiyati+"TL "+kilo+" kilo "+toplam+"TL");
        System.out.println("Baska urun almak ister misiniz? Evet/Hayir");
        String cevap=scanner.next();
        if (cevap.equalsIgnoreCase("evet")){
            urunSec();
        }else{
            System.out.println("Toplam: "+toplam);
            System.exit(0);
        }
        System.out.println("Toplam: "+toplam);

    }

}
