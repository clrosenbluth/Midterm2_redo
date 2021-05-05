package CarSim;

public class ParkedCar {
    // Data Fields
    private String make;
    private String model;
    private String color;
    private String license;
    private Integer minutesParked;


    // Constructor
    public ParkedCar(String make, String model, String color, String license, Integer minutesParked) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setLicense(license);
        this.setMinutesParked(minutesParked);
    }


    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getLicense() {
        return license;
    }
    public Integer getMinutesParked() {
        return minutesParked;
    }


    // Setters
    public void setMake(String make) {
        if (make != null) {
            this.make = make;
        }
    }
    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }
    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }
    public void setLicense(String license) {
        if (license != null) {
            this.license = license;
        }
    }
    public void setMinutesParked(Integer minutesParked) {
        if (minutesParked >= 0) {
            this.minutesParked = minutesParked;
        }
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Car Make: " + this.getMake() + "\n");
        builder.append("Car Model: " + this.getModel() + "\n");
        builder.append("Car Color: " + this.getColor() + "\n");
        builder.append("Car License: " + this.getLicense() + "\n");
        builder.append("Minutes Parked: " + this.getMinutesParked() + "\n");

        return builder.toString();
    }
}
