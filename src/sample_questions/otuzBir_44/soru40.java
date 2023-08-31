package sample_questions.otuzBir_44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru40 {
    public static void main(String[] args) {
        /*
        Parametre olarak 2 Int Array kabul eden ve
        2 Array listesini yeni bir Arraye ekleyen ve
        yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,6,9,6,};
        ArrayeEkle(arr1,arr2);
    }
    public static void ArrayeEkle(int[] arr1,int[] arr2){
        int[] yepyeniArr= new int[arr1.length+ arr2.length];
        List<Integer> yeni1= new ArrayList<>();
        List<Integer> yeni2= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            yeni1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            yeni2.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            yepyeniArr[i]=yeni1.get(i);
        }
        for (int i = 0; i < arr2.length; i++) {
            yepyeniArr[i+ arr1.length]=yeni2.get(i);
        }
        System.out.println(Arrays.toString(yepyeniArr));

    }
}
