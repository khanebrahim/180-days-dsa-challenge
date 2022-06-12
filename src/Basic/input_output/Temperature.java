package Basic.input_output;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Today Temperature in Dhaka C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC *9/5) + 32;
        System.out.println(tempF);
    }
}
