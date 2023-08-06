package sample_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru30 {
    public static void main(String[] args) {
        /*
        Bir Stringdeki yinelenen karakterleri Array String olarak
        döndüren bir kod yazın.
       ( mülakat sorusu )
       Örnek:
       String str="Javacokkolay"
       Yinelenen karakterler : [a, o, k]
       İpucu: İçiçe for looplar, String Manupulations ve
       ifler kullanrak çözebilrsiniz.
       */
        String metin="Javacokkolay";
        char[] harf = metin.toCharArray();
        List<String> yeni= new ArrayList<>();
        for (int i = 0; i < harf.length ; i++) {
            for (int j = i+1; j < harf.length ; j++) {
                if (harf[i]==harf[j]&&!yeni.contains(String.valueOf(harf[i]))){
                    yeni.add(String.valueOf(harf[i]));
                }
            }
        }
        System.out.println(yeni);
    }
}

