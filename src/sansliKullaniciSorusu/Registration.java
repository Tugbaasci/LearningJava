package sansliKullaniciSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
     /*
     2- Registration(Kayıt) isminde bir class oluşturun ve
     register()(kayıtAl()) isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.

     3- Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
     */
    ArrayList<User> kullanicilar=new ArrayList<>();
    ArrayList<User> register(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String name= scanner.nextLine();
        LocalDateTime zaman=LocalDateTime.now();
        User kullanici=new User(name,zaman);
        kullanicilar.add(kullanici);
        return kullanicilar;
    }
    void happyUsers(ArrayList<User> list){
        for (User each:list) {
            if (each.kayitAni.getSecond()<=10){
                System.out.println(each.name+" bravo, sansli kullanici....");
            }else {
                System.out.println(each.name+" bu sefer olmadi, bi dahaki sefere...");
            }
        }
    }
    void kayitlariListele(ArrayList<User> list){
        for (User each:list) {
            System.out.println("isim: "+each.name+" kayit zamani: "+each.kayitAni);
        }
    }

}
