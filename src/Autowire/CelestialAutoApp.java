package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rex on 5/5/16.
 */
public class CelestialAutoApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Sun sol = (Sun) context.getBean("sun");

        sol.orbit();
        System.out.println(sol.getName());

    }
}
