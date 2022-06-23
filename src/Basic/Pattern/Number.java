package Basic.Pattern;

public class Number {
    public static void main(String[] args) {
        int n=5;
        pattern3(n);
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");

            }
            System.out.println();

        }
    }
}
