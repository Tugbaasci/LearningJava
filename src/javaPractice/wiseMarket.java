package javaPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class wiseMarket {
     /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp,
     ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan,
     kasaya gidince fiş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin
      Variable'ları belirleyelim
      urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam
    */
    static Scanner scanner=new Scanner(System.in);
    static String urunAdi="",sepet="";
    static double urunFiyati=0;
    static int urunMiktari=0,urunKodu=0,toplam=0;
     public static void main(String[] args) {
         girisEkrani();
     }
     public static void girisEkrani(){
         System.out.print("==================== WISE MARKET KASA PROGRAMI ===================================\n\n" +
                 "      HOSGELDINIZ:\n" +
                 "      1. ŞARKÜTERİ ÜRÜNLERİ\n" +
                 "      2. MANAV ÜRÜNLERİ\n" +
                 "      3. MARKET ÜRÜNLERİ\n" +
                 "      4. FIS YAZDIR\n" +
                 "      5. CIKIS\n\n" +
                 "      LUTFEN SECIMINIZI GIRINIZ:");
         menu();
     }
     public static void menu(){
         int secim= scanner.nextInt();
         switch (secim){
             case 1:
                 sarkuteri();
             case 2:
                 manav();
             case 3:
                 market();
             case 4:
                 fisYazdir();
             case 5:
                 cikis();
         }
     }

    private static void sarkuteri() {
        System.out.println("==========        SARKUTERI REYONUNA HOSGELDINIZ        ==========");
        System.out.print("SARKUTERI URUNLERI\n\n" +
                "       61. KASAR\n" +
                "       62. BEYAZ PEYNIR\n" +
                "       63. SIYAH ZEYTIN\n" +
                "       64. YUMURTA\n" +
                "       65. SUCUK\n\n" +
                "LUTFEN SECIMIZI GIRINIZ:");
        urunKodu= scanner.nextInt();
        System.out.println("Kac paket istersiniz?");
        urunMiktari= scanner.nextInt();
        switch (urunKodu){
            case 61:
                urunAdi="Kasar";
                urunFiyati=90;
            case 62:
                urunAdi="Beyaz peynir";
                urunFiyati=75;
            case 63:
                urunAdi="Siyah Zeytin";
                urunFiyati=55;
            case 64:
                urunAdi="Yumurta";
                urunFiyati=40;
            case 65:
                urunAdi="Sucuk";
                urunFiyati=150;
        }
    }

    private static void manav() {
    }

    private static void market() {
    }

    private static void fisYazdir() {
    }

    private static void cikis() {
    }
}
