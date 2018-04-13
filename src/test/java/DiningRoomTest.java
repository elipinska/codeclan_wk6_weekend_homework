import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom1;
    private Guest guest1;

    @Before
    public void before() {
        diningRoom1 = new DiningRoom(20);
        guest1 = new Guest("Ewa", 300.45);
    }

    @Test
    public void diningRoomHasCapacity() {
        assertEquals(20, diningRoom1.getCapacity());
    }

    @Test
    public void diningRoomHasEmptyGuestList() {
        assertEquals(0, diningRoom1.getGuestList().size());
    }

    @Test
    public void canAddGuest() {
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.getGuestList().size());
        assertEquals("Ewa", diningRoom1.getGuestList().get(0).getName());
        assertEquals(300.45, diningRoom1.getGuestList().get(0).getWallet(), 0.01);

    }

    @Test
    public void removeGuest() {
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.getGuestList().size());
        diningRoom1.removeGuest(guest1);
        assertEquals(0, diningRoom1.getGuestList().size());
    }

}
