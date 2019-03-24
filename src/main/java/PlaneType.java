public enum PlaneType {

    BOEING_747(2, 350000,40, 20);
//    BOEING_737(250, 325000);

    private final int capacity;
    private final int weight;
    private final int baggageAllowance;
    private final int baggageAllowancePerPassenger;

    PlaneType(int capacity, int weight, int baggageAllowance, int baggageAllowancePerPassenger){
        this.capacity = capacity;
        this.weight = weight;
        this.baggageAllowance = baggageAllowance;
        this.baggageAllowancePerPassenger = baggageAllowancePerPassenger;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight(){
        return weight;
    }

    public int getBaggageAllowance() {
        return baggageAllowance;
    }

}
