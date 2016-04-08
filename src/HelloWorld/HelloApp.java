package HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rex on 4/8/16.
 */
public class HelloApp{

    public static void main(String[] args){
        //This Apli oloads beans config files and it takes care of objects
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloMessage message = (HelloMessage) context.getBean("helloWorld");

        message.getMessage();
    }
}
