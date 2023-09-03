package sample_questions.soru45.easy;

public class soru1_2_3 {
    //Write a method that sums two numbers.
    public Integer sum(Integer i, Integer j) {
        int sum=0;
        sum=i+j;
        return sum;
    }
    //Given a number n, write a method
    // that sums all multiples of three and five up to n (inclusive)
    public Integer sum(Integer n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }return sum;
    }
    //Write a method that calculates the factorial of a given number.
    //Factorial is the product of all positive integers less than or equal to n.
    // For example, factorial(4) = 4x3x2x1 = 24.
    //TIP: To make it more interesting, try to do it recursively.
    public Integer factorial(Integer n){
        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }


    public static void main (String[]args){
        /*
        Bu kanaldaki soruları da çözmenizi istiyorum arkadaşlar.
        Sorular zorluk seviyelerine göre derecelendirilmiş.
        2 haftalık sorular mevcut burada. :blush:
        Cevaplarınızı kanala da atabilirsiniz,
        özelde de çözebilirsiniz. :slightly_smiling_face:
        https://code-exercises.com/programming/easy/
        */
        soru1_2_3 soru1 = new soru1_2_3();
        System.out.println("First Question's Solution; Sum: " + soru1.sum(3, 4));
        soru1_2_3 soru2=new soru1_2_3();
        System.out.println("Second question's answer; Sum:"+soru2.sum(10));
        soru1_2_3 soru3=new soru1_2_3();
        System.out.println("Third question's answer: " + soru3.factorial(4));

    }
}
