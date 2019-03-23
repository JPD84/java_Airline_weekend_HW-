import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class flightTest {


  Passenger passenger;
  Flight flight;
  Plane plane;


    @Before
    public void setup() {
       passenger = new Passenger("John Denver", 2);
       plane = new Plane(PlaneType.BOEING_747);
       flight = new Flight("GLA27", "Glasgow", "06:45",plane);

    }

    @Test
    public void getDepartureTime(){
        assertEquals("06:45",flight.getDepartureTime());
    }

    @Test
    public void setDepartureTime(){
        flight.setDepartureTime("07:00");
        assertEquals("07:00", flight.getDepartureTime());

    }

    @Test
    public void getFlightNo(){
        assertEquals("GLA27", flight.getFlightNo());
    }

    @Test
    public void setFlightNo(){
        flight.setFlightNo("GLA28");
        assertEquals("GLA28",flight.getFlightNo());
    }

    @Test
    public void getDepartureAirport(){
        assertEquals("Glasgow", flight.getDepartureAirport("Glasgow"));
    }

    @Test
    public void getCapacity(){
        assertEquals(2,flight.getSeats());
    }

    @Test
    public void checkPassengerIn(){
        flight.checkPassengerIn(passenger);
        assertEquals(1, flight.passengerCount());

    }

    @Test
    public void checkHowManySeatsAvailible(){
        flight.checkPassengerIn(passenger);
        assertEquals(1,flight.availibleSeats());
    }



}
