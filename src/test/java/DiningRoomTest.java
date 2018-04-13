import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom1;

    @Before
    public void before() {
        diningRoom1 = new DiningRoom(20);
    }

    @Test
    public void diningRoomHasCapacity() {
        assertEquals(20, diningRoom1.getCapacity());
    }

    @Test
    public void diningRoomHasEmptyGuestList() {
        assertEquals(0, diningRoom1.getGuestList().size());
    }
}
