package Basic.Switch_Statement;
import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int engID = in.nextInt();
        String compName = in.next();
        switch(engID){
            case 1 :
                System.out.println("Zulkernain");
                break;
            case 2:
                System.out.println("Mukul");
                break;
            case 3:
                System.out.println("Kunal Kushwaha");
                switch(compName){
                    case "Google":
                        System.out.println("Software Engineer");
                        break;
                    case "Microsoft":
                        System.out.println("System Engineer");
                        break;
                    case "CIvo":
                        System.out.println("DevOps Engineer");
                        break;
                    default:
                        System.out.println("Enter a valid Company Name");
                }
                break;
            default:
                System.out.println("Enter a valid engineer ID");
        }
    }
}
