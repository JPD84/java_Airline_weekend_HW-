import java.util.ArrayList;

public class Flight {

    ArrayList<Passenger> passengers;
    String flightNo;
    String departureAirport;
    String departureTime;
    Plane plane;
    int seats;


    public Flight(String flightNo, String departureAirport, String departureTime, Plane plane){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }


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
}
