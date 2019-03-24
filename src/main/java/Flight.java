import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String departureAirport;
    private String destination;
    private String departureTime;
    private Plane plane;


    public Flight(String flightNo, String departureAirport, String destination, String departureTime, Plane plane){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

//    public Flight(String gla27, String glasgow, String s, Plane plane) {
//    }


    public String getDepartureTime(){
        return departureTime;
    }

    public void setDepartureTime(String time){
        this.departureTime = time;
    }

    public String getFlightNo(){
        return flightNo;

    }

    public void setFlightNo(String flightNo){
        this.flightNo = flightNo;
    }

    public String getDepartureAirport(String name){
        return departureAirport;
    }

    public int getSeats(){
        return this.plane.getCapacity();
    }

    public String getDestination(){
        return destination;
    }

    public void checkPassengerIn(Passenger passenger) {
        if(getSeats()>passengerCount()){
            this.passengers.add(passenger);
        }

    }

    public int passengerCount() {
        return this.passengers.size();
    }


    public int availibleSeats() {
        return getSeats() - passengerCount();

    }

    public Plane getPlane(){
        return plane;
    }

    public int getNumberOfPassengers(){
        return passengers.size();
    }
    }

//    public int getBaggageAllowancePerPassenger() {
//        return noOfBags() * baggageAllowancePerPassenger();
//    }

