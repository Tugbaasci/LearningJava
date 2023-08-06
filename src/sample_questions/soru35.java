package sample_questions;

import java.util.Arrays;

public class soru35 {
    public static void main(String[] args) {
        /*
Parametre olarak bir isim kabul eden ve
ismi bir char Array dizisi olarak yazdıran bir method Return edin.
--> toCharArray() yöntemini kullanmayın
Örnek:
String isim:    Yakup
char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve
aldıgınız ismi methoda gönderin. Bu ismi parçalayarak,
her bir harfi, Arraye yerleştirin
         */
        String isim = "Yakup";
       ismiParcala(isim);
    }
    public static void ismiParcala(String isim){
        char[] arr=new char[isim.length()];
        for (int i = 0; i < isim.length(); i++) {
            arr[i]=isim.charAt(i);
        }
        System.out.println(isim+" isminin harflere parcalanmis ve array yapilmis hali: " +
                Arrays.toString(arr));
    }
}
