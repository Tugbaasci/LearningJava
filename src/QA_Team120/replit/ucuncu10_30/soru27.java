package QA_Team120.replit.ucuncu10_30;

import java.util.Arrays;

public class soru27 {
    public static void main(String[] args) {
         /*27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */
        int[] sayiArr={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(sayiArr);
        int sondanBiOnce=sayiArr[sayiArr.length - 2];
        System.out.println(sondanBiOnce);
    }
}
