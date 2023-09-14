package sansliKullaniciSorusu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);
    Registration registration=new Registration();
    ArrayList<User> sistemeGirisYapanlar= new ArrayList<>();
    void menu(){

        boolean kontrol= true;

        do {
            System.out.println("1. Kayit alma\n" +
                    "2. Kayitlari listele\n" +
                    "3. Sansli kullanici goruntule\n" +
                    "4. Cikis\n" +
                    "SECIMINIZ : ");
            int secim= scanner.nextInt();
            switch (secim){
                case 1:
                    sistemeGirisYapanlar=registration.register();
                    break;
                case 2:
                    registration.kayitlariListele(sistemeGirisYapanlar);
                    break;
                case 3:
                    registration.happyUsers(sistemeGirisYapanlar);
                    break;
                case 4:
                    kontrol=false;
                    break;
                default:
                    System.out.println("HATALI GIRIS YAPTINIZ.....");
            }
        }while (kontrol);

    }
}
