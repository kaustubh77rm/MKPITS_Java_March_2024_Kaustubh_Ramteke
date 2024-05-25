package stud;

public class SirCodes
{
    public int codePrint()
    {
        System.out.print("actual values\n");
        System.out.print("2.5 ");
        System.out.print("3.0 ");
        System.out.print("3.5 ");
        System.out.print("\nceil\n");
        System.out.print(""+Math.ceil(2.5));
        System.out.print(" "+Math.ceil(3));
        System.out.print(" "+Math.ceil(3.5));
        System.out.print("\nfloor\n");
        System.out.print(""+Math.floor(2.5));
        System.out.print(" "+Math.floor(3));
        System.out.print(" "+Math.floor(3.5));

        System.out.println("\n\nmaximum value: " + Math.max(1, 2));
        System.out.println("minimum value: " + Math.min(5, 6));
        System.out.println("square root: " + Math.sqrt(81));
        System.out.println("power value: " + Math.pow(3, 5));
        System.out.println("absolute(positive) value: " + Math.abs(-5));
        System.out.println("ceil value: " + Math.ceil(54.00001));

        String string = new String();
        System.out.println(string);

        char c[] = {'a', 'b', 'c', 'd', 'e', 'f' };
        String string2 = new String(c);
        System.out.println(c);

        String string3 = new String(c, 1, 3);
        System.out.println(string3);

        int[] bytes = new int[]{65, 66, 67, 68};
        System.out.println(new String(bytes, 1, 2));

        return 0;
    }
}
/*
SirCodes s = new SirCodes();
System.out.println(s.codePrint());
*/