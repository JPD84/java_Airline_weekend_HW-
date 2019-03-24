import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger;
    Plane plane;
    Flight flight;
    FlightManager flightManager;
//    NoOfBags noOfBags;

    @Before
    public void setup(){
        passenger = new Passenger("Buddy Holly", 2);
        plane = new Plane(PlaneType.BOEING_747);
        flight = new Flight("GLA28", "Glasgow", "07:45", plane);
//        noOfBags = new NoOfBags();

    }

//    @Test
//    public void getBaggageAllowancePerPassenger(){
//        assertEquals(20,flightManager.getBaggageAllowancePerPassenger());
//
//    }



}
