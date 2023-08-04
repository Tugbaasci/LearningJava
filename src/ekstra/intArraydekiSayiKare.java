package ekstra;

public class intArraydekiSayiKare {
    /*
    Verilen int bir arraydeki elementlerin karelerini alip,
    karelerinin toplamini yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        int[] sayilar = {2,3,4};
kareTopla(sayilar);
    }
    public static void kareTopla(int[] arr){
        int toplam=0;
        for (int each:arr
             ) {
            toplam+= each*each;
        }
        System.out.println(toplam);
    }
}
