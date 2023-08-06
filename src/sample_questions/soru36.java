package sample_questions;

public class soru36 {
    public static void main(String[] args) {
        /*
        Verilen bir Array dizisindeki ortadaki degeri döndüren
        bir kod/method yazın. ( Yapabilirseniz Dinamik kod yazmaya çalışın,
        Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output: 4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        Kendinizi geliştirme adına sorunun cevabını degişik
        yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */
        int inputarr[]=   {1,2,3,5,6,7};
        ortadakiSayi(inputarr);
    }
    public static void ortadakiSayi(int[] arr){
        if (arr.length%2==0){
            System.out.println("ortadaki iki sayi: "+arr[(arr.length/2)-1]+" & "+arr[arr.length/2]);
        }else {
            System.out.println("ortadaki sayi: "+arr[(arr.length-1)/2]);
        }
    }
}
