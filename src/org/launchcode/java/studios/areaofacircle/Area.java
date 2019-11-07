package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
//            double pi = 3.14;
//        System.out.println("Area of a Circle = "+ pi * radius * radius);
            double area = Circle.getArea(radius);

            if (radius > 0) {
                System.out.println("Area Of Circle is " + area);
            }
        }else {
            System.err.println("Pls enter a valid number");
        }
    }
}
