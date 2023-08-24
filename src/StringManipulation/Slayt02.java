package StringManipulation;

import java.util.Scanner;

public class Slayt02 {
    public static void main(String[] args) {
        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin
        //input1 : "15.30 ¢, input 2 :"11.40 ¢" output : 26.70 ¢
          /*
        Regex (Regular Expressions)
            \\s : space	 	\\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits		\\D : digit olmayan hersey
            \\w : harf veya rakam	\\W : harf veya rakam olmayan hersey

         */
        //Burdaki input: 13.20 $ seklinde olunca calisir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen fiyatlari giriniz");
        String fiyat1 = scan.nextLine();
        String fiyat2 = scan.nextLine();

        String yfiyat1=fiyat1.substring(0,fiyat1.length()-1);
        String duzenlenmis1=yfiyat1.replace(".","");
        duzenlenmis1=duzenlenmis1.replace(" ","");

        String yfiyat2=fiyat2.substring(0,fiyat2.length()-1);
        String duzenlenmis2=yfiyat2.replace(".","");
        duzenlenmis2=duzenlenmis2.replace(" ","");

        Double top= Double.parseDouble(duzenlenmis1)+Double.parseDouble(duzenlenmis2);

        System.out.println(top/100+" $");
    }
}
