import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.BedroomType;
import rooms.Hotel;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel1;
    private Room room1;
    private Guest guest1;

    @Before
    public void before() {
        hotel1 = new Hotel("CodeClan Towers");
        room1 = new Bedroom(2, BedroomType.DOUBLE, 40.00);
        guest1 = new Guest("James", 200.00);
    }

    @Test
    public void hotelHasName() {
        assertEquals("CodeClan Towers", hotel1.getName());
    }

    @Test
    public void hotelHasEmptyArrayListOfRooms() {
        assertEquals(0, hotel1.getRooms().size());
    }

    @Test
    public void canAddRoom() {
        hotel1.addRoom(room1);
        assertEquals(1, hotel1.getRooms().size());

    }

    @Test
    public void canRemoveRoom() {
        hotel1.addRoom(room1);
        assertEquals(1, hotel1.getRooms().size());
        hotel1.removeRoom(room1);
        assertEquals(0, hotel1.getRooms().size());
    }

    @Test
    public void canAddGuest() {
        hotel1.addRoom(room1);
        hotel1.checkIn(guest1, room1);
        assertEquals(1, room1.getGuestList().size());
    }

    @Test
    public void canCheckOutGuest() {
        hotel1.addRoom(room1);
        hotel1.checkIn(guest1, room1);
        assertEquals(1, room1.getGuestList().size());
        hotel1.checkOut(guest1, room1);
        assertEquals(0, room1.getGuestList().size());
    }

    @Test
    public void hotelCanGetGuestListForRoom() {
        hotel1.addRoom(room1);
        hotel1.checkIn(guest1, room1);
        assertEquals("James", hotel1.getGuestsInRoom(room1).get(0).getName());

    }

}
