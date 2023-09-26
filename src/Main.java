import entity.Princess;
import logic.Command;
import logic.FileReader;
import logic.ReadChar;

import java.util.HashSet;
import java.util.LinkedHashSet;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        чтение файла и создание коллекции при запуске программы

        FileReader reader = new FileReader();
        LinkedHashSet<Princess> people = new LinkedHashSet<Princess>();
        people=reader.readchar();

//        создание меню и передача коллекции объектов

        Command command = new Command();
        command.menu(people);

    }

}
