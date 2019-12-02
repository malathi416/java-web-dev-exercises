package exercises;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static int sumofevennumber(ArrayList<Integer> arrL){
        int sum = 0;
        for(int i = 0;i < 10; i++) {
            if (arrL.get(i) % 2 == 0) {
                sum = sum + arrL.get(i);
            }
        }
        return sum;
    }
}
