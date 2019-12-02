package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield",12);
        garfield.eat();
        System.out.println(garfield.isTired());
//        System.out.println(garfield.getFamily());
        HouseCat mittens = new HouseCat("Mittens", 50);
        System.out.println(mittens.getWeight());
        HouseCat spikes = new HouseCat("spikes");
        System.out.println(spikes.getWeight());

        Cat plaincat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("cheshire",12);
//        System.out.println(plaincat.noise());
        System.out.println(cheshireCat.noise());
    }

}
