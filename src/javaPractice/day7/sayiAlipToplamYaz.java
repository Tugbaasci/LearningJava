package javaPractice.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sayiAlipToplamYaz {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alip bir array list olustur
        bu sayilarin toplamini ekrana yazdir
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> sayiList=new ArrayList<>();
        int top=0;
        //for (int i = 0; i <5; i++) {
        //    System.out.println("Lütfen array'in "+(i+1)+".elemanini giriniz");
        //    int sayi = scanner.nextInt();
        //    sayiList.add(sayi);
        //    top+=sayi;
        //}
        //System.out.println("Girilen sayilar: "+sayiList);
//
        //System.out.println("Girilen sayilarin toplami: "+top);
        System.out.println("-----------------for each'le------------------------");
        for (int i = 0; i <5; i++) {
            System.out.println("Lütfen array'in "+(i+1)+".elemanini giriniz");
            int sayi = scanner.nextInt();
            sayiList.add(sayi);
        }
        for (int each:sayiList) {
            top+=each;
        }
        System.out.println("Girilen sayilarin toplami: "+top);


    }
}
