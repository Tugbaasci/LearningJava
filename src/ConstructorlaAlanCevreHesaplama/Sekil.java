package ConstructorlaAlanCevreHesaplama;

public class Sekil {
      /*
        1-asagidaki hiyarasiye gore classlar creat ediniz...
         sekil <--Cember
         sekil <--Dikdortgen<--Kare
        2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
        3- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
     */
    double uzunKenar;
    double kisaKenar;
    double yaricap;

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }
    double cevreHesapla(double uzunKenar, double kisaKenar){
        return 2*(uzunKenar+kisaKenar);
    }
    double cevreHesapla(double yaricap){
        return 2*3.14*yaricap;
    }
    double alanHesapla(double uzunKenar,double kisaKenar){
        return uzunKenar*kisaKenar;
    }
    double alanHesapla(double yaricap){
        return 3.14*yaricap*yaricap;
    }


}
