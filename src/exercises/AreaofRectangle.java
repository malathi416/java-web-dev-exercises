package exercises;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = input.nextDouble();
        System.out.println("Enter the width:");
        double width = input.nextDouble();
        System.out.println("area of rectagle : "+ length * width);
    }
}
