package Basic.loop;
import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        int i,j,rows,cols;
        System.out.println("Hollow Square:");
        Scanner in = new Scanner(System.in);
        System.out.println("rows:");
        rows=in.nextInt();
        System.out.println("Cols:");
        cols=in.nextInt();
        for (i = 1; i <=rows; i++) {
            for (j = 1; j<=cols; j++) {
              if(i==1 || i==rows || j==1 || j==cols){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
            }
            System.out.println();

        }
    }
}
