package terminal;
import view.Menu;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import modules.AnimalRegistry;

public class TerminalReader {
    
    private Menu menu;
    private AnimalRegistry animals;
    private Schetchic c = new Schetchic();

    public TerminalReader(AnimalRegistry animals) {
        menu = new Menu();
        this.animals = animals;
    }

    public void runReader() throws IOException, NumberFormatException, ParseException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.menuPrint();
            System.out.print("Введите пункт меню: ");

            String input = scanner.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (input.equals("6")) break;

            Command command = new Command(input, this.animals, this.c);
            command.commandLogic();

            System.out.println("Нажмите Enter для возврата в меню!");
            scanner.nextLine();

        }
        scanner.close();
    }
    
}
