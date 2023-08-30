package QA_Team120.replit.ucuncu10_30;

import java.util.Scanner;

public class soru30 {
    public static void main(String[] args) {
         /*30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
    */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci binary number: ");
        String binary1 = scanner.next();

        System.out.print("İkinci binary number: ");
        String binary2 = scanner.next();

        String result = addBinary(binary1, binary2);
        System.out.println("Toplam: " + result);
    }
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }
}
