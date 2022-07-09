package Basic.Function;

public class StringF {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        String personalInfo = myInfo("Safa");
        System.out.println(personalInfo);
    }

     static String myInfo(String name) {
        String message = "Hi " + name;
        return  message;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
