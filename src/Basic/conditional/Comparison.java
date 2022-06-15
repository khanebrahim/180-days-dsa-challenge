package Basic.conditional;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        //declaring two string
        String str, str1, str2;
        Scanner in =new Scanner(System.in);
        //input first string
        System.out.println("Enter a first str1: ");
        str= in.nextLine();
        //input second string
        System.out.println("Enter a second str2: ");
        str1 = in.nextLine();
        //input third string
        System.out.println("Enter a third str3: ");
        str2 = in.nextLine();

        if (str.compareTo(str1)==0){
            System.out.println("str and str1 are equal.");
        }
        else if (str1.compareTo(str2)==0){
            System.out.println("str1 and str2 are equal.");
        }
        else if(str.compareTo(str2)==0){
            System.out.println("str and str2 are equal.");
        }
        else {
            System.out.println("they are not equal");
        }
    }
}
