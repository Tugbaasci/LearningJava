package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class notOrtForEach {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun
        // Bu notların ortalamasını hesaplayarak ekrana yazdırın.
        // Örnek çıktı:
        // Notların ortalaması: 78.5
        Scanner scanner = new Scanner(System.in);
        List<Double> not=new ArrayList<>();

        for (int i = 0; i <5; i++) {
            System.out.print("Lütfen "+(i+1)+". notunuzu giriniz:");
            not.add(scanner.nextDouble());
        }
        Double toplam=0.0;
        for (Double each:not) {
            toplam+=each;
        }
        System.out.println("Not ortalamasi: "+toplam/not.size());
    }
}
