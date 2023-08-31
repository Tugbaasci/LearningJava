package sample_questions.otuzBir_44;

public class soru34 {
    public static void main(String[] args) {
        /*
        Bir String'i parametre olarak kabul eden ve
        verilen dizede Stringde bulunan rakamların toplamını yazdıran
        bir Method yazın.

       Örnek
       String str : ade1r4d3
       Int toplam : 8
       İpucu : Character.isDigit() kullanarak Digitleri alabilir
       sonra bunları Arraye atabilirsiniz.
       Ardından loop yardımı ile Integer.valueOf() kullanarak
       toplama yapabilirsiniz
       */
        String str = "ade1r4d3";
        KarisikArraydenToplama(str);
    }
    public static void KarisikArraydenToplama(String str){

        String dijital ="";
        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                dijital+=str.charAt(i);
            }
        }
        String[] arr=dijital.split("");
        for (int i = 0; i < arr.length; i++) {
            toplam+=Integer.valueOf(arr[i]);
        }
        System.out.println("String'deki sayilar toplami: "+toplam);
    }
}
