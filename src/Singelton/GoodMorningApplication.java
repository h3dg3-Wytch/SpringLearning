package Singelton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;

/**
 * Created by rex on 5/5/16.
 */
public class GoodMorningApplication {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        GoodMorning obj1 = (GoodMorning)  context.getBean("goodMorning");
        obj1.getMessage1();
        obj1.getMessage2();

        GoodNight obj2 = (GoodNight) context.getBean("goodNight");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();

    }
}
