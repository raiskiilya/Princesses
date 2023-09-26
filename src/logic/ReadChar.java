package logic;

import entity.Princess;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public interface ReadChar {
    default LinkedHashSet<Princess> readchar() {

        String princesses= "";
        int number;
        String name;
        int age;
        String haircolor;
        String eyecolor;
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        LinkedHashSet<Princess> people = new LinkedHashSet<Princess>();


        try (
                java.io.FileReader reader = new FileReader("disney-princesses.txt")) {


            // читаем посимвольно
            int c;
            //                System.out.print((char) c);
            while ((c = reader.read()) != -1) {
                princesses += String.valueOf((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        //Парсим строку по переходу на новую строку

        String[] words = princesses.split("\n");
        for(String word : words){
            list.add(word);
        }


        //Парсим элементы строки по символу |
        for(int i=0;i<list.size();i++){
        words = list.get(i).toString().split(" [|] ");
            for(String word : words){
               list1.add(word);


        }
            //Добавляем элементы строки в коллекцию
            while(list1.isEmpty()==false){
                number = Integer.parseInt((String) list1.get(0));
            name = list1.get(1).toString();
            age = Integer.parseInt((String) list1.get(2));
            haircolor = list1.get(3).toString();
            eyecolor = list1.get(4).toString();
            people.add(new Princess(number, name, age, haircolor, eyecolor));
            list1.clear();
            }

        }

        return people;
    }

}

