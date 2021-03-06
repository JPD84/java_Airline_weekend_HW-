public class Plane {

    private PlaneType planeType;


    public Plane(PlaneType planeType){
        this.planeType = planeType;

    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }


    public int getWeight() {
        return this.planeType.getWeight();
    }

    public int getBaggageAllowance(){
        return this.planeType.getBaggageAllowance();
    }

    public Integer getPlaneWeight(){
        return planeType.getWeight();
    }

    public Integer getPlaneCapacity(){
        return planeType.getCapacity();
    }
}
