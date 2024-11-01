package models;

public class Motorbike extends Vehicle{
    private String type;
    private String cylinderCapacity;
    private String color;

    public Motorbike() {
    }

    public Motorbike(String type, String cylinderCapacity, String color) {
        this.type = type;
        this.cylinderCapacity = cylinderCapacity;
        this.color = color;
    }

    public Motorbike(String make, String model, int year, String type, String cylinderCapacity, String color) {
        super(make, model, year);
        this.type = type;
        this.cylinderCapacity = cylinderCapacity;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Motorbike{");
        sb.append("type='").append(type).append('\'');
        sb.append(", cylinderCapacity='").append(cylinderCapacity).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
