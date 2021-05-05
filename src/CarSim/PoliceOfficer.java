package CarSim;

public class PoliceOfficer {
    // Data Fields
    private String firstName;
    private String lastName;
    private Integer badgeNumber;


    // Constructor
    public PoliceOfficer(String firstName, String lastName, Integer badgeNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBadgeNumber(badgeNumber);
    }


    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Integer getBadgeNumber() {
        return this.badgeNumber;
    }


    // Setters
    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }
    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }
    public void setBadgeNumber(Integer badgeNumber) {
        if ((badgeNumber >= 10000) && (badgeNumber < 100000)) {
            // Validation makes sure that the badge number is within the proper range
            this.badgeNumber = badgeNumber;
        }
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Officer Name: " + this.getFirstName() + " " + this.getLastName() + "\n");
        builder.append("Officer Badge Number: " + this.getBadgeNumber() + "\n");

        return builder.toString();
    }


    // Other Methods
    public Boolean checkIfExpired(Object car, Object meter) {
        Boolean expired = false;

        // Validate the two objects given as arguments
        if ((car instanceof ParkedCar) && (meter instanceof ParkingMeter)) {
            ParkedCar parkedCar = (ParkedCar) car;
            ParkingMeter parkingMeter = (ParkingMeter) meter;

            // Check if the car is parked illegally
            if (parkedCar.getMinutesParked() > parkingMeter.getMinutesPurchased()) {
                expired = true;
            }
        }

        return expired;
    }

    public Integer calculateIllegalMinutes(Object car, Object meter) {
        Integer minutes = 0;

        if ((car instanceof ParkedCar) && (meter instanceof ParkingMeter)) {
            // Make sure that the proper objects are passed
            ParkedCar parkedCar = (ParkedCar) car;
            ParkingMeter parkingMeter = (ParkingMeter) meter;

            // make sure that illegal minutes exist
            if (parkedCar.getMinutesParked() > parkingMeter.getMinutesPurchased()) {
                // calculate illegal minutes
                minutes += (parkedCar.getMinutesParked() - parkingMeter.getMinutesPurchased());
            }
        }

        return minutes;
    }

    public ParkingTicket issueTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        // create the ticket
        ParkingTicket parkingTicket = new ParkingTicket(parkedCar, this.getFirstName(), this.getLastName(),
                this.getBadgeNumber());

        // calculate the illegal minutes and set the fine (within the ticket class)
        parkingTicket.setFine(this.calculateIllegalMinutes(parkedCar, parkingMeter));

        return parkingTicket;
    }
}
