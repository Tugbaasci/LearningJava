package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru23 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve
        bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin.
        Methodun içinde For Loop ile faktöriyelini hesaplayın
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen faktoryeli alinacak olan sayiyi giriniz:");
        int sayi = scanner.nextInt();
        faktoryel(sayi);
    }
    public static void faktoryel(int sayi){
        int carpim=1;
        String crp ="";
        for (int i = sayi; i >=2 ; i--) {
            crp+=i+"x";
            carpim*=i;
        }
        System.out.println(sayi+"!="+crp+"1="+carpim);
    }
}
