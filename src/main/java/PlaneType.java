public enum PlaneType {

    BOEING_747(2, 350000,40);
//    BOEING_737(250, 325000);

    private final int capacity;
    private final int weight;
    private final int baggageAllowance;


    PlaneType(int capacity, int weight, int baggageAllowance){
        this.capacity = capacity;
        this.weight = weight;
        this.baggageAllowance = baggageAllowance;
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
