package terminal;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import modules.Animal;
import modules.AnimalRegistry;
import modules.HomeAnimal;
import modules.PackAnimal;

public class Command {
    private String commandStr;
    private AnimalRegistry animals;
    private Schetchic c;

    public Command(String commandStr, AnimalRegistry animals, Schetchic c) {
        this.commandStr = commandStr;
        this.animals = animals;
        this.c = c;
    }

    public void commandLogic() throws IOException, NumberFormatException, ParseException {

        if (commandStr.equals("1")) {
            if (this.animals.getSizeAnimals() > 0) {
                this.animals.printAnimals();
            } else {
                System.out.println("Нет животных в реестре");
            }
        }

        if (commandStr.equals("2")) {
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.print("Тип животного (home или pack): ");
                String typeAnimal = scanner.nextLine();
                System.out.print("Название: ");
                String name = scanner.nextLine();
                System.out.print("Дата рождения (yyyy-MM-dd): ");
                String DOB = scanner.nextLine();
                System.out.print("Команды через запятую: ");
                String commandsString = scanner.nextLine();

                SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
                ArrayList<String> commands = new ArrayList<String>(Arrays.asList(commandsString.split(",")));

                if (typeAnimal.equals("home"))  {
                    System.out.print("Вес (грамм): ");
                    String weight = scanner.nextLine();

                    this.animals.addAnimal(new HomeAnimal(animals.getSizeAnimals() + 1, name, (Date) sDF.parse(DOB) , commands, Integer.parseInt(weight)));
                    this.c.add();
                    System.out.println("--------------------\nЖивотное \"" + name + "\" добавлено в реестр\n--------------------\n");
                } else if (typeAnimal.equals("pack")) {
                    System.out.print("Грузоподъемность (кг): ");
                    String load_capacity = scanner.nextLine();

                    this.animals.addAnimal(new PackAnimal(animals.getSizeAnimals() + 1, name, (Date) sDF.parse(DOB) , commands, Integer.parseInt(load_capacity)));
                    this.c.add();
                    System.out.println("--------------------\nЖивотное \"" + name + "\" добавлено в реестр\n--------------------\n");
                } else {
                    System.out.println("Неверный тип животного");
                }
                break;
            }
        }

        if (commandStr.equals("3")) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Введите ID животного: ");
                String id = scanner.nextLine();
                Animal animalSearch = animals.searchAnimal(Integer.parseInt(id));
                if (animalSearch != null) {
                    for (String command : animalSearch.getCommands()) {
                        System.out.print("<" + command + "> ");
                    }
                    System.out.println();
                } else {
                    System.out.println("ID не найден");
                }
                break;
            }
        }

        if (commandStr.equals("4")) {
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.print("Введите ID животного: ");
                String id = scanner.nextLine();
                System.out.print("Введите команду: ");
                String command = scanner.nextLine();

                Animal animalSearch = animals.searchAnimal(Integer.parseInt(id));
                if (animalSearch != null) {
                    animalSearch.add_command(command);
                } else {
                    System.out.println("ID не найден");
                }
                break;
            }
        }

        if (commandStr.equals("5")) {
            
            while (true) {
                this.c.printC();

                break;
            }
        }

    }

}
