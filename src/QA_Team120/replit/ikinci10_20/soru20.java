package QA_Team120.replit.ikinci10_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class soru20 {
     /*20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    */
     public static void main(String[] args) {
         String[] strArr={"C Programming", "C#", "C++", "Java", "PHP", "Python"};
         int[] liste = {1232, 1134, 2345, 1022};//Dizi'mizi oluşturuyoruz

         for (int i = 0; i < liste.length - 1; i++) { //Dizimizin değerlerini sırası ile alıyoruz

             int sayi = liste[i]; //sıradaki değeri sayi değişkenine atıyoruz
             System.out.println("int sayi "+sayi);
             int temp = i; //sayi 'nin indeksini temp değerine atıyoruz
             System.out.println("en bastaki temp "+temp);

             for (int j = i + 1; j < liste.length; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                 if (liste[j] < sayi) { //sayi değişkeninden küçük sayı var mı
                     sayi = liste[j]; //varsa sayi değişkenimizide değiştiriyoruz
                     System.out.println("for icindeki if'in sayi degeri "+sayi);
                     temp = j; //indeks değerinide değiştiriyoruz
                     System.out.println("for if 'in icindeki temp "+temp);
                 }
             }

             if (temp != i) { //temp değeri başlangıç değeri ile aynı değil ise ,
                 //yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                 liste[temp] = liste[i];
                 System.out.println("temp le liste karsilastrima "+temp);
                 liste[i] = sayi;
                 System.out.println("liste[i] "+liste[i]);
             }


         }

         for (int sayi : liste) {
             //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
             System.out.print(sayi + " ");


         }
         System.out.println("-----------------------------------------");
         int[] sayiliste = {1232, 1134, 2345, 1022};

         String[] progliste = {"C++","C Programming","C#","Python", "Java","PHP"};
         List<Integer> sayilar=new ArrayList<>();
         sayilar.add(1230);
         sayilar.add(3450);
         sayilar.add(5379);
         Collections.sort(sayilar);
         System.out.println(sayilar);

         sirala();
     }
    public static void sirala(){
        int[] list={1232, 1134, 2345, 1022};
        String[] progliste = {"C++","C Programming","C#","Python", "Java","PHP"};
        Arrays.sort(progliste);
        Arrays.sort(list);
        System.out.println("String arrayi: "+Arrays.toString(progliste)+"\nInteger Arrayi: "+Arrays.toString(list));
    }
}
