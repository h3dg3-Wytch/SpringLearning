package Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by rex on 5/5/16.
 */
public class Collections {

    List list;
    Set set;
    Map map;
    Properties prop;

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public List getList() {
        System.out.println("List items: " + list);
        return list;
    }

    public Set getSet() {
        System.out.println("Set items: " + set);
        return set;
    }

    public Map getMap() {
        System.out.println("Map items: " + map);
        return map;
    }

    public Properties getProp() {
        System.out.println("Prop items: " + prop);

        return prop;
    }
}
