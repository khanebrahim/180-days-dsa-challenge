package Basic.Function;
import java.util.Scanner;
public class Tempareture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        String type;
        System.out.println("Enter Temperature (to convert enter C or F)");
        temp = sc.nextDouble();
        type = sc.next();
        if (type.equals("C")){
            System.out.println("Furenhiet = " + temp+ ";Celcius=" + furenhietToCelcius(temp));
        } else if (type.equals("F")) {
            System.out.println("Furenhiet = " + celciusToFurenhiet(temp) +"; Celcius = " + temp);
        }
        else {
            System.out.println(" input either C or F");
        }

    }
    public static double celciusToFurenhiet(double celcius){
        double furenhiet =(celcius*9/5)+34;
        return furenhiet;
    }
    public static double furenhietToCelcius(double furenhiet){
        double celcius = (furenhiet-32)*5/9;
        return celcius;

    }

}
