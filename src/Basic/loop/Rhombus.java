package Basic.loop;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        int i,j,n;
        System.out.println("Input Number: ");
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        for (i = 1; i<=n ; i++) {
            for (j = 1; j<=n-i ; j++) {
                System.out.print(" ");

            }
            for ( j = 1; j<=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
