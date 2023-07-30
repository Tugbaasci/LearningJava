package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class tekraredenSayilariSil {
    public static void main(String[] args) {
        /*
        verilen bir int array'de, tekrar eden elementleri silin
        array'i unique degerlerden olusan haline donusturun
         */
        List<Integer> tekrarsizList = new ArrayList<>();
        int[] arr = {2,4,5,3,2,5,1,5,3,7};
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println(tekrarsizList);

}
}
