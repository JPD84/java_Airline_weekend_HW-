import java.util.ArrayList;

public class Passenger {


    private String name;
    private Integer bags;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public int getBags() {
        return bags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
