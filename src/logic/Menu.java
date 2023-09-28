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
                crud.update(people);break;
            case "get":
                crud.get(people);break;
            case "delete":
                crud.delete(people);break;
            case "exit":
                System.out.println("Программа завершена");break;
        }


    }
}
