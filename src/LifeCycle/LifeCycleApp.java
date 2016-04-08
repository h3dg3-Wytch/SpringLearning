package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rex on 4/8/16.
 */
public class LifeCycleApp {

    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        LifeCycleMessage message = (LifeCycleMessage) context.getBean("lifeCycleMessage");
        message.getMessage();
        context.registerShutdownHook();

    }
}
