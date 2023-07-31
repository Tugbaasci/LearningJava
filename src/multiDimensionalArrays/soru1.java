package multiDimensionalArrays;

public class soru1 {
    public static void main(String[] args) {
        /*
        Verilen cift katli bir array'de bulunan cift sayilari toplayip,
        sonucu yazdiran bir method olusturun
         */
        int[][] arr = {{2,1},{3,5},{4,6},{8,9}};
        ciftleriTopla(arr);
    }
    public static void ciftleriTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Array'deki cift sayilar toplami: "
                +toplam);

    }
}
