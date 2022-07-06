package Basic.Pattern;

public class RightTriangle1 {
    public static void main(String[] args) {
        int n =7;
        pattern7(n);
    }
    static void pattern7(int n){
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
