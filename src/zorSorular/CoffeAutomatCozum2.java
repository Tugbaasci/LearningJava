package zorSorular;

import java.util.Scanner;

public class CoffeAutomatCozum2 {
     /*
    1. Şart
   3 çeşit kahvemiz olsun.
  Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Americano
     */
    static Scanner scanner= new Scanner(System.in);
    static String kahveCesidi="",sut="",seker="",kahveBoyu="";
    static int sekerSayisi=0;

    public static void main(String[] args) {
        menu();
        sut();
        seker();
        kahveBoy();
        sonuc();
    }
    static void menu(){
        System.out.println("***********  KAHVECIYE HOSGELDINIZ  ***************");

        do {
            System.out.print("HANGI KAHVEYI ISTERSINIZ?\n" +
                    "TÜRK KAHVESI\n" +
                    "FILTRE KAHVE\n" +
                    "AMERICANO\n" +
                    "SECIMINIZ:");
            kahveCesidi=scanner.nextLine();
            if (!kahveCesidi.equalsIgnoreCase("türk kahvesi")&&
            !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
            !kahveCesidi.equalsIgnoreCase("americano")){
                System.out.println("ARADIGINIZ KAHVE MENUDE YOKTUR!");
            }

        }while(!kahveCesidi.equalsIgnoreCase("türk kahvesi")&&
                !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
                !kahveCesidi.equalsIgnoreCase("americano"));
    }
    static void sut(){
         /*
    2.Şart
  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
     */
        System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)");
        sut= scanner.next();
        if (sut.equalsIgnoreCase("evet")) System.out.println("Sut ekleniyor.....");
        else System.out.println("Sut eklenmiyor.........");
    }
    static void seker(){
        /*3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
     */
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        seker=scanner.next();
        if (seker.equalsIgnoreCase("evet")){
            System.out.println("Kac seker istersiniz");
            sekerSayisi=scanner.nextInt();
            System.out.println(sekerSayisi+" adet seker ekleniyor......");
        }else {
            System.out.println("seker eklenmiyor.........");
        }
    }
    static void kahveBoy(){
         /*
    4. Şart
  Şeker tercihini yaptıktan sonra sistem kullanıcıya kahvenin "Hangi boyutta olsun?
   (Büyük boy - orta boy - küçük boy olarak giriniz.)
  sorusunu sorsun.
     */

        System.out.println("Hangi boyutta olsun?\n(Buyuk boy - orta boy - kucuk boy olarak giriniz.)");
        //scanner=new Scanner(System.in); bu da ise yariyor
        scanner.nextLine();//bu da yukardaki ve bu atlamayi onluyor
        kahveBoyu= scanner.nextLine();
        if (!kahveBoyu.equalsIgnoreCase("buyuk boy")&&
        !kahveBoyu.equalsIgnoreCase("orta boy")&&
        !kahveBoyu.equalsIgnoreCase("kucuk boy")){
            System.out.println("HATALI GIRIS YAPTINIZ");
            kahveBoy();
        }
    }
    static void sonuc(){
         /*
    Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */
        if (sut.equalsIgnoreCase("evet")){
            sut="sütlü";
        }else{
            sut="sütsüz";
        }
        if (seker.equalsIgnoreCase("evet")){
            seker=sekerSayisi+" sekerli";

        }else {
            seker="sekersiz";
        }
        System.out.println(kahveBoyu+" "+sut+" "+seker+" "+kahveCesidi+" niz hazir");
    }
}
