package sample_questions.otuzBir_44;

import java.util.Scanner;

public class soru43coz {
    static Scanner scanner= new Scanner(System.in);
    static String okulAdi="Sevgi okulu";
    public static void main(String[] args) {
        /*
        Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
        Changename adında bir method oluşturun, parametre olarak öğrenci
        bilgileri alın ve
        methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci
        bilgilerini tekrardan yazdırın
        Changesurname adlı bir method oluşturun ,
        bu method lastname'i parametre olarak alsın.
        Methodda kullanıcıya yeni bir lastname sorulsun ve
        eski lastname degiştirilsin.
         */

        String ad= scanner.next();
        String soyad= scanner.next();
        int okulNo=12345678;
       // rename(changeName(ad),changeSurname(soyad));

    }
    soru43coz(){
        String oncekiAd="Ekin";
        String oncekiSoyad="Toprak";
    }
    public static void rename(String a,String b){
        System.out.println("Sistemdeki varolan eski isim: ");
        soru43coz obj = new soru43coz();
    }
    public static void changeName(String ad){
        System.out.println("ad parametreli cons. calisti");
        ad="Tugba";
    }
    public static void changeSurname(String soyad){
        System.out.println("soyad paraemterli cons cakisti");
        soyad="Asci";
    }
}
