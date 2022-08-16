package String;

public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Ebrahim Khan";
        String lastName = "Iqbal Khan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        int age = 22;
        String str = age + "";
        System.out.println(str);
        for (int i = 0; i <firstName.length(); i++) {
            char ch = firstName.charAt(i);
            if(ch=='a'){
                System.out.print(ch + " ");
            }
        }
        System.out.println(firstName.compareTo(lastName));
        System.out.println(lastName.compareTo(firstName));
        String finalName = firstName.concat(lastName);
        System.out.println(lastName.contains("Eb"));
        System.out.println(finalName);


    }
}
