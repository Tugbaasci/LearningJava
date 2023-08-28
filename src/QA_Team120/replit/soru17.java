package QA_Team120.replit;

public class soru17 {
     /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
     public static void main(String[] args) {
         int sayi1=12;
         int sayi2=24;
         int sayi3=34;
         System.out.println(kucukSayiyiBul(sayi1, sayi2, sayi3));
     }
     public static int kucukSayiyiBul(int sayi1,int sayi2,int sayi3){
         int enKucuk=sayi1;
         if (sayi2<enKucuk){
             enKucuk=sayi2;
         }else if(sayi3<enKucuk){
             enKucuk=sayi3;
         }return enKucuk;
     }
}
