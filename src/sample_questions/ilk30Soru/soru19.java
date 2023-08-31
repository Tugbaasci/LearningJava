package sample_questions.ilk30Soru;

import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan doğum tarihini alınız.
        Burcunu hesaplayan bir method yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dogum tarihinizin ay kismini sayisal olarak giriniz");
        int ay = scanner.nextInt();
        System.out.println("Lütfen dogum tarihinizin gün kismini sayisal olarak giriniz");
        int gun = scanner.nextInt();
        burc(ay,gun);
    }
    public static void burc(int ay, int gun){
        if (ay<=0||ay>12){
            System.out.println("Hatali ay girisi yapildi");
        } else if (gun<=0||gun>31) {
            System.out.println("Hatali gun girisi yapildi");
        }else{
            if ((ay==12&&gun>=22)||(ay==1&&gun<=19)){
                System.out.println("Burcunuz oglak");
            }else if ((ay==1&&gun>=20)||(ay==2&&gun<=18)){
                System.out.println("Burcunuz kova");
            } else if((ay==2&&gun>=19)||(ay==3&&gun<=20)){
                System.out.println("Burcunuz balik");
            } else if((ay==3&&gun>=21)||(ay==4&&gun<=19)){
                System.out.println("Burcunuz koc");
            } else if((ay==4&&gun>=20)||(ay==5&&gun<=20)){
                System.out.println("Burcunuz boga");
            } else if((ay==5&&gun>=21)||(ay==6&&gun<=21)){
                System.out.println("Burcunuz ikizler");
            } else if ((ay==5&&gun>=22)||(ay==7&&gun<=22)){
                System.out.println("Burcunuz yengec");
            } else if((ay==7&&gun>=23)||(ay==8&&gun<=22)){
                System.out.println("Burcunuz aslan");
            } else if ((ay==8&&gun>=23)||(ay==9&&gun<=22)){
                System.out.println("Burcunuz basak");
            } else if ((ay==9&&gun>=23)||(ay==10&&gun<=22)){
                System.out.println("Burcunuz terazi");
            } else if ((ay==10&&gun>=23)||(ay==11&&gun<=21)){
                System.out.println("Burcunuz akrep");
            } else if ((ay==11&&gun>=22)||(ay==12&&gun<=21)){
                System.out.println("Burcunuz yay");
            }else {
                System.out.println("hatali giris ");
            }
        }

    }
}
