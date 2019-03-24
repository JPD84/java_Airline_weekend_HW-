import java.util.ArrayList;

public class FlightManager{

    ArrayList<Passenger> passengers;
    Plane plane;
    FlightManager flightManager;
//    int baggageAllowance;
//    int baggageAllowancePerPassenger;


    public FlightManager(Plane plane, int baggageAllowance, int baggageAllowancePerPassenger){
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.BOEING_747);
//        this.flightManager = new FlightManager(40, 20);
//        this.baggageAllowancePerPassenger = new BaggageAllowancePerPassenger();
//        this.baggageAllowance = new BaggageAllowance();
    }

//    public int getBaggageAllowancePerPassenger(){
//        return baggageAllowance() - baggageAllowancePerPassenger();
//
//
//    }


}
