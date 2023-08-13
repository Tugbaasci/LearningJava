package javaPractice;

public class passByValue {
    // Soru: Referans veri tiplerinin nasıl çalıştığını
    // anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini
// gösteren bir örnek yapınız.



    public static void main(String[] args) {
        StringBuilder ilkMetin = new StringBuilder("Merhaba");
        degistir(ilkMetin);
        System.out.println(ilkMetin);
    }

    public  static void degistir(StringBuilder str) {
        System.out.println("Baslangicta: "+ str);
        str.append(" Java");
        System.out.println("Metoddan sonra: "+str);
    }

}
