package ConstructorlaAlanCevreHesaplama;

public class Cember extends Sekil{

    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "yaricap=" + yaricap +
                " alan= "+alanHesapla(yaricap)+
                " cevre= "+cevreHesapla(yaricap);
    }
}
