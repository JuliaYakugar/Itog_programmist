package modules;
import java.util.ArrayList;

public class AnimalRegistry {

    private ArrayList<Animal> animals;

    public AnimalRegistry(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public AnimalRegistry() {
        this.animals = new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getSizeAnimals() {
        return this.animals.size();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void printAnimals() {
        System.out.println("Животные:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public Animal searchAnimal(int id) {
        for (Animal animal : animals) {
            if (id == animal.getId()) {
                return animal;
            }
        }
        return null;
    }
    
}
