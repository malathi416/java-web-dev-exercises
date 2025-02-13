package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        System.out.println("Flavours Before");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        System.out.println("Cone prices Before");
        for(Cone cone:cones){
            System.out.println(cone.getName()+ ":  "+cone.getCost());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();//create a new FlavorComparator object
        flavors.sort(comparator);//call the sort method on flavors and pass the comparator object as the argument
        System.out.println("Flavours After");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator comparator1 = new ConeComparator();
        cones.sort(comparator1);
        System.out.println("Cones price after sorting");
        for(Cone cone:cones){
            System.out.println(cone.getName()+ ":  "+cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
