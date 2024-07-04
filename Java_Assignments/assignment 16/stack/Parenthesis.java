package assn_16.stack;
import java.util.*;

public class Parenthesis{
    public boolean check(String string) {
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char c=string.charAt(i);
            if (isopening(c)==true) {
                stack.push(c);
            }
            else if (isclosing(c)) {
                if (stack.isEmpty() || !ismatching(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isopening( char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isclosing(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public boolean ismatching(char a,char b) {
        if (a=='(' && b==')') {
            return true;
        }
        else if (a=='{' && b=='}') {
            return true;
        }
        else if (a=='[' && b==']') {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter parenthesis:");
        String str= s.nextLine();
        Parenthesis p =new Parenthesis();{{}
        boolean result=p.check(str);
        System.out.println(result);
    }
  }
}