package exercises.technology;

public class Computer extends AbstractEntity {

    private String brand;
    private int memorySize;
    private double displaysize;
    private double weight;

    public Computer(String abrand,int amemorysize,double adisplaysize,double aweight){
        this.brand = abrand;
        this.memorySize = amemorysize;
        this.displaysize = adisplaysize;
        this.weight = aweight;
        setId(generateUniqueId());
    }
    public void addMemory(int aMemory){
        if( this.memorySize + aMemory > 64) {
            throw new IllegalArgumentException("Maximum memory size is 64 GB");
        }
        this.memorySize = this.memorySize + aMemory;
    }
    public void maxDisplaySize(double aDisplaySize){
        if(this.displaysize< 12 || this.displaysize > 27){
            throw new IllegalArgumentException("Minimum size is 12 inch and maximum size is 27 inch");
        }
        this.displaysize = this.displaysize + aDisplaySize;
    }
    public void maxWeight(double aWeight){
        if(this.weight>25){
            throw new IllegalArgumentException("Maximum weight is 25 pounds");
        }
        this.weight = this.weight + aWeight;
    }

    @Override
    public double generateUniqueId() {
        return Math.random();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public double getDisplaysize() {
        return displaysize;
    }

    public void setDisplaysize(double displaysize) {
        this.displaysize = displaysize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
