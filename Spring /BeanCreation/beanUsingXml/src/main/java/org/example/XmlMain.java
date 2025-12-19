package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {

    public static void main(String[] args) {

        // 1. Load the Spring container using XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // 2. Ask for the 'person' bean from the container
        Person p = context.getBean("person", Person.class);

        // 3. Use the bean
        p.introduce();
    }
}
