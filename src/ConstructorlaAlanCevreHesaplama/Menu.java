package ConstructorlaAlanCevreHesaplama;

import java.util.Scanner;

public class Menu {
    static Scanner scanner=new Scanner(System.in);
    static void menu(){
        System.out.println("1. Dikdortgen\n"+
                "2. Cember\n"+
                "3. Kare\n"+
                "4. Cikis\n"+
                "SECIMINIZ :");
        int secim= scanner.nextInt();
        switch (secim){
            case 1:
                dikdortgenOlustur();
            case 2:
                cemberOlustur();
            case 3:
                kareOlustur();
            case 4:
                System.exit(0);
            default:
                System.out.println("HATALI GIRIS YAPTINIZ.........");
        }
    }

    private static void kareOlustur() {
        System.out.println("Lütfen karenin kenar uzunlugunu giriniz");
        double kenar= scanner.nextDouble();
        Kare kare=new Kare(kenar,kenar);
        System.out.println(kare);
        menu();
    }

    private static void cemberOlustur() {
        System.out.println("Lütfen cember icin yaricap degeri giriniz");
        double  yaricap= scanner.nextDouble();
        Cember cember=new Cember(yaricap);
        System.out.println(cember);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.println("Lütfen uzun kenarin degerini giriniz");
        double uzunKenar= scanner.nextDouble();
        System.out.println("Lütfen kisa kenarin degerini giriniz");
        double kisaKenar= scanner.nextDouble();
        Dikdortgen dikdortgen=new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }
}
