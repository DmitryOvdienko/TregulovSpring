package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

       // Dog myDog = context.getBean("myPet", Dog.class);
        //myDog.setName("Belka");
        //Dog yourDog = context.getBean("myPet", Dog.class);
        //yourDog.setName("Strelka");

       // System.out.println(myDog.getName());      //здесь
        //System.out.println(yourDog.getName());    // и здесь вывод будет одинаковый "Стрелка" т.к используется singltone scope
        // singltone scope используется для бинов которые не нужно изменять
        // если prototype scope (в файле applicationContext.xml) будет false
        // prototype scope подходит для stateful объектов - это те объекты которые хранят состояние - имя собаки

        //System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog==yourDog));  //если scope будет singltone будет true, если prototype scope бужет false
        //System.out.println(myDog);
        //System.out.println(yourDog);

        context.close();
    }
}
