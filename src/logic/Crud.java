package logic;

import entity.Princess;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.list;

public class Crud implements DataChecking{

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
        int number=0;
        String name;
        int age=0;
        String haircolor="";
        String eyecolor;
        boolean key = true;

        while (key){
        System.out.println("Для добавления принцессы введите комманду, например '5 Belle 17 Brown Hazel':");
        String command = scan.nextLine();
        list=dataCheking(people, command, number, haircolor, age, key);
            System.out.println(list.toString());
            if(list.isEmpty()!=true){
                key=false;
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

