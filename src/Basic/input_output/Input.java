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

        //input a jersey number
        System.out.println("Please input your Jersey Number: ");
        int jerseyNumber = input.nextInt();
        System.out.println("You Jersey Number is " + jerseyNumber);

        int num =input.nextInt(); //int number
        System.out.println(num);

        String player = input.nextLine();
        System.out.println(player);


    }
}
