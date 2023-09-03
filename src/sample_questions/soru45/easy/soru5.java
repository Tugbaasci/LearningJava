package sample_questions.soru45.easy;

public class soru5 {
    public static void main(String[] args) {
        /*
        Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.
         */
        System.out.println(reverse("uyan ey gozlerim gafletten uyan"));

    }
    public static String reverse(String s){
        String m="";
        for (int i = 0; i < s.length(); i++) {
            m+=s.charAt(s.length()-1-i);
        }return m;
    }
}
