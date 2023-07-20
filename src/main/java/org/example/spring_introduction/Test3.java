package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       //Pet pet = context.getBean("myPet", Pet.class); после того как создали в xml bean Person эта строка не нужна

        //Pet pet = new Dog();  //////////////////////без spring
        //Person person = new Person(pet); после того как создали в xml bean Person эта строка не нужна

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();


    }
}
