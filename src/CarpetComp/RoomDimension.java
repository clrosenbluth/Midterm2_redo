package CarpetComp;

public class RoomDimension {
    // Data Fields
    private Double length;
    private Double width;


    // Constructor
    public RoomDimension(Double length, Double width) {
        this.setLength(length);
        this.setWidth(width);
    }


    // Getters
    public Double getLength() {
        return this.length;
    }
    public Double getWidth() {
        return this.width;
    }
    public Double getArea() {
        return (this.getLength() * this.getWidth());
    }


    // Setters
    public void setLength(Double length) {
        if (length > 0.0) {
            this.length = length;
        }
    }
    public void setWidth(Double width) {
        if (width > 0.0) {
            this.width = width;
        }
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Room Length: " + this.getLength() + "\n");
        builder.append("Room Width: " + this.getWidth() + "\n");
        builder.append("Room Area: " + this.getArea() + "\n");

        return builder.toString();
    }
}
