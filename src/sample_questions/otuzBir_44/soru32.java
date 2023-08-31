package sample_questions.otuzBir_44;

import java.util.Arrays;
import java.util.Scanner;

public class soru32 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz
        bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve
        kullancıya oluşturdugunuz arrayi buna tersten assign edin.
        */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen array uzunlugunu giriniz");
        int uzunluk= scanner.nextInt();
        int[] arr= new int[uzunluk];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lütfen array'e eklemek istediginiz elemani giriniz");
            int sayi= scanner.nextInt();
            arr[i]+=sayi;
        }
        int[] arrReverse = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            arrReverse[i]+=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrReverse));

    }
}
