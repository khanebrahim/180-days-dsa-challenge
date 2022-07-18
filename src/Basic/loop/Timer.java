package Basic.loop;
import java.util.Scanner;
public class Timer {
    public static void main(String[] args) throws InterruptedException {
        int limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter the amount of second : ");
        limit = sc.nextInt();
        for (int i=limit; i>=0; i--){
            System.out.println("\033[H\033[2J");
            System.out.println("Time Left : " + i);
            Thread.sleep(1000);
        }
        System.out.println("count Down complete");
    }
}
