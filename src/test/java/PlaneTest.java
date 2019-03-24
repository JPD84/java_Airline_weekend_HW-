import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


    Plane plane;
    Passenger passenger;


    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING_747);
//        plane = new Plane(PlaneType.BOEING_737);
        passenger = new Passenger("Jim Beam", 2);
    }

    @Test
    public void getCapacity() {
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void getWeight(){
        assertEquals(350000, plane.getWeight());
    }

    @Test
    public void getBaggageAllowance(){
        assertEquals(40, plane.getBaggageAllowance());
    }

}
