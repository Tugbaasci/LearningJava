package sample_questions.otuzBir_44;

import java.util.Arrays;

public class soru33 {
    public static void main(String[] args) {
        /*
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak
        son karakterden başlayıp tersten yazdırın
         */
        String str = "Kodlama Harika.";
        System.out.println(Arrays.toString(str.split(" ")));
        String [] str1 = str.split("");
        System.out.println(Arrays.toString(str1));
        String[] str2 = new String[str1.length];
        for (int i = str1.length-1; i >=0; i--) {
            str2[i]=str1[str1.length-1-i];
        }
        System.out.println(Arrays.toString(str2));
    }
}
