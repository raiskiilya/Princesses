package logic;

import entity.Princess;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public interface DataChecking {
      default ArrayList dataCheking(LinkedHashSet<Princess> people, String command,
                                    int number, String haircolor, int age, boolean key, String name){
         ArrayList list = new ArrayList();
          String[] words = command.split(" ");
          for(String word : words){
              list.add(word);
          }
          try{
              number = Integer.parseInt((String) list.get(0));
              name = list.get(1).toString();
              age =  Integer.parseInt((String) list.get(2));
              haircolor = list.get(3).toString();
          }
          catch(Exception ex){
              number = Integer.parseInt((String) list.get(0));
              name = list.get(1).toString()+" "+list.get(2).toString();
              age =  Integer.parseInt((String) list.get(3));
              haircolor = list.get(4).toString();

          }


          if(number<=0){
              list.clear();
              System.out.println("Номер принцессы должен быть больше 0");
          }else {

              for(Princess peoples: people){
                  if(number == peoples.getNumber()){
                      list.clear();
                      System.out.println("Пользователь с таким номером уже существует");break;
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
                  }
              }
          }
        return list;
      }
}
