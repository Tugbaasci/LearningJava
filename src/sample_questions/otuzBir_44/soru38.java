package sample_questions.otuzBir_44;

import java.util.Arrays;

public class soru38 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
        verilen bu (Arrayden) diziden minimum ve
         maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.
         */
        int[] array={3,2,5,4,1,6};
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
        System.out.println("-----------1.cozum--------------");
        int enBuyuk=array[0];
        int enKucuk= array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>enBuyuk){
                enBuyuk=array[i];
            }
            if (array[i]<enKucuk){
                enKucuk=array[i];
            }
        }
        System.out.println("en buyuk: "+enBuyuk+"\nen kucuk: "
        +enKucuk);
        System.out.println("----------2.cozum----------------");
    }
}
