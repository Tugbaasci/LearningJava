package QA_Team120.replit.dorduncu10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class soru33 {
    public static void main(String[] args) {
        /*33-----
    Bir arrayi tersine çeviren  method yazınız.

    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */
        int[] sayiArr={1,2,3,4};
        List<Integer> sayi= new ArrayList<>();
        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);

        Collections.reverse(sayi);
        System.out.println(sayi);
    }
}
