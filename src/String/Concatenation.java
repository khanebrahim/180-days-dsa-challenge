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
//        System.out.println(firstName.compareTo(lastName));
//        System.out.println(lastName.compareTo(firstName));
//        String finalName = firstName.concat(lastName);
//        System.out.println(lastName.contains("Kh"));
//        System.out.println(finalName);
//        System.out.println(firstName.startsWith("Eb"));
//        System.out.println(firstName.endsWith("an"));
//        System.out.println(firstName.indexOf('a'));

        String middleName = firstName.substring(6);
        System.out.println(middleName);

        char[] names = firstName.toCharArray();
        for (int i = 0; i< names.length;i++){
            System.out.println(names[i]);
        }


    }
}
