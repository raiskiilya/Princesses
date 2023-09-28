package logic;

import entity.Princess;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.list;

public class Crud implements DataChecking{
    int number=0;
    String name="";
    int age=0;
    String haircolor="";
    String eyecolor="";
    boolean key = true;


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


        while (key){
        System.out.println("Для добавления принцессы введите комманду, например '5 Belle 17 Brown Hazel':");
        String command = scan.nextLine();
        list=dataCheking(people, command, number, haircolor, age, key, name, eyecolor);
            if(list.isEmpty()!=true){
                key=false;
            }
        }
        System.out.println("Размер коллекции "+list.size());
        if(list.size() == 5){
            number = Integer.parseInt((String) list.get(0));
            name = list.get(1).toString();
            age = Integer.parseInt((String) list.get(2));
            haircolor = list.get(3).toString();
            eyecolor = list.get(4).toString();
            people.add(new Princess(number, name, age, haircolor, eyecolor));
            System.out.println("Принцесса " + "'" + name + "'" + " была добавлена");
        }else {
            number = Integer.parseInt((String) list.get(0));
            name = list.get(1).toString()+" "+list.get(2).toString();
            age = Integer.parseInt((String) list.get(3));
            haircolor = list.get(4).toString();
            eyecolor = list.get(5).toString();
            people.add(new Princess(number, name, age, haircolor, eyecolor));
            System.out.println("Принцесса " + "'" + name + "'" + " была добавлена");
        }
    list.clear();
    }
    public void get(LinkedHashSet<Princess> people) {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println("Для отображения принцессы введите её id");
        try{int command = scan.nextInt();
            for(Princess peoples: people){
                if(command == peoples.getNumber()){
                    System.out.println(peoples.getName()+
                            "\n Age: "+peoples.getAge()+
                            "\n Hair: "+ peoples.getHaircolor()+
                            "\n Eyes: "+ peoples.getEyecolor());break;
                }else {
                    System.out.println("Такой принцессы не существует");
                    break;
                }
            }
        }catch (Exception ex){
            System.out.println("Вы ввели какую-то дичь, не будьте Васей и повторите попытку");
            get(people);
        }

    }
    public void update(LinkedHashSet<Princess> people) {

    }
    public void delete(LinkedHashSet<Princess> people) {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println(people);
        System.out.println("Для удаления принцессы введите её id");
        try{int command = scan.nextInt();
            for(Princess peoples: people){
                if(command == peoples.getNumber()){
                    System.out.println("Принцесса "+"' "+peoples.getName()+" '"+" была удалена");
                    people.remove(peoples);break;
                }
            }
        }catch (Exception ex){
            System.out.println("Вы ввели какую-то дичь, не будьте Васей и повторите попытку");
            delete(people);
        }

    }
}

