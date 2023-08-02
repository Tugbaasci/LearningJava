package multiDimensionalArrays;

public class soru4 {
    public static void main(String[] args) {
        /*
        Verilen iki katli bir array'de bulunan
        tum sayilarin carpimini bize donduren
        bir metod olusturun
         */
        int [][] sayilar ={{1,2},{2,3},{3,4,5}};
        System.out.println(carpim(sayilar));

    }
    public static int carpim(int[][] arr){
        int carpim =1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }return carpim;
    }
}
