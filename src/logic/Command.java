package logic;

import entity.Princess;

import java.util.*;

public class Command implements Menu{
     private String add="add";
     private String list="list";
     private String update="update";
     private String delete="delete";
     private String exit="exit";
     private String get="get";


    public void menu(LinkedHashSet<Princess> people) {
        boolean enter = true;
        String command;

        System.out.println("Программа успешно запущена");
        Scanner scan = new Scanner(System.in);


        while (enter==true){


                System.out.println(" Введите одну из команд\n" +
                        "  1.list - вывод всех сохраненных данных в удобно-читаемом формате\n " +
                        " 2.add - добавление новой записи\n" +
                        "  3.update - обновление записи\n " +
                        " 4.delete - удаление записи\n"+
                        "  5.get - вывод по id\n"+
                        "  6.exit - выход из программы\n"+
                        "Ввод:");

            command = scan.next().toString();

        if(Objects.equals(command, add) || Objects.equals(command, list) ||
                Objects.equals(command, update) || Objects.equals(command, delete) ||
                Objects.equals(command, exit) || Objects.equals(command, get)) {
            menuCreate(command, people);
        }

        else System.out.println("Введите команду повторно");
        //проверка на выход из программы
        if(command.equals(exit)){
            enter=false;
}
        }
    }


}
