package examples;

public class TestContinue {
    public static void main(String [] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 8;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
//                continue;
                break;
            }
            System.out.println("Not here");
        }
        System.out.println("Out of for loop");
    }
}
