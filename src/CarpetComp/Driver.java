package CarpetComp;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // create 4 carpet objects
        Carpet carpets[] = new Carpet[4];
        carpets[0] = new Carpet(2.59, "Plush", "Red");
        carpets[1] = new Carpet(2.00, "Shag", "Yellow");
        carpets[2] = new Carpet(4.34, "Velvet","Green");
        carpets[3] = new Carpet(3.84, "Pattern","Blue");

        // create 3 room objects based on user input
        RoomCarpet[] roomCarpets = new RoomCarpet[3];
        fillRooms(carpets, roomCarpets, keyboard);

        // print the RoomCarpet objects
        for (RoomCarpet roomCarpet : roomCarpets) {
            System.out.println(roomCarpet);
        }
    }

    private static void fillRooms(Carpet[] carpets, RoomCarpet[] roomCarpets, Scanner keyboard) {
        // create an array of RoomDimension objects to match the RoomCarpet array
        RoomDimension[] rooms = new RoomDimension[roomCarpets.length];

        // build each object from user input
        for(int i = 0; i < roomCarpets.length; i++) {
            // get user input
            System.out.println("Please enter room length: ");
            Double length = keyboard.nextDouble();
            System.out.println("Please enter room width: ");
            Double width = keyboard.nextDouble();

            // create room
            rooms[i] = new RoomDimension(length, width);

            System.out.println("What type of carpet do you want?");
            String type = keyboard.next();

            // get the right carpet and build RoomCarpet object
            Carpet match = carpetCheck(carpets, type);

            if (match != null) {
                roomCarpets[i] = new RoomCarpet(rooms[i], match);
            }
        }
    }

    private static Carpet carpetCheck(Carpet[] carpets, String type) {
        Carpet carpetMatch = null;
        for(Carpet carpet : carpets) {
            if (type.equals(carpet.getType().toString())) {
                carpetMatch = carpet;
                break;
            }
        }
        return carpetMatch;
    }
}
