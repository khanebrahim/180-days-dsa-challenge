package Basic.loop;
import java.util.Scanner;
public class HollowRightTraingle {
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("Input user Number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
