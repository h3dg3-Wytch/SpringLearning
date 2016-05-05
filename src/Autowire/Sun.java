package Autowire;

/**
 * Created by rex on 5/5/16.
 */
public class Sun {

    private Planet planet;
    private String name;

    public Sun(){

    }
    public Sun(Planet planet, String name){
        System.out.println("Inside the Sun constructor");
        this.planet = planet;
        this.name = name;
    }

    public void orbit(){
        System.out.println("Brining in planets to orbit");
        planet.orbit();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

}
