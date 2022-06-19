package Basic.Switch_Statement;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player = in.next();
   /*
   if (player.equals("Shakib")){
      System.out.println("king of bd cricket");
        }
   if (player.equals("Mustafiz")){
      System.out.println("The best bowler");
        }
    */
        //Switch Case
        switch (player){
            case "Shakib":
                System.out.println("The king of bd cricket");
                break;
            case "Tamim":
                System.out.println("The best top order batsman");
                break;
            case "Mushfiqur":
                System.out.println("Best wicket kipper batsman");
                break;
            case "Liton":
                System.out.println("Best batsamn in this time");
                break;
            case "Afif":
                System.out.println("The promising cricketer");
                break;
            case "Taskin":
                System.out.println("The Speed star");
                break;
            case "Mustafiz":
                System.out.println("The best bowler");
                break;
            default:
                System.out.println("Please enter a valid player");
        }

    }
}
