package Basic.input_output;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String player ="Shakib";
        System.out.println(player.charAt(3));
        //upper_lower case
        char ch= input.next().trim().charAt(0);
        if(ch>='a' && ch>='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}
