package String;

public class BufferString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("How ");
        sb.append("are ");
        sb.append("you ");
        sb.append("Baizid ");
        System.out.println(sb);
        System.out.println(sb.toString());

        char [] chars = new char[3];
        sb.getChars(6,9,chars,0);
        System.out.println(new String(chars));

        StringBuffer sb2 = new StringBuffer("Habiba ");
        sb2.insert(sb2.length(),"Hello");
        System.out.println(sb2);
        System.out.println(sb2.reverse());


    }
}
