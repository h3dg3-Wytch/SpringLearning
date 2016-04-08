package HelloWorld;

/**
 * Created by rex on 4/8/16.
 */
public class HelloMessage {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message: " + message);
    }
}
