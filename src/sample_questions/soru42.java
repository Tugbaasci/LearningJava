package sample_questions;

public class soru42{
        /*
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun
        ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım.
        Nesnelerin rengini adını sayısını gönderelim
        sonra cagırıp konsolda yazdıralım
         */
        String isim="Deger Atanmamis";
        String soyad="Deger Atanmamis";
         static String renk ="deger atanmadi";
        int yas=0;
    public static void main(String[] args) {
        soru42 obj1=new soru42();
        soru42 obj2=new soru42("ali","yılmaz");
        soru42 obj3 = new soru42("tugba","asci",39);
        System.out.println(new soru42("yali", "sami"));
        System.out.println(renk);
    }
    soru42(){
        System.out.println("Parametresiz cons calisti");
    }
    soru42(String isim,String soyad){
        this.soyad=soyad;
        this.isim=isim;
        System.out.println(isim+" "+soyad);
    }
    soru42(String isim, String soyad,int yas){
        this.soyad=soyad;
        this.isim=isim;
        this.yas= yas;
        System.out.println(isim+" "+soyad+" yas: "+yas);
    }
    }

