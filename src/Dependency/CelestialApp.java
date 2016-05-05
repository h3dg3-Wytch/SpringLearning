package Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;

/**
 * Created by rex on 5/5/16.
 */
public class CelestialApp {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Sun sol = (Sun) context.getBean("sun");
        sol.orbit();

    }
}
