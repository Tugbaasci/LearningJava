package sample_questions.soru45.easy;

public class soru4 {
    /*Write a method that returns the index of the first occurrence
    of given integer in a list.
    Assume that the index of the first element in the list is zero.
    If the number does not exist return -1.*/
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};
        System.out.println("Verilen array'deki sayinin index degeri: "+search(6, arr));
    }
    public static int search(Integer n, Integer[] list){
        int index=-1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)){
                index=i;
                break;
            }
        }return index;
    }
}
