package exercises;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(5);
        arrL.add(6);
        arrL.add(7);
        arrL.add(8);
        arrL.add(9);
        arrL.add(10);
/*
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = new SumOfEvenNumbers;
*/
        int sum = SumOfEvenNumbers.sumofevennumber(arrL);
        System.out.println((sum));
    }
}