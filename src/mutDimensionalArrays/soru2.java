package mutDimensionalArrays;

import java.util.Arrays;

public class soru2 {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir array'de ayni index'e sahip
        elementleri toplayip,yeni olusturacagimiz tek katli bir array'e
        bu toplamlari atayin
         */

        int[][] sayilar ={{1,2,3},{5,7}};
        int uzunluk = sayilar[sayilar[0].length < sayilar[1].length ? 0 : 1].length;
        int [] yeniArr = new int[uzunluk];
        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i]=sayilar[0][i]+sayilar[1][i];
        }
        System.out.println("yeni array: "+ Arrays.toString(yeniArr));
    }



}
