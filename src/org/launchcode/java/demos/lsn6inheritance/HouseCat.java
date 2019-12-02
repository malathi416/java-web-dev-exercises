package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }
    public HouseCat(String aname){
        this.name = aname;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
//        return "Hello, my name is " + name + "!";
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise(); // prints "Meeeeeeooooowww!"
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
