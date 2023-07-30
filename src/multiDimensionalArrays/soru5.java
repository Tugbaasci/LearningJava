package multiDimensionalArrays;

public class soru5 {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir array'de her bir inner array'in
        son elementlerinin toplamini yazdiran bir
        method olusturun
         */
        int [][] sayilar ={{3,4,5},{1,4},{5,2,7},{1,9,0,3}};
        sonElementlerTopla(sayilar);

    }
    public static void sonElementlerTopla(int[][] array){
        int toplam=0;
        for (int i = 0; i < array.length ; i++) {
            toplam+= array[i][array[i].length-1];
        }
        System.out.println(toplam);
    }
}
