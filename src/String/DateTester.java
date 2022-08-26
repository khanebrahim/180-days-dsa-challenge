package String;

import java.time.Instant;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date(1661275043044L);
        Date now = new Date();
        System.out.println(date);
        System.out.println(now);

        System.out.println(now.after(date));
        System.out.println(now.compareTo(date));
        Instant instant = Instant.now();
        Date newDate =Date.from(instant);
        System.out.println(instant);
        System.out.println(newDate);
        System.out.println(System.currentTimeMillis());

    }
}
