package Basic.input_output;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int player1_Score = input.nextInt();
        int player2_Score = input.nextInt();
        int total_scores = player1_Score + player2_Score;
        System.out.println("Total Scores = " + total_scores);
    }
}
