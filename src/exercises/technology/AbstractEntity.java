package exercises.technology;

public abstract class AbstractEntity {

    private double id;

    public abstract double generateUniqueId();

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}