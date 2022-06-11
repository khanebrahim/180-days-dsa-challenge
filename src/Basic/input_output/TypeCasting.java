package Basic.input_output;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float sakib = input.nextInt();
        System.out.println(sakib); //input=45 but output=45.0

        // type casting 45.97 = 45
        int tamim =(int)(45.97);
        System.out.println("tamim number " + tamim);
        // Automatic type promotion in expression
        /*
        int a = 257;
        byte b= (byte)(a); // 257%256=1
        System.out.println(b);
        */
        byte a =50;
        byte b =10;
        byte c =20;
        int d = (a*b)/c; // type Casting
        System.out.println(d);

        int letter = 'a';
        System.out.println(letter);

    }
}
