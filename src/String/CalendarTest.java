package String;
import java.util.Calendar;
public class CalendarTest {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
//        System.out.println(now);
        System.out.println("hour : " + now.get(Calendar.HOUR));
        System.out.println("minute : " + now.get(Calendar.MINUTE));
        System.out.println("month : " + now.get(Calendar.MONTH));
        System.out.println("month : " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("year : " + now.get(Calendar.YEAR));
        System.out.println("month : " + now.get(Calendar.WEEK_OF_MONTH));
        System.out.println("month : " + now.get(Calendar.DAY_OF_YEAR));
    }
}