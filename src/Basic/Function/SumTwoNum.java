package Basic.Function;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class SumTwoNum {
    public static void main(String[] args) {
      sum();
    }
    static void sum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The SumTwoNum= " + sum);
    }
}
