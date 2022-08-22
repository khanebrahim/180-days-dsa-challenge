package String;

public class WhyStringBuffer {
    public static void main(String[] args) {
        //String
//        String language = "I Love Java Programming. ";
//        String result = " ";
//        long start = System.currentTimeMillis();
//        for (int i = 1; i <40000 ; i++) {
//            result +=language;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
//        System.out.println(result);
        // String Buffer
        StringBuffer buffer = new StringBuffer();
        String bd = "I Love my Allah";
        long startB = System.currentTimeMillis();
        for (int i = 1; i <50000; i++) {
            buffer.append(bd);
        }
        long endB = System.currentTimeMillis();
        System.out.println(endB-startB);
//        System.out.println(buffer);
    }
}
