package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan array'in boyutunu ve elemntlerini alip,
        array'i olusturan ve bize donduren bir method olusturun
         */
        System.out.println(Arrays.toString(sayiAlArrayYap()));

    }
    public static int[] sayiAlArrayYap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz " +
                "array'in boyutunu giriniz");
        int uzunluk = scanner.nextInt();
        int[] yeniArray = new int[uzunluk];
        for (int i = 0; i < yeniArray.length ; i++) {
            System.out.println("Lütfen array'e eklemek istediginiz" +
                    " sayiyi giriniz");
            int sayi = scanner.nextInt();
            yeniArray[i]=sayi;
        }return yeniArray;
    }
}
