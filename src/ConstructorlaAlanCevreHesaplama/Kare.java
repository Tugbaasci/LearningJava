package ConstructorlaAlanCevreHesaplama;

public class Kare extends Dikdortgen{
    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "kenar= " + uzunKenar +
                ", alan= "+ alanHesapla(uzunKenar,kisaKenar)+
                ", cevre= "+ cevreHesapla(uzunKenar,kisaKenar);
    }
}
