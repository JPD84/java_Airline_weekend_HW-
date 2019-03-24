public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int maximumBaggageWeight() {
        int maxBagWeight = flight.getPlane().getPlaneWeight() / 2;
        return maxBagWeight;
    }

    public int maximumBaggageWeightPerPax() {
        return maximumBaggageWeight() / flight.getPlane().getPlaneCapacity();
    }

    public int currentBaggageWeight() {
        return flight.getNumberOfPassengers() * maximumBaggageWeightPerPax();
    }

    public int remainingBaggageWeight() {
        return maximumBaggageWeight() - currentBaggageWeight();
    }

}