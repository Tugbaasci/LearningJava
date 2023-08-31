package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
     isim2= ali
	 Konsol => maalisa
       */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ilk kelimenizi giriniz: ");
        String isim1= scanner.next();
        System.out.print("Lütfen ikinci kelimenizi giriniz: ");
        String isim2= scanner.next();
        if (isim1.length()%2==0){
            String yeni = isim1.substring(0,isim1.length()/2).concat(isim2)
                    +isim1.substring(isim1.length()/2);
            System.out.println(yeni);
        }else{
            System.out.println("isim2,isim1'e eklenemez.");
        }
    }


}
