import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSoru {
    /*
    Verilen tekrarli bir array'i kalici bir sekilde
    degistrebilmek icin kod yazin.
     */
    public static void main(String[] args) {
        int[] sayiArr={1,2,2,3,1,4,5,6,5,2,3,4,3,2,1,9};
        Set<Integer> tekrarsizSet=new TreeSet<>();
        int index=0;
        for (Integer each:sayiArr) {
            tekrarsizSet.add(each);
        }
        sayiArr=new int[tekrarsizSet.size()];
        for (Integer each:tekrarsizSet) {
            sayiArr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(sayiArr));
    }
}
