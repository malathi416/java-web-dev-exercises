package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String sentence ="Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a serach word : ");
        String word = input.nextLine();
//        System.out.println(sentence.toLowerCase().contains(word.toLowerCase()));

        if(sentence.toLowerCase().contains(word.toLowerCase())){
            System.out.println("word found");
            System.out.println(sentence.indexOf(word));
            System.out.println((word.length()));
            String newsentence= sentence.replace(word,"");
            System.out.println((newsentence));
        }
        else{
            System.out.println("Word not Found");
        }

    }
}

