package ConstrAtmSorusu;

public class Kalip {
    String kartNo;
    int sifre;
    double bakiye;

    public Kalip(String kartNo, int sifre, double bakiye) {
        this.kartNo = kartNo;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }
    public Kalip() {
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
