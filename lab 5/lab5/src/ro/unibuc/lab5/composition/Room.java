package ro.unibuc.lab5.composition;

public class Room {

    private String type;
    private int number;

    public Room(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPriceByRoomType() {
        switch (this.type.toUpperCase()) {
            case "SINGLE":
                return 1000;
            case "DOUBLE":
                return 1200;
            case "DELUXE":
                return 1400;
            default:
                return 1250;
        }
    }
}
