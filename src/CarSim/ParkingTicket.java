package CarSim;

public class ParkingTicket {
    // Data Fields
    private ParkedCar parkedCar;
    private PoliceOfficer policeOfficer;
    private Integer fine;


    // Constructor
    // This is only used by the PoliceOfficer class. It takes a ParkedCar object and the information from the officer
    // writing the ticket
    public ParkingTicket(ParkedCar parkedCar, String firstName, String lastName, Integer badgeNumber) {
        this.setParkedCar(parkedCar);
        this.setPoliceOfficer(firstName, lastName, badgeNumber);
    }


    // Setters
    public void setParkedCar(ParkedCar parkedCar) {
        this.parkedCar = parkedCar;
    }
    public void setPoliceOfficer(String firstName, String lastName, Integer badgeNumber) {
        this.policeOfficer = new PoliceOfficer(firstName, lastName, badgeNumber);
    }
    public void setFine(Integer illegalMinutes) {
        // Calculate the fine and set it
        Integer fine = 0;

        // use integer division to separate out the number of full illegal hours
        Integer hours = illegalMinutes / 60;
        // get remaining minutes
        Integer minutes = illegalMinutes - (hours * 60);

        // Calculate fine from hours
        if (hours > 0) {
            // add $25 for first hour
            fine += 25;

            // add $10 for each subsequent hour
            fine += 10 * (hours - 1);

            // add $10 for any remaining hour portion
            if (minutes > 0) {
                fine += 10;
            }
        }

        else if (minutes > 0) {
            // if the time does not yet exceed 1 hour, the ticket must be only $25
            fine += 25;
        }

        // if neither of these conditions have been met, the fine is 0 (which is already set)
        this.fine = fine;
    }


    // Getters
    public ParkedCar getParkedCar() {
        return parkedCar;
    }
    public PoliceOfficer getPoliceOfficer() {
        return policeOfficer;
    }
    public Integer getFine() {
        return fine;
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Parking Ticket\n");
        builder.append("---------------\n");
        builder.append(this.getParkedCar());
        builder.append(this.getPoliceOfficer());
        builder.append("Fine owed: $" + this.getFine() + "\n");

        return builder.toString();
    }
}
