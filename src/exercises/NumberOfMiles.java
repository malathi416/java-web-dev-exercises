package exercises;
import java.util.Scanner;
public class NumberOfMiles {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Miles : ");
        double miles = input.nextDouble();
        System.out.println("Enter the Gas consumed in Gallons :");
        double gasconsumed = input.nextDouble();
        System.out.println("Miles per Gallon :" + gasconsumed/miles);
    }
}
