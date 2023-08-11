package javaPractice;

public class ücgenHarfSema {
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
     */
    public static void main(String[] args) {
        int harf =65;
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+j)+" ");
            }
            System.out.println("");

        }
    }
}
