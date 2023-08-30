package QA_Team120.replit.ikinci10_20;

public class soru18 {
     /*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
    */
     public static void main(String[] args) {
         String str="java is fun";
            sesliHarfSayisiYaz(str);
     }
     public static void sesliHarfSayisiYaz(String metin){
         int sayac=0;
         for (int i = 0; i <metin.length() ; i++) {
             char harf=metin.toLowerCase().charAt(i);
             if (harf=='a'||harf=='e'||harf=='i'||harf=='o'||harf=='u'){
                 sayac++;
             }
         }
         System.out.println("Stringdeki sesli harf sayisi: "+sayac);
     }
}
