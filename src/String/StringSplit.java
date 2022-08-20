package String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringSplit {
    public static void main(String[] args) {
        String players = "Shakib Devilliers Rohit Babar Buttler Warner Moen Hardik Rashiid Shahin Bumrah Boult";

          String[] player = players.split(" ");
//        System.out.println(Arrays.toString(player));
//        System.out.println(player[2]);
        StringTokenizer token = new StringTokenizer(players);
        while(token.hasMoreTokens()){
            System.out.println(token.countTokens());
            System.out.println(token.nextToken().toUpperCase());
        }

    }
}
