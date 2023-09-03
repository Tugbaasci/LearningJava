package studentPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDondurmeSorusu {
    public static void main(String[] args) {
        //Tekrarlanan sayilarin cikarildigi
        // yeni bir dizi yazdiran bir metod yazin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen array elemanlarini giriniz");
        int[] sayiArr=new int[10];
        for (int i = 0; i < sayiArr.length ; i++) {
            sayiArr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(tekrarsizArrYap(sayiArr)));
    }

    public static int[] tekrarsizArrYap(int[] tekrarliArr){
        List<Integer> sayiList=new ArrayList<>();
        for (int i = 0; i < tekrarliArr.length; i++) {
            if (!sayiList.contains(tekrarliArr[i])){
                sayiList.add(tekrarliArr[i]);
            }
        }
        int[] tekrarsizArr=new int[sayiList.size()];
        for (int i = 0; i < sayiList.size(); i++) {
            tekrarsizArr[i]=sayiList.get(i);
        }return tekrarsizArr;
    }

}
