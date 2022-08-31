package String;
import java.util.GregorianCalendar;
public class GregorianCalendarTest {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        GregorianCalendar calendar1 = new GregorianCalendar(2022, 10, 1,0,0,25);
        GregorianCalendar calendar2 = new GregorianCalendar(2023, 5, 23,0,0,25);
        System.out.println(calendar.getTime());
        System.out.println(calendar1.getTime());
        System.out.println(calendar2);
    }
}

