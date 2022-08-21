package String;
public class StringLiteral {
    public static void main(String[] args) {
//        byte[] bt = {65,66,67};
//        String str = new String(bt);
//        System.out.println(str); // A,B,C

//          String str = "Java is a famous language";
//          String str3 = "Java is a famous language";
//          System.out.println(str==str3); //true

        String str3 = new String("Java is my fav language");
        String str4 = new String("Java is my fav language");
        String str5 = new String("java is my fav language");
//          System.out.println(str3==str4); //false

        // System.out.println(str3.equals(str4));  //true

        System.out.println(str3.equalsIgnoreCase(str5)); //true

    }
}