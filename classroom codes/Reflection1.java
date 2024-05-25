package stud;
class A{}
public class Reflection1{
    public static void main(String args[]) throws Exception {
        Class c=Class.forName("A");
        System.out.println(c.getName());
    }
}