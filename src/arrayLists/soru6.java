package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class soru6 {
    public static void main(String[] args) {
        /*    soru6-
                verilen pozitif bir tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir metod
        olusturun
        */
        System.out.println(pozitifBolenList(24));
    }
    public static List<Integer> pozitifBolenList(int sayi){
        List<Integer> yeniList = new ArrayList<>();
        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==0){
                yeniList.add(i);
            }
        }return yeniList;
    }
}
