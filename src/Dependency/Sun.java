package Dependency;

/**
 * Created by rex on 5/5/16.
 */
public class Sun {

    private Planet planet;

    public void setPlanet(Planet planet) {
        System.out.println("Inside set Planet ");
        this.planet = planet;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void orbit(){
        System.out.println("Brining in planets to orbit");
        planet.orbit();
    }

    // Constructor Dependency
//    private Planet planet;
//
//    public Sun(Planet planet){
//        System.out.println("Inside the Sun constructor");
//        this.planet = planet;
//    }
//
//    public void orbit(){
//        System.out.println("Brining in planets to orbit");
//        planet.orbit();
//    }
}
