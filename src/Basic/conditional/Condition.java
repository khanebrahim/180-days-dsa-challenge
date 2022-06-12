package Basic.conditional;

public class Condition {
    public static void main(String[] args) {
        int matchWinPrice = 100000;

        if (matchWinPrice>90000){

            matchWinPrice += 1000;
        }
        else{
            matchWinPrice += 500;
        }
        System.out.println(matchWinPrice);
    }
}
