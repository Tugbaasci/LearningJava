package javaPractice;

public class dikdortgenKare_constr {
    int uzunluk;
    int genislik;
    dikdortgenKare_constr(int uzunluk,int genislik){
        this.uzunluk=uzunluk;
        this.genislik=genislik;
        display();
    }
    dikdortgenKare_constr(int kenar){
        this.uzunluk=kenar;
        this.genislik=kenar;
        display();
    }
    void display(){
        if (uzunluk==genislik){
            System.out.println("Uzunluk: "+uzunluk+" (Kare)");
        }else {
            System.out.println("uzunluk: "+uzunluk+" genislik: "+genislik);
        }
    }

    public static void main(String[] args) {
        dikdortgenKare_constr obj= new dikdortgenKare_constr(3,5);
        dikdortgenKare_constr obj1= new dikdortgenKare_constr(5);
    }
}
