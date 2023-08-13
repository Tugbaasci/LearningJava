package javaPractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class yuzGunSonrasiniHesaplama {
    public static void main(String[] args) {
        LocalDate baslangic= LocalDate.of(1983,2,22);
        LocalDate gelecek = farkHesapla(baslangic,120);
        System.out.println("120 gun sonrasi: "+gelecek);
    }
    static LocalDate farkHesapla(LocalDate baslangic, long eklenecekGun){
        return baslangic.plus(eklenecekGun, ChronoUnit.DAYS);
    }
}
