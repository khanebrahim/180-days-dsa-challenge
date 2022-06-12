package Basic.conditional;
import java.util.Scanner;
public class Transfer_condition {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int salary = input.nextInt();
        System.out.println("Enter a salary is : " + salary);

        int bonus = input.nextInt();
        System.out.println("Enter a bonus is : " + bonus);

        int WeekOffDays = input.nextInt();
        System.out.println("Enter a off day is : " + WeekOffDays);

        if (salary>=600000 && bonus>5000 && WeekOffDays>=2){
            System.out.println("Messi is a eligible");
        }
        else if(salary>=400000 && bonus>3000 && WeekOffDays>=2) {
            System.out.println("Ronaldo is a eligible");
        } else if (salary>300000 || bonus>90000 && WeekOffDays>=3 ) {
            System.out.println("Neymar is a eligible");
        }
        else {
            System.out.println("Harry Maguire is a eligible ");
        }
    }
}
