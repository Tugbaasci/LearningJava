package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir isim ve bir karakter girmesini isteyin
        isimde karakterin kac kere tekrarlandigini kontrol edin
        orn:
        char ch1='a';
        String name = "Ali bakkala gec gitti."
        Beklenen cikti: a sayisi==> 3
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen metni giriniz");
        String metin = scanner.nextLine();
        System.out.print("Lütfen kontrol edilecek olan karakteri giriniz");
        char karakter = scanner.next().toLowerCase().charAt(0);
        int sayac=0;
        int index=0;
        while(metin.length()>index){
            if (metin.charAt(index)==karakter){
                sayac++;
            }index++;
        }
        System.out.println("Girilen "+karakter+" harfi ==> "+sayac+" defa kullanilmis");
    }
}
