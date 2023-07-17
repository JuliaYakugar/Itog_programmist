package modules;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PackAnimal extends Animal{

    private int load_capacity;

    public PackAnimal(int id, String name, Date DOB, ArrayList<String> commands, int load_capacity) {
        super(id, name, DOB, commands);
        this.load_capacity = load_capacity;
    }

    public int getWeight() {
        return load_capacity;
    }

    public void setWeight(int load_capacity) {
        this.load_capacity = load_capacity;
    }

    @Override
    public String toString() {
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");

        return "Pack animal: " + id + ". " + name + ", " + sDF.format(DOB) + ", " + load_capacity;
    }

}

