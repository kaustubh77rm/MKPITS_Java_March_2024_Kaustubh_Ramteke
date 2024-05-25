package stud;
public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("1");
        sb.append(" ");
        sb.append("2");
        String message = sb.toString();
        System.out.println(message);
    }
}