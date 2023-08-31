package sample_questions.otuzBir_44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru37 {
    public static void main(String[] args) {
        /*
     SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
     (Eliminate duplicates)
     ENG:
     Write a method that returns a new array by eliminating the duplicate values
     in the array using the following method header
     Write a test program that reads in ten integers, invokes the method,
     and displays the result.
     (Tekrarlananları çıkar)
     TÜR:
     Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki
     başlıga sahip bir metot yazınız.
     On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren
     bir test programı yazınız.
     ---->>>
     public static int[] eliminateDuplicates(int[] list)
     ÖRNEK:
     On sayi giriniz:
     1 2 3 2 1 6 3 4 5 2
     ÇIKTI:
     Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */
        int[] arr ={2,4,4,6,5,3,2,3,4,5};
        System.out.println(Arrays.toString(tekrarsizArray(arr)));

    }
    public static int[] tekrarsizArray(int[] arr){
        List<Integer> yeniList= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!yeniList.contains(arr[i])){
                yeniList.add(arr[i]);
            }
        }
        int[] yeniArr = new int[yeniList.size()];
        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=yeniList.get(i);
        }return yeniArr;
    }
}
