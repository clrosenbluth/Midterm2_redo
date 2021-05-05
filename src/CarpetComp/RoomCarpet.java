package CarpetComp;

public class RoomCarpet {
    // Data Fields
    private RoomDimension roomDimension;
    private Carpet carpet;


    // Constructor
    public RoomCarpet(RoomDimension roomDimension, Carpet carpet) {
        this.setRoomDimension(roomDimension);
        this.setCarpet(carpet);
    }


    // Getters
    public RoomDimension getRoomDimension() {
        return this.roomDimension;
    }
    public Carpet getCarpet() {
        return this.carpet;
    }
    public Double getCost() {
        return (this.roomDimension.getArea() * this.carpet.getPricePerSquareFoot());
    }


    // Setters
    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }
    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }


    // toString
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Your Carpet Information: \n");
        builder.append(this.getRoomDimension());
        builder.append(this.getCarpet());
        builder.append(String.format("Cost: $%.2f\n", this.getCost()));

        return builder.toString();
    }
}
