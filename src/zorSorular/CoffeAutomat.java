package zorSorular;

import java.util.Scanner;

public class CoffeAutomat {

    public static void main(String[] args) {
        /*Basit bir Kahve makinesi oluşturun.
        1. Şart
        3 çeşit kahvemiz olsun.
                Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        2.Şart
        Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart
        Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.
        Sonuç
        Siparişlerimizi verdik. Son hali görmek istiyoruz.
        konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!

         */
        Scanner scanner= new Scanner(System.in);

        boolean kontrol=true;
        String kahveCevap="";
        while(kontrol){
            scanner= new Scanner(System.in);
            System.out.println("Hangi cesit kahve icmek istersiniz.\n1. Turk Kahvesi\n2. Filtre Kahve\n3. Espresso");
            int kahve=scanner.nextInt();
            if (kahve==1){
                kahveCevap="Turk Kahvesi";
                kontrol=false;
            }else if(kahve==2){
                kahveCevap="Filtre Kahve";
                kontrol=false;
            } else if (kahve==3) {
                kahveCevap="Espresso";
                kontrol=false;
            }else{
                System.out.println("Hatali giris yapildi");
                kontrol=true;
            }
        }

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        scanner= new Scanner(System.in);
        char cevap=scanner.next().toUpperCase().charAt(0);
        String sekerCevap="";
        if (cevap=='E'){
            System.out.println("Kac seker istersiniz?");
            int sekerSayisi=scanner.nextInt();
            sekerCevap=sekerSayisi+" adet sekerli";
        }else if(cevap=='H'){
            sekerCevap="Sekersiz";
        }
        System.out.println("Sut eklemek ister misiniz?Evet/Hayir");
        char sut=scanner.next().toUpperCase().charAt(0);
        String sutCevap="";
        if (sut=='E'){
            sutCevap="sutlu";
        }else if(sut=='H'){
            sutCevap="sutsuz";
        }else {
            System.out.println("Gecersiz giris yapildi");
        }
        scanner=new Scanner(System.in);
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String boy=scanner.nextLine();
        System.out.println("Isleminiz degerlendiriliyor..........\n" +
                boy+" "+sutCevap+" "+sekerCevap+" "+kahveCevap+"'niz hazir.\nAfiyet olsun !!! ");

    }

    }
