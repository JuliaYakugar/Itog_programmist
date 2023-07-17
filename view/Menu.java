package view;

public class Menu {

    public void menuPrint() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("1. Показать всех животных\n" +
        "2. Добавить животное\n" +
        "3. Посмотреть список команд\n" +
        "4. Добавить команду\n" +
        "5. Счетчик\n" +
        "6. Выход\n");
    }
    
}
