package ConstrAtmSorusu;

import java.util.ArrayList;
import java.util.Scanner;

public class Metod {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Kalip> kaliplist= new ArrayList<>();
    void giris(){
        System.out.println("Kullanici olusturmak icin '1'e,\n" +
                "Sisteme giris yapmak icin '2'ye basiniz\n" +
                "SECIMINIZ:");
        int secim= scanner.nextInt();
        scanner.nextLine();
        switch (secim){
            case 1:
                kullaniciOlustur();
            case 2:
                girisEkrani();
            default:
                System.out.println("HATALI GIRIS YAPTINIZ...");
                giris();
        }
    }
    void kullaniciOlustur(){
        System.out.println("kart no giriniz");
        String kartNo= scanner.nextLine();
        System.out.println("sifre giriniz");
        int sifre= scanner.nextInt();
        System.out.println("bakiyenizi giriniz");
        double bakiye= scanner.nextDouble();
        Kalip kalip= new Kalip(kartNo,sifre,bakiye);
        kaliplist.add(kalip);
        giris();
    }
    void girisEkrani(){
        System.out.println("sisteme giris yapabilmek icin kart no giriniz");
        String kartNo= scanner.nextLine();
        System.out.println("sifrenizi giriniz");
        int sifre= scanner.nextInt();
        for (Kalip each:kaliplist) {
            if (each.getKartNo().equals(kartNo)&&each.getSifre()==sifre){
                menu();
            }else{
                System.out.println("sifre veya kart no hatali");
                girisEkrani();
            }
        }
    }
    void menu(){
        System.out.println("Asagidaki islemlerden birini seciniz.\n1. Bakiye Sorgula\n" +
                " 2. Para yatirma\n3. Para cekme\n4. Para gonderme\n5. Sifre degistirme\n" +
                "6. Cikis\nSeciminiz: ");
        int menuSecim= scanner.nextInt();
        switch (menuSecim){
            case 1:
                bakiyeSorgula();
            case 2:
                paraYatirma();
            case 3:
                paraCekme();
            case 4:
                paraGonderme();
            case 5:
                sifreDegistirme();
            case 6:
                System.exit(0);
            default:
                System.out.println("HATALI MENU SECIMI");
        }
    }
    void bakiyeSorgula(){
        for (Kalip each :kaliplist) {
            System.out.println(each.getKartNo()+" a ait bakiye: "+each.getBakiye());
            menu();
        }
    }
    void paraYatirma(){
        System.out.println("Lütfen yatirmak istediginiz miktari giriniz");
        double yatanMiktar= scanner.nextDouble();
        for (Kalip each:kaliplist) {
            each.setBakiye(each.getBakiye()+yatanMiktar);
            bakiyeSorgula();
        }
    }
    void paraCekme(){
        System.out.println("cekmek istediginiz miktari giriniz");
        double cekilenMiktar= scanner.nextDouble();
        for (Kalip each:kaliplist){
            if (cekilenMiktar<=each.getBakiye()){
                each.setBakiye(each.getBakiye()-cekilenMiktar);
                bakiyeSorgula();
            }else{
                System.out.println("cekilen miktar bakiyeden buyuk olamaz");
            }
        }
    }
    void paraGonderme(){
        System.out.println("gonderilecek iban no'sunu giriniz");
        scanner.nextLine();
        String iban= scanner.nextLine().replace(" ","").toUpperCase();
        for (Kalip each:kaliplist) {
            if (iban.startsWith("TR")&&iban.length()==26){
                System.out.println("gonderilecek miktari giriniz");
                double gonMiktar= scanner.nextDouble();
                each.setBakiye(each.getBakiye()-gonMiktar);
                bakiyeSorgula();
            }else{
                System.out.println("hatali islem yapildi...");
                paraGonderme();
            }
        }
    }
    void sifreDegistirme(){
        int sayac=0;
        do {
            System.out.println("mevcut sifrenizi giriniz");
            int sifre= scanner.nextInt();
            for (Kalip each:kaliplist) {
                if (each.getSifre()==sifre){
                    System.out.println("yeni sifrenizi giriniz");
                    int yeniSifre= scanner.nextInt();
                    yeniSifre=sifre;
                    each.setSifre(yeniSifre);
                    System.out.println("sifre basariyla sonuclandi");
                    menu();
                }
                else{
                    System.out.println("yanlis sifre girildi");
                    sayac++;

                }
            }
        }while(sayac!=3);
        System.out.println("sistemden cikiliyor");
    }
}
