import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;

    @Before
    public void setup() {
        passenger1 = new Passenger("Jim Beam", 2);
        passenger2 = new Passenger("Captain Morgan", 3);
        passenger3 = new Passenger("Jack Daniels", 1);
        passenger4 = new Passenger("Viktor Smirnoff", 2);
        passenger5 = new Passenger("Johnnie Walker", 4);
        passenger6 = new Passenger("Scarlet Witch", 2);
        passenger7 = new Passenger("Captain Marvel", 2);
        passenger8 = new Passenger("Natalia Alianovna Romanova", 3);

    }

    @Test
    public void getNoOfBags() {
        assertEquals(3, passenger8.getNoOfBags());
    }

    @Test
    public void getPassengerName(){
        assertEquals("Captain Morgan", passenger2.getName());

    }

    @Test
    public void setName() {
        passenger2.setName("Captain Jack");
        assertEquals("Captain Jack", passenger2.getName());
    }
}
