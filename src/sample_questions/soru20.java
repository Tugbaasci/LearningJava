package sample_questions;

import java.util.Scanner;

public class soru20 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin,
        İsim uzunluğu 3 olmalıdır.
        Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        yazdırın. İsim 3 karakterden uzunsa
        "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 3 harfli bir isim giriniz: ");
        String kelime = scanner.next();
        char bir = kelime.charAt(0);
        char iki = kelime.charAt(1);
        char uc = kelime.charAt(2);
        if (kelime.length()>3){
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }else{
            if (bir==iki || iki==uc || bir==uc){
                System.out.println("Dizede yinelenen karakterler var");
            }else {
                System.out.println("String benzersiz karakterlere sahip");
            }
        }
     }
}
