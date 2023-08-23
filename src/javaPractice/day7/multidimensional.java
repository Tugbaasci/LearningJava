package javaPractice.day7;

public class multidimensional {
    public static void main(String[] args) {
        /*
        Bir okulun ogrencilerinin matematik notlarini saklamak icin
        bir program yapmaniz gerekmektedir.Her ogrenci icin iki donemlik
        (ornegin;ilk ve ikinci donemlik) sinav notlarini saklamak icin kullanmaniz gerekmektedir.
        Ogrencilere ait notlari ve yil ortalamasini hesaplayan java programini yaziniz
         */
        int[][] notlar={{80,90},{60,90},{30,50},{70,80},{50,80}};
        for (int i = 0; i < notlar.length; i++) {
            int ilkDonemNotu=notlar[i][0];
            int ikinciDonem=notlar[i][1];
            System.out.println((i+1)+".ogrencinin Notlari:");
            System.out.println("1.Donem Notu: "+ilkDonemNotu);
            System.out.println("2.Donem Notu: "+ikinciDonem);
            double notOrt=(ilkDonemNotu+ikinciDonem)/2.0;
            System.out.println((i+1)+".ogrencinin yil sonu ortalamasi: "+notOrt);
            System.out.println("------------------------------------------------");

        }
    }
}
