package QA_Team1.replit.ucuncu10_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru26 {
    public static void main(String[] args) {
        /*26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
    */
        String[] programArr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list=new ArrayList<>(Arrays.asList(programArr));
        System.out.println("Beklenen cikti:\n"+list);
        arrayListeCevir(programArr);

    }
    public static void arrayListeCevir(String[] arr){
        List<String> program=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            program.add(arr[i]);
        }
        System.out.println("Array'in ArrayList'e donusturulmus hali: "+program);
    }

}
