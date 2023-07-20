package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        // если scope будет prototype ресурсы нужно закрывать самим, метод destroy вызываться не будет

        context.close();


    }
}
