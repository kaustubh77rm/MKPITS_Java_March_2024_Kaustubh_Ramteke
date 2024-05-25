package stud;
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> stringClass = String.class;

        System.out.println("Class Name:" + stringClass.getName());

        Method[] methods = stringClass.getMethods();
        System.out.print("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Constructor<?> constructor = stringClass.getConstructor(String.class);
        String str = (String) constructor.newInstance("Hello, Reflection!");

        Method lengthMethod = stringClass.getMethod("length");
        System.out.print("Length of string: " + lengthMethod.invoke(str));

        Field valueField = stringClass.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[]) valueField.get(str);
        value[0] = 'h';
        System.out.print("Modified String: " + str);
    }
}