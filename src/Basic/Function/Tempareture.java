package Basic.Function;

public class Tempareture {
    public static void main(String[] args) {
        System.out.println(celciusToFurenhiet(30));
        System.out.println(furenhietToCelcius(86));

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
