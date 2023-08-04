package sample_questions;

import java.util.Scanner;

public class soru21 {
    public static void main(String[] args) {
        /*
        Mülakat Sorusu / Interview Sorusu / Leak Year
        Bir aydaki gün sayısını bulmak için bir Java programı yazın

        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016
        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
        Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
        Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa
        bu yıl artık yıldır.
        Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve
        4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa,
        yine bu yıl yine artık yıldır.
        Mesela 2000 yılı artık yıldır.Son iki rakamı
        "00" ve 400 e bölünebilen bir sayıdır.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ay numarasini giriniz:");
        int ay= scanner.nextInt();
        System.out.print("Lütfen yil bilgisini giriniz:");
        int yil = scanner.nextInt();
        switch (ay){
            case 1:
                System.out.println("Ocak "+yil+"'da 31 gun vardir");
                break;
            case 2:
                artikYil(ay,yil);
                break;
            case 3:
                System.out.println("Mart "+yil+"'da 31 gun vardir");
                break;
            case 4:
                System.out.println("Nisan "+yil+"'da 31 gun vardir");
                break;
            case 5:
                System.out.println("Mayis "+yil+"'da 31 gun vardir");
                break;
            case 6:
                System.out.println("Haziran "+yil+"'da 31 gun vardir");
                break;
            case 7:
                System.out.println("Temmuz "+yil+"'da 31 gun vardir");
                break;
            case 8:
                System.out.println("Agustos "+yil+"'da 31 gun vardir");
                break;
            case 9:
                System.out.println("Eylul "+yil+"'da 30 gun vardir");
                break;
            case 10:
                System.out.println("Ekim "+yil+"'da 31 gun vardir");
                break;
            case 11:
                System.out.println("Kasim "+yil+"'da 30 gun vardir");
                break;
            case 12:
                System.out.println("Aralik "+yil+"'da 31 gun vardir");
                break;
        }
        }
    public static void artikYil(int ay,int yil){
        int sonIkiBas= yil%100;
        if ((sonIkiBas!=00 && sonIkiBas%4==0)||(sonIkiBas==00&&sonIkiBas%400==0)){
            System.out.println("Subat "+yil+" 'da 29 gun vardir");
        }else {
            System.out.println("Subat "+yil+" 'da 28 gun vardir");
        }
    }

}
