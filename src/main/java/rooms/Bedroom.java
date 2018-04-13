package rooms;

public class Bedroom extends Room {

    private int bedroomCapacity;
    private int roomNo;
    private BedroomType type;
    private double nightlyRate;

    public Bedroom(int roomNo, BedroomType type, double nightlyRate) {
        this.bedroomCapacity = type.getCapacity();
        this.roomNo = roomNo;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public BedroomType getType() {
        return type;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public int getCapacity() {
        return bedroomCapacity;
    }

    public int getRoomNo() {
        return roomNo;
    }
}
