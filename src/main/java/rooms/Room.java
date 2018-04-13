package rooms;

import people.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    public void removeGuest(Guest guest) {
        guestList.remove(guest);
    }
}
