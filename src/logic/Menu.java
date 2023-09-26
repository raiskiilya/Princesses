package logic;

import entity.Princess;

import java.util.*;

public interface Menu  {

    default void menuCreate(String command, LinkedHashSet<Princess> people){
        Crud crud = new Crud();
        String exit = "exit";
        switch (command){
            case "add":
                crud.add(people);break;
            case "list":
                crud.read(people); break;
            case "update":
                System.out.println("update");break;
            case "delete":
                System.out.println("delete");break;
            case "exit":
                System.out.println("Программа завершена");break;
        }


    }
}
