package QA_Team120.replit;

public class soru9 {
    public static void main(String[] args) {
        /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        String str1="Java is";
        String str2="fun";
        String newStr=str1.concat(str2);
        System.out.println(str1+" ".concat(str2));
        System.out.println(str1+" "+str2);
    }
}
