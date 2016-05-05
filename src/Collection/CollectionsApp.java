package Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rex on 5/5/16.
 */
public class CollectionsApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Collections collections = (Collections) context.getBean("collections");

        collections.getList();
        collections.getSet();
        collections.getMap();
        collections.getProp();

    }

}
