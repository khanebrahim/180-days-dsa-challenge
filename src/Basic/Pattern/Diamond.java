package Basic.Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n =5;
        pattern5(n);
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColRow = row>n ? 2*n -row:row;
            int noOfSpaces = n- totalColRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");

            }
            for (int col = 0; col < totalColRow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}