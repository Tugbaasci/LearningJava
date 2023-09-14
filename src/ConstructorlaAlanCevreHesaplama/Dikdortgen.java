package ConstructorlaAlanCevreHesaplama;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "uzunKenar= " + uzunKenar +
                ", kisaKenar= " + kisaKenar +
                ", alan= "+alanHesapla(uzunKenar,kisaKenar)+
                ", cevre= "+cevreHesapla(uzunKenar,kisaKenar);
    }
}
