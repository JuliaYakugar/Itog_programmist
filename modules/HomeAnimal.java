package modules;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class HomeAnimal extends Animal{

    private int weight;

    public HomeAnimal(int id, String name, Date DOB, ArrayList<String> commands, int weight) {
        super(id, name, DOB, commands);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");

        return "Home animal: " + id + ". " + name + ", " + sDF.format(DOB) + ", " + weight;
    }

}
