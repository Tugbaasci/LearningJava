package sample_questions;

public class soru41 {
    public static void main(String[] args) {
        /*
        Parametre olarak birden fazla tamsayı (integer) kabul eden
        ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

        toplam(1,2,3) çıktı =6
	    toplam(1,2,3,4,5) çıktı =15
	    sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım
         */
        toplamaVarargs(1,2,3,4,5,6,7,8,9);
    }
    public static void toplamaVarargs(int... sayi){
        int toplam=0;
        for (int i = 0; i < sayi.length ; i++) {
            toplam+=sayi[i];
        }
        System.out.println("verilen sayilarin toplami: "+ toplam);
    }
}
