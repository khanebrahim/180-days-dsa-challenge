package Basic.loop;
import java.util.Scanner;
public class RectangleStar {
    public static void main(String[] args) {
        int i,j,rows,cols;
        System.out.println("Rectangle Star Print: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Rows:");
        rows=in.nextInt();
        System.out.println("Columns:");
        cols=in.nextInt();
        for (i = 1; i <=rows ; i++) {
            for (j = 1; j<=cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
