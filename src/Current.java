import static java.lang.Thread.sleep;

/**
 * Created by rex on 4/18/16.
 */
public class Current {

    public static void main(String[] args){

        new Thread(new DayThread()).run();



    }

    private static class DayThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Good Morning");

            try {
                sleep(2000);
                new NightThread().run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private static class NightThread implements Runnable{
        @Override
        public void run() {

            System.out.println("Good Night");

            try {
                sleep(2000);
                new DayThread().run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
