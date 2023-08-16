package javaPractice;

import java.util.Scanner;

public class bolmeIslemiYapmadanBolme {
    public static void main(String[] args) {
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim
        // ve bolme operatoru kullanmadan bolme islemini gerceklestirip
        // bolumu hesaplayan method create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bolunecek sayi giriniz");
        int bolunen = scanner.nextInt();
        System.out.print("Boleni giriniz");
        int bolen= scanner.nextInt();
        System.out.println("Bolunen "+bolunen+" sayisinin "+bolen+"'e bolunmesi sonucu, bolum: " +
                ""+bolumHesapla(bolunen, bolen)+" olur");

    }
    public static int bolumHesapla(int bolunen, int bolen){
        int flag=0;
        while(bolunen>=bolen){
            bolunen-=bolen;
            flag++;
        }return flag;
    }
}
