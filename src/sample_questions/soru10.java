package sample_questions;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        /*
        Kullanicidan kilosunu ve boyunu isteyin
        vucut kitle endeksini heaplayan bir program yazin
        **indeks Hesaplama:Vucut kitle indeksi=Agirlik kg/Boy uzunlugunun karesi
        Kullaniciya asagidaki gibi mesaj verin:
        Eger VKI18.5'ten az ise--> zayifsiniz
        Eger VKI 18.5 ile 25 arasinda  ise--> kilo idealdir
        Eger VKI 25 ile 30 arasinda ise--> sismansiniz
        Eger VKI 30'a esit veya daha fazlaysa--> agam obezsin,diyet yap!
        orn:
        Agirlik:71
        Boy:1.72
        VKI degeri:23.99945--> kilonuz ideal
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen vucut agirliginizi kilo(kg) olarak giriniz:");
        double kilo= scanner.nextDouble();
        System.out.print("Lütfen boy uzunlugunuzu m cinsinden" +
                " olacak sekilde giriniz");
        double boy= scanner.nextDouble();
        double vki = kilo/(boy*boy);
        System.out.println(vki);
        if (vki<18.5){
            System.out.println("VKI degeriniz: "+vki+" --> zayifsiniz");
        } else if (vki>=18&&vki<25) {
            System.out.println("VKI degeriniz: "+vki+" --> kilo idealdir");
        } else if (vki>25&&vki<30) {
            System.out.println("VKI degeriniz: "+vki+" --> sismansiniz");
        } else if (vki>=30) {
            System.out.println("VKI degeriniz: "+vki+" --> agam obezsin, diyet yap");
        }
    }
}
