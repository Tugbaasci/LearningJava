package javaPractice;

public class product {
    // Bir "Product" sınıfı oluşturun ve
    // bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve
// stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display"
// adında bir metodu çağırarak
// ürün bilgilerini ekrana yazdırın.
// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet
    String urunAdi;
    double fiyat;
    int stok;
    product(String urunAdi,double fiyat,int stok){
        this.urunAdi=urunAdi;
        this.fiyat=fiyat;
        this.stok=stok;
        display();
    }

    public static void main(String[] args) {
       product obj1=new product("Lenovo",7000,30);
       product obj2=new product("Acer",10000,20);
       product obj3=new product("Philips",5000,4);


    }
    public void display(){
        System.out.println("Urun adi: "+urunAdi+"\nFiyat: "+fiyat+
                "\nStok: "+ stok);
    }
}
