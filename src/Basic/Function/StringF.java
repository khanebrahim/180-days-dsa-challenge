package Basic.Function;
import java.util.Scanner;
public class StringF {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
        String personalInfo = myInfo(name);
        System.out.println(personalInfo);
    }

     static String myInfo(String name) {
        String message = "Hi " + name;
        return  message;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
