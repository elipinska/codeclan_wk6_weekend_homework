import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before() {
         guest1 = new Guest("Ewa", 200.50);
    }


    @Test
    public void guestHasName() {

        assertEquals("Ewa", guest1.getName());
    }

    @Test
    public void guestHaswallet() {

        assertEquals(200.50, guest1.getWallet(), 0.01);
    }
}
