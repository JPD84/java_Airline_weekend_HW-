import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING_747);
        passenger = new Passenger("Buddy Holly", 2);
        flight = new Flight("GLA28", "Glasgow", "Barcelona", "07:45", plane);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void maximumBaggageWeightTest(){
        assertEquals(175000, flightManager.maximumBaggageWeight());
    }

    @Test
    public void maximumBaggageWeightPerPaxTest(){
        assertEquals(87500, flightManager.maximumBaggageWeightPerPax());
    }

    @Test
    public void currentBaggageWeightTest(){
        flight.checkPassengerIn(passenger);
        assertEquals(87500, flightManager.currentBaggageWeight());
    }

    @Test
    public void remainingPassengerWeightTest(){
        flight.checkPassengerIn(passenger);
        assertEquals(87500, flightManager.remainingBaggageWeight());
    }

}
