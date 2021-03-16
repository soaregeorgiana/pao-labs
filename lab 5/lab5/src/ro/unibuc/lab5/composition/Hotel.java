package ro.unibuc.lab5.composition;

/**
 * Composition
 * - represents a restricted form of Aggregation in which two entities
 * are highly dependent on each other
 * - represents part-of relationship
 * When there is a composition between two entities,
 * the composite object cannot exist without the other entity
 */
public class Hotel {

    private String name;
    private double totalPrice;
    private Room[] rooms;
    private int index;

    public Hotel(String name, int noOfRooms) {
        this.name = name;
        this.rooms = new Room[noOfRooms];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addRoom(String type, int number) {
        if (this.index < this.rooms.length) {
            this.rooms[index++] = new Room(type, number);
        }
    }

    public double computePrice() {
        for (int i = 0; i < this.rooms.length; i++) {
            this.totalPrice += this.rooms[i].getPriceByRoomType();
        }
        return this.totalPrice;
    }
}
