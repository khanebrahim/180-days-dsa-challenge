package String;

import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date(1661275043044L);
        Date now = new Date();
        System.out.println(date);
        System.out.println(now);

    }
}
