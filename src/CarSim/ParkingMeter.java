package CarSim;

public class ParkingMeter {
    // Data Fields
    private Integer minutesPurchased;


    // Constructor
    public ParkingMeter(Integer minutesPurchased) {
        this.setMinutesPurchased(minutesPurchased);
    }


    // Getters
    public Integer getMinutesPurchased() {
        return this.minutesPurchased;
    }


    // Setters
    public void setMinutesPurchased(Integer minutesPurchased) {
        if (minutesPurchased > 0) {
            this.minutesPurchased = minutesPurchased;
        }
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Meter Minutes Purchased: " + this.getMinutesPurchased() + "\n");

        return builder.toString();
    }
}
