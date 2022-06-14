package Basic.loop;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ball = input.nextInt();
        int bat =1;
        while(bat<=ball){
            System.out.println("bat :" + bat);
            bat++;
        }
    }
}
