package logic;

import entity.Princess;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.list;

public class Crud {

    public void read(LinkedHashSet<Princess> people) {
        for(Princess peoples : people){
            System.out.println(peoples.getNumber()+". "
                    +peoples.getName()+"\n  Age: "+ peoples.getAge()+"\n  Hair: "
                    +peoples.getHaircolor()+"\n  Eyes: "+peoples.getEyecolor());
        }
        System.out.println("\n");
    }
    public void add(LinkedHashSet<Princess> people) {

        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int number;
        String name;
        int age;
        String haircolor;
        String eyecolor;


        boolean key = true;
        while (key){
        System.out.println("Для добавления принцессы введите комманду, например 'add 5 Belle 17 Brown Hazel':");
        String command = scan.nextLine();
        String[] words = command.split(" ");
        for(String word : words){
            list.add(word);
        }
        number = Integer.parseInt((String) list.get(0));
        haircolor = list.get(3).toString();
        age =  Integer.parseInt((String) list.get(2));


        if(number<=0){
            list.clear();
            System.out.println("Номер принцессы должен быть больше 0");
        }else {

            for(Princess peoples: people){
                if(number == peoples.getNumber()){
                    key=true;
                    list.clear();
                    System.out.println("Пользователь с таким именем уже существует");break;
                } else if(!haircolor.equals("Black") &&
                        !haircolor.equals("Brown") &&
                        !haircolor.equals("Blonde") &&
                        !haircolor.equals("Platinum-blonde") &&
                        !haircolor.equals("Strawberry-blonde") &&
                        !haircolor.equals("Red")
                ){
                    list.clear();
                    System.out.println("Цвет может быть: Black " + "Blonde " + "Platinum-blonde " +
                            "Strawberry-blonde " + "Red " + "Brown");break;
                }else if(age > 99 | age<=0){
                    list.clear();
                    System.out.println("Некорректный возраст");break;
                }else key=false;
            }
        }

        }
        number = Integer.parseInt((String) list.get(0));
        name = list.get(1).toString();
        age = Integer.parseInt((String) list.get(2));
        haircolor = list.get(3).toString();
        eyecolor = list.get(4).toString();
        people.add(new Princess(number, name, age, haircolor, eyecolor));
        System.out.println("Принцесса " + "'" + name + "'" + " была добавлена");

    }
}

