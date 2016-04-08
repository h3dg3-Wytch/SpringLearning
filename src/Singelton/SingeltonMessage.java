package Singelton;

/**
 * Created by rex on 4/8/16.
 */
public class SingeltonMessage {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message: " + message);
    }

}
