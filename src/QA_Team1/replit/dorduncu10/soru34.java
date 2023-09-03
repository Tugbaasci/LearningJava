package QA_Team1.replit.dorduncu10;

public class soru34 {
    public static void main(String[] args) {
         /*34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */
        String[] arr={"Tomato","Potato","Pair"};
        System.out.println(dortHarfliBul(arr));
    }
    public static String dortHarfliBul(String[] arr){
        String dortHarfli="";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length(); j++) {
                if (arr[i].length() == 4) {
                    dortHarfli = arr[i];
                }
            }
        }return dortHarfli;
    }

}
