import java.util.ArrayList;

public class Passenger {


    public String name;
    public int noOfBags;

    public Passenger(String name, int noOfBags){
        this.name = name;
        this.noOfBags = noOfBags;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
