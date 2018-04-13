package rooms;

import people.Guest;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public void checkIn(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public ArrayList<Guest> getGuestsInRoom(Room room) {
        return room.getGuestList();
    }
}
