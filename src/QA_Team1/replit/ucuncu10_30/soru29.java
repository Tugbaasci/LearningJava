package QA_Team1.replit.ucuncu10_30;

public class soru29 {
    public static void main(String[] args) {
         /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */
        String str="Ben javayi cok sevdim";
       terstenYazdir(str);
    }
    public static void terstenYazdir(String str){
        String[] strarr=str.split(" ");
        String tersten="";
        for (int i = strarr.length-1; i>=0; i--) {
            tersten+=strarr[i]+" ";
        }
        System.out.println(tersten);
    }
}
