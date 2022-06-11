package Basic.input_output;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println("7888");

        //scanner input string and int number
        Scanner input =new Scanner(System.in);
        System.out.println(input.nextLine()); //input string
        System.out.println(input.nextInt()); //input int number
    }
}
