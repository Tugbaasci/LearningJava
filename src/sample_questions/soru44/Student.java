package sample_questions.soru44;

import java.util.Scanner;

public class Student extends StudentMain {
    StudentMain std=new StudentMain();
    Student(String ad, String soyad, int yas, String okul, String cinsiyet){
        std.ad=ad;
        std.soyad=soyad;
        std.cinsiyet=cinsiyet;
        std.okul=okul;
        std.yas=yas;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ogrenci adini giriniz");
        String ad= scanner.nextLine();
        System.out.println("Lütfen ogrenci soyadini giriniz");
        String soyad= scanner.nextLine();
        System.out.println("Lütfen ogrencinin yasini giriniz");
        int yas= scanner.nextInt();
        System.out.println("Lütfen ogrencinin cinsiyetini giriniz");
        String cinsiyet=scanner.next();
        System.out.println("Lütfen ogrencinin okul adini giriniz");
        scanner.nextLine();
        String okul=scanner.nextLine();
        Student student1=new Student(ad,soyad,yas,okul,cinsiyet);
        System.out.println(student1.std);
    }
}
