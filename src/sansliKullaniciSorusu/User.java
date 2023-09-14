package sansliKullaniciSorusu;

import java.time.LocalDateTime;

public class User {
    // 1- Bir user(Kullanıcı) class oluşturun
    // fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
    String name;
    LocalDateTime kayitAni;
    public User(String name, LocalDateTime kayitAni) {
        this.name = name;
        this.kayitAni = kayitAni;
    }

    public User() {
    }
}
