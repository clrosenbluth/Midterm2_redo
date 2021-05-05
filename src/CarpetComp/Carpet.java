package CarpetComp;

public class Carpet {
    // Data Fields
    private Double pricePerSquareFoot;
    private Type type;
    private String color;


    // Constructor
    public Carpet(Double pricePerSquareFoot, String type, String color) {
        this.setPricePerSquareFoot(pricePerSquareFoot);
        this.setType(type);
        this.setColor(color);
    }


    // Getters
    public Double getPricePerSquareFoot() {
        return this.pricePerSquareFoot;
    }
    public Type getType() {
        return this.type;
    }
    public String getColor() {
        return this.color;
    }


    // Setters
    public void setPricePerSquareFoot(Double pricePerSquareFoot) {
        if(pricePerSquareFoot > 0.0) {
            this.pricePerSquareFoot = pricePerSquareFoot;
        }
    }
    public void setType(String type) {
        if (type != null) {
            this.type = Type.valueOf(type);
        }
    }
    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Carpet price per square foot: $%.2f\n", this.getPricePerSquareFoot()));
        builder.append("Carpet type: " + this.getType() + "\n");
        builder.append("Carpet color: " + this.getColor() + "\n");

        return builder.toString();
    }
}
