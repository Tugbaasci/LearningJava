package sample_questions;

public class soru2 {
    public static void main(String[] args) {
        /*
        Dikdortgenin alanini ve cevresini hesaplayiniz
        Ipuclari:
        Dikdortgenin cevresi: 2*(uzun kenar + kisa kenar)
        Dikdortgenin alani: uzun kenar*kisa
         */
        int kisaKenar = 3;
        int uzunKenar = 5;
        int cevre = 2*(kisaKenar+uzunKenar);
        int alan = kisaKenar*uzunKenar;
        System.out.println("Dikdortgenin cevresi===> "+cevre);
        System.out.println("Dikdortgenin alani===> "+alan);
    }
}
