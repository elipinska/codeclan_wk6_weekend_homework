package rooms;

public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    TRIPLE(3),
    FAMILY(4);

    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
