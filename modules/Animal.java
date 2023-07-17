package modules;

import java.util.Date;
import java.util.ArrayList;

public abstract class Animal {
    
    protected int id;
    protected String name;
    protected Date DOB;
    protected ArrayList<String> commands;
    
    public Animal(int id, String name, Date date, ArrayList<String> commands) {
        this.id = id;
        this.name = name;
        this.DOB = date;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDate(Date DOB) {
        this.DOB = DOB;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void print_commands() {
        for (String command : commands) {
            System.out.println(command);
        }
    }

    public void add_command(String command) {
        commands.add(command);
    }
}
