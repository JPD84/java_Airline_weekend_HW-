public enum PlaneType {

    BOEING_747(2, 350000);
//    BOEING_737(250, 325000);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight(){
        return weight;
    }



}
