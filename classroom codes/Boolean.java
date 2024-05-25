package stud;

public class Boolean {
    int var1, var2;

    void display() {
        var1 = 12;
        Integer w = new Integer(var1); //boxing
        var2 = w.intValue(); //unboxing
    }

    public static void main(String[] args) {
        Boolean b = new Boolean();
        b.display();
        System.out.println(b.var2);
    }
}