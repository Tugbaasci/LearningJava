package arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isimListesiMetodu {
    public static void main(String[] args) {
         /*
        Kullanicidan istedigi kadar isim alip,
        Q'ya bastiginda girdigi isimleri bize liste
        olarak dondurecek bir method olusturun
         */
        System.out.println(isimListesiOlustur());

    }
    public static List<String> isimListesiOlustur(){
        Scanner scanner;
        String girilenIsim;
        List<String> isimListesi= new ArrayList<>();
        do {
            scanner=new Scanner(System.in);
            System.out.println("lütfen listeye eklemek istediginiz" +
                    "isimleri giriniz\nBitirmek icin Q'ya basiniz");
            girilenIsim = scanner.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimListesi.add(girilenIsim);
            }
        }while(!girilenIsim.equalsIgnoreCase("q"));
        return isimListesi;
    }
}
