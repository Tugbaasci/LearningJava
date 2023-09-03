package QA_Team1.replit.ucuncu10_30;

import java.util.Scanner;

public class soru25 {
    public static void main(String[] args) {
         /*25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
    */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int aranan=scanner.nextInt();
        int[] sayiArr={12,15,43,23,56,76,78,90,77,43};
        System.out.println("Aradiginiz "+aranan+" sayisi array'de "+kacinciSirada(sayiArr, aranan)+". siradadir");
        numara(sayiArr,aranan);
    }

    public static int kacinciSirada(int[] sayiArr, int aranan) {
        int sira=0;
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]==aranan) {
                sira=i;
            }
        }return sira;
    }
    public static void numara(int[] arr,int aranan){
        int sira=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==aranan){
                sira=i;
            }
        }
        System.out.println("Aradiginiz "+aranan+" sayisi array'de "+sira+".sirada bulunmaktadir");
    }
}
