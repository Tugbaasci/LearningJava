package javaPractice;

public class kitapConstructor {
    String kitapAdi ;
    String yazar;
    int yil;

    kitapConstructor(String kitapAdi,String yazar,int yil){
        this.kitapAdi=kitapAdi;
        this.yazar=yazar;
        this.yil=yil;
    }

    @Override
    public String toString() {
        return  "Kitap Adi: '" + kitapAdi + '\'' +
                ", Yazar: '" + yazar + '\'' +
                ", Yayim yili: " + yil
                ;
    }

    public static void main(String[] args) {
        // Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
        // Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
        // Örnek çıktı:
        // Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)
        kitapConstructor obj = new kitapConstructor("Hayvan Ciftligi","George Orwell",1978);
        kitapConstructor obj1 = new kitapConstructor("Java Programlama","Ahmet Bulutluoz",2021);
        System.out.println(obj+"\n"+obj1);

    }

}
