package Singelton;

/**
 * Created by rex on 5/5/16.
 */
public class GoodMorning {

    private String message1;
    private String message2;

    public void setMessage1(String message){
        this.message1  = message;
    }

    public void setMessage2(String message){
        this.message2  = message;
    }

    public void getMessage1(){
        System.out.println("time Message1 : " + message1);
    }

    public void getMessage2(){
        System.out.println("Time Message2 : " + message2);
    }

    public void init(){
        System.out.println("goodbye night");
    }

    public void destroy(){
        System.out.println("Hello Moon");
    }
}
