package Basic.Pattern;

public class Star {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
