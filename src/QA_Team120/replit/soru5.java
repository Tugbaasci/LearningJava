package QA_Team120.replit;

public class soru5 {
    public static void main(String[] args) {
        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *

         */
        kisaYol(7);
          }
        private static void kisaYol(int uznluk) {
            int count = 1;
            for (int i = 1; i <= uznluk * 2 - 1; i++) {//hem ust ucgen hem alt ucgen var o yuzden "uznluk*2-1" bu sekilde belirleedik.7 ustte 6 altta =>7+6=13
                for (int j = count; j <= uznluk; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= count * 2 - 1; k++) {
                    System.out.print("*");
                }
                if (i < uznluk) {// ust ucgen
                    count++;
                } else count--;
                System.out.println();
            }
        }
    }
