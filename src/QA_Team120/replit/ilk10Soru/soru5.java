package QA_Team120.replit.ilk10Soru;

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
        int uzunluk=7;
        int count=1;
        for (int i = 1; i <=uzunluk*2-1 ; i++) {
            for (int j = count; j <=uzunluk ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=count*2-1 ; j++) {
                System.out.print("*");
            }
            if (i<uzunluk){
                count++;
            }else count--;
            System.out.println();
        }

    }
}
