package Basic.Function;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int result = Add();
        System.out.println(result);

    }
    static int Add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = in.nextInt();
        int sum = num1+num2 ;
        return sum;
    }
}
