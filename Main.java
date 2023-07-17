import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import modules.AnimalRegistry;
import modules.HomeAnimal;
import terminal.TerminalReader;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
        
        AnimalRegistry animals = new AnimalRegistry();
        animals.addAnimal(new HomeAnimal(1, "cat_01", (Date)sDF.parse("2020-03-03"), new ArrayList<String>(Arrays.asList("mew", "go")) , 3200));
        animals.addAnimal(new HomeAnimal(2, "dog_01", (Date)sDF.parse("2022-10-23"), new ArrayList<String>() , 14100));
        animals.addAnimal(new HomeAnimal(3, "cat_02", (Date)sDF.parse("2019-04-21"), new ArrayList<String>() , 5250));
        animals.addAnimal(new HomeAnimal(4, "humster_01", (Date)sDF.parse("2023-01-01"), new ArrayList<String>() , 260));

        new TerminalReader(animals).runReader();
    }
}