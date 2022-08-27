package String;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//        String dateString = "2022-8-27";
//        Date date = simpleDateFormat.parse(dateString);
//        System.out.println(date);
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));


    }
}
