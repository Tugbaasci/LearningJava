package sample_questions.otuzBir_44;

import java.util.Arrays;
import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen array uzunlugunu giriniz:");
        int uzunluk = scanner.nextInt();
        int[] arr= new int[uzunluk];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lütfen array elemanini giriniz");
            int sayi = scanner.nextInt();
            arr[i]+=sayi;
        }
        System.out.println(Arrays.toString(arr));
    }
}
