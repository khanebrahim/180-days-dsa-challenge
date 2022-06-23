package Basic.Pattern;

public class rightTriangle {
    public static void main(String[] args) {
        int n=5;
        pattern2(n);
    }
     static void  pattern2(int n){
         for (int row = 0; row <=n ; row++) {
             for (int col = 0; col <=row ; col++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
