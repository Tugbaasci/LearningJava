package javaPractice.day7;

import java.util.Scanner;

public class multidimensional2 {
    public static void main(String[] args) {
        /*
        5x2'lik bir multidimensional(Her birinin icinde 2 eleman bulunduran 5 elemanli)
         array olusturun ve icine sehir ve nufus bilgileri ekleyin
         Daha sonra kullanicidan sehri alarak nufus bilgilerini ekrana yazdirin
         */
        String[][] sehirler={
                {"Ankara","5.000.000"},
                {"Kirikkale","277.000"},
                {"Adana","2.000.000"},
                {"Elazig","450.000"},
                {"Amsterdam","1.100.000"}};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen nufusunu ogrenmek istediginiz sehri giriniz: ");
        String sehir = scanner.next();
        for (int i = 0; i < sehirler.length; i++) {
            if (sehir.equalsIgnoreCase(sehirler[i][0])){
                String nufus=sehirler[i][1];
                System.out.println("Girilen "+sehir+" sehrinin nufusu "+nufus);
            }
        }

    }
}
