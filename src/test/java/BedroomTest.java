import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.BedroomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, BedroomType.TRIPLE, 60.00);
        guest1 = new Guest("Ewa", 300.45);
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(3, bedroom1.getCapacity());
    }

    @Test
    public void bedroomHasEmptyGuestList() {
        assertEquals(0, bedroom1.getGuestList().size());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getGuestList().size());
        assertEquals("Ewa", bedroom1.getGuestList().get(0).getName());
        assertEquals(300.45, bedroom1.getGuestList().get(0).getWallet(), 0.01);

    }

    @Test
    public void removeGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getGuestList().size());
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.getGuestList().size());
    }

    @Test
    public void bedroomHasNumber() {
        assertEquals(1, bedroom1.getRoomNo());
    }

    @Test
    public void bedroomHasType() {
        assertEquals(BedroomType.TRIPLE, bedroom1.getType());
    }

    @Test
    public void bedroomHasNightlyRate() {
        assertEquals(60.00, bedroom1.getNightlyRate(), 0.01);
    }

}
