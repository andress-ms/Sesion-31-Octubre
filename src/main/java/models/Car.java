package models;

public class Car extends Vehicle{
    private int numberOfDoors;
    private String color;

    public Car() {
    }

    public Car(int numberOfDoors, String color) {
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public Car(String make, String model, int year, int numberOfDoors, String color) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("numberOfDoors=").append(numberOfDoors);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
