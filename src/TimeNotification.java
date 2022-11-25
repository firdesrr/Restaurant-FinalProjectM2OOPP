import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimeNotification {
    public static void printNotification() {
        Order order=OrderFactory.createAnOrder();
        Timer T = new Timer();
         final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        TimerTask notification = new TimerTask(){
            @Override
            public void run(){
                System.out.println(ANSI_RED + "Serve the table" + ANSI_RESET);
                           }
        };
        Calendar date = Calendar.getInstance();
        date.set(2022, Calendar.NOVEMBER, 25, 20, 56, 0);
        T.schedule(notification, date.getTime());
    }
}
