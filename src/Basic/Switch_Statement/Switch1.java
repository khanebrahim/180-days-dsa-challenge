package Basic.Switch_Statement;
import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String language = in.next();
        switch (language){
            case "Java" -> System.out.println("Java is used for android development ");
            case "Javascript" -> System.out.println("Javascript is used for web development");
            case "Python" -> System.out.println("Python is used for DataScience");
            case "C#" -> System.out.println("C# is used for Gaming");
            case "C/C++" -> System.out.println("C/C++ is used for browser and IOT");
            case "Dart" -> System.out.println("Dart is used for Cross Platform");
            case "Go" -> System.out.println("Go is used for Cloud and DevOps");
            default -> System.out.println("Please enter a valid language");

        }
    }
}
