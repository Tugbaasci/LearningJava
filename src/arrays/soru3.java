package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soru3 {
    public static void main(String[] args) {
        /*
        Verilen bir array'deki tum elementleri bir saga kaydirip
        sondaki elementi de basa tasiyacak bir method olusturun
        array'i yeni haliyle kaydedin
        orn:input:[4,5,6,7] array'in son hali:[7,4,5,6]
         */
        int[] arr ={1,2,3,4,5,6};
        arr =sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sagaKaydir(int[] sayi){
        int[] yeniarr = new int[sayi.length];
        yeniarr[0]=sayi[sayi.length-1];
        for (int i = 1; i < sayi.length ; i++) {
            yeniarr[i]=sayi[i-1];
        }return yeniarr;
    }
}
