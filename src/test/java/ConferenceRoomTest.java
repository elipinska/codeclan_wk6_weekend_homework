import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(20, "Rainy Hall", 50.00);
        guest1 = new Guest("Ewa", 300.45);
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(20, conferenceRoom1.getCapacity());
    }

    @Test
    public void conferenceRoomHasEmptyGuestList() {
        assertEquals(0, conferenceRoom1.getGuestList().size());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getGuestList().size());
        assertEquals("Ewa", conferenceRoom1.getGuestList().get(0).getName());
        assertEquals(300.45, conferenceRoom1.getGuestList().get(0).getWallet(), 0.01);

    }

    @Test
    public void removeGuest() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getGuestList().size());
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.getGuestList().size());
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Rainy Hall", conferenceRoom1.getName());
    }

    @Test
    public void conferenceRoomHasDailyRate() {
        assertEquals(50.00, conferenceRoom1.getDailyRate(), 0.1);
    }

}
