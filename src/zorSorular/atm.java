package zorSorular;

import java.sql.SQLOutput;
import java.util.Scanner;

public class atm {
    /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin,
eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

Menu listesinde Bakiye sorgula, para yatirma, para çekme,
para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali
ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
sifre değişiklik işlemini yapmali,
     */
    static Scanner scanner= new Scanner(System.in);
    static String varOlanKartNo="321321";
    static String varolanSifre="123";
    static int bakiye=50000;

    public static void main(String[] args) {
        girisEkrani();
    }
    public static void girisEkrani(){
        System.out.println("Lutfen Kart numaranizi giriniz:");
        String girilenKartNo = scanner.nextLine().toUpperCase().
                replace(" ","");
        System.out.println("Sifrenizi giriniz: ");
        String girilenSifre= scanner.next();
        if (varOlanKartNo.equals(girilenKartNo)&&girilenSifre.equals(varolanSifre)){
            menu();
        }else{
            System.out.println("HATALI GIRIS YAPTINIZ....");
            girisEkrani();
        }

    }
    public static void menu(){
        System.out.println("-------------------GUVENBANK'A HOSGELDINIZ-----------------");

        System.out.println("=========   MENU   ==========\n1- Bakiye Sorgula\n2- Para Yatirma" +
                "\n3- Para Cekme\n4- Para Gonderme\n5- Sifre Degistirme\n6- Cikis");
        System.out.println("LÜTFEN SECMEK ISTEDIGINIZ ISLEMI SECINIZ: ");
        int secim = scanner.nextInt();
        switch (secim){
            case 1 :{
                bakiyeSorgula();
            }
            case 2 :{
                System.out.println("lütfen yatirmak istediginiz miktari giriniz");
                int miktar= scanner.nextInt();
                paraYatirma(miktar);
            }
            case 3 :{
                System.out.println("Lütfen cekmek istediginiz miktari giriniz");
                paraCekme(scanner.nextInt());
            }
            case 4 :{
                paraGonderme();
            }
            case 5 :{
                sifreDegistirme();
            }
            case 6 :{
                System.out.println("BIZI SECTIGINIZ ICIN TESEKKUR EDERIZ....");
                System.exit(0);
            }
            default:{
                System.out.println("YANLIS GIRIS YAPTINIZ....");
                menu();
            }
        }
    }
    public static void bakiyeSorgula() {
        System.out.println("BAKIYE: "+bakiye+" $");
        menu();
    }
    public static void paraYatirma(int miktar) {
        bakiye+=miktar;
        System.out.println("yatan miktar : "+miktar);
        bakiyeSorgula();
    }

    public static void paraCekme(int miktar) {
        System.out.println("cekilen miktar: "+miktar);
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();
        }else{
            System.out.println("Bakiyeden daha fazla para cekemzsiniz\n " +
                    "Miktar Giriniz....");
            int yeniMiktar= scanner.nextInt();
            paraCekme(yeniMiktar);
        }
    }
    public static void paraGonderme() {
        scanner= new Scanner(System.in);
        System.out.println("IBAN GIRIN:");
        String iban = scanner.nextLine().toUpperCase().
                replace(" ","");
        if (iban.length()==26 && iban.startsWith("TR")){
            System.out.println("Lütfen gondermek istediginiz miktari giriniz");
            int miktar= scanner.nextInt();
            if (miktar<=bakiye){
                bakiye-=miktar;
                System.out.println("isleminiz basariyla gerceklestirildi");
                bakiyeSorgula();
            }else {
                System.out.println("Bakiyeniz yetersiz");
                menu();
            }

        }else{
            System.out.println("HATALI IBAN GIRDINIZ...");
            menu();
        }
    }
    private static void sifreDegistirme() {
        System.out.print("MEVCUT SIFREYI GIRINIZ: ");
        String girilenSifre = scanner.next();
        if (varolanSifre.equals(girilenSifre)) {
            System.out.print("YENI SIFRE GIRINIZ: ");
            varolanSifre = scanner.next();
            girisEkrani();
        } else {
            System.out.println("SENDE KIMSIN !!!!!");
            sifreDegistirme();
        }
    }
    public static void cikis(){
        System.out.println("---- BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ ----");
        System.exit(0);

    }
}


