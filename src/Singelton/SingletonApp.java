package Singelton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rex on 4/8/16.
 */
public class SingletonApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        SingeltonMessage msg1 = (SingeltonMessage) context.getBean("singletonMessage");

        msg1.setMessage("I'm message one haha");
        msg1.getMessage();

        SingeltonMessage msg2 = (SingeltonMessage) context.getBean("singletonMessage");
        msg2.getMessage();
    }
}
