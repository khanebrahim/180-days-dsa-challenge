package Basic.loop;
import java.util.Scanner;
public class Bitcoin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        for (int bitcoin = 0; bitcoin < n; bitcoin++) {
            System.out.println(bitcoin + " ");
        }
    }
}
