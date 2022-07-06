package Basic.Pattern;

public class DownardTraingle1 {
    public static void main(String[] args) {
        int n =6;
        pattern8(n);
    }
    static void pattern8(int n){
        for (int i = 1; i<=n; i++) {
            for (int j =n;j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
