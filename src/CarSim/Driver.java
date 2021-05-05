package CarSim;

public class Driver {
    public static void main(String[] args) {
        ParkedCar[] cars = new ParkedCar[4];
        cars[0] = new ParkedCar("Toyota", "RAV4", "Ruby Flare Pearl", "KED9205", 104);
        cars[1] = new ParkedCar("Porsche", "Panamera", "Mamba Green Metallic", "ATT752", 45);
        cars[2] = new ParkedCar("BMW", "Z4", "Mediterranean Blue", "EEV2967", 260);
        cars[3] = new ParkedCar("Kia", "Forte", "Currant Red", "KGW4347", 125);

        ParkingMeter[] meters = new ParkingMeter[4];
        meters[0] = new ParkingMeter(60);
        meters[1] = new ParkingMeter(90);
        meters[2] = new ParkingMeter(60);
        meters[3] = new ParkingMeter(120);

        PoliceOfficer officer = new PoliceOfficer("Max", "Goof", 57864);

        // create a list of potential tickets equal to the length of the meters array
        ParkingTicket[] tickets = new ParkingTicket[4];

        // fill the array (may not be completely full, since not all cars get tickets)
        int counter = 0;
        for (int i = 0; i < meters.length; i++) {
            if (officer.checkIfExpired(cars[i], meters[i])) {
                tickets[i] = officer.issueTicket(cars[i], meters[i]);
                counter++;
            }
        }

        
        if (counter != tickets.length)
        {
            // if there are empty spaces in the tickets array, create a full finalTickets array
            ParkingTicket[] finalTickets = new ParkingTicket[counter];

            counter = 0;
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != null) {
                    finalTickets[counter] = tickets[i];
                    counter++;
                }
            }

            // print the finalTickets array
            for (ParkingTicket ticket : finalTickets) {
                System.out.println(ticket);
            }
        }
        else
        {
            // print the filled tickets array
            for (ParkingTicket ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }

}
