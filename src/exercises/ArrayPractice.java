package exercises;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
//        int[] someInts = {1, 1, 2, 3, 5, 8};
//        for(int i : someInts){
//            if(i%2==1) {
//                System.out.println((i));
//            }
        String sentence="I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentencearray = sentence.split(" ");
//        for (String word : sentencearray)
//        System.out.println(word);
//        }
        System.out.println(Arrays.toString(sentencearray));
        String[] sentencearray1 = sentence.split(",");
        System.out.println(Arrays.toString(sentencearray1));
        String[] sentencearray2 = sentence.split("\\.");
        System.out.println(Arrays.toString(sentencearray2));
    }
}
