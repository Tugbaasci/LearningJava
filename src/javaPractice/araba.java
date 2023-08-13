package javaPractice;

public class araba {
    // Bir "Car" sınıfı oluşturun ve
    // bu sınıfın bir constructor'ı olsun.
// Bu constructor, marka ve model bilgilerini
// alacak şekilde tasarlanmalıdır.
// Örnek çıktı:
// Car nesnesi oluşturuldu: Ford Focus
    String marka;
    String model;
    araba(String marka,String model){
        this.marka=marka;
        this.model=model;
    }

    public static void main(String[] args) {
        araba arb= new araba("Ford","Focus");
        araba arb1= new araba("Renault","Clio");
        araba arb2= new araba("Honda","Accord");
        System.out.println("Birinci arabam: "+arb.marka+" "+arb.model+"\nIkinci arabam: "+
                arb1.marka+" "+arb1.model+"\nUcuncu arabam: "+arb2.marka+" "+arb2.model);
    }
}
