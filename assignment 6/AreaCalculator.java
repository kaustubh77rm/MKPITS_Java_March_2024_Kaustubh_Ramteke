//package stud;
import java.util.Scanner;

public class AreaCalculator
{
Scanner scanner = new Scanner(System.in);

    public int squareArea(int side)
    {
     return side*side;
    }

    public int rectangleArea(int base, int height)
    {
        return base*height;
    }
    public double circleArea(int radius)
    {
        return 3.14 * radius * radius;
    }
    public double triangleArea(int base, int height)
    {
        return 0.5 * base * height;
    }
}
public void main()
{
    Scanner scanner = new Scanner(System.in);
    AreaCalculator a = new AreaCalculator();

    System.out.println("find area of:\n1 square\n2 rectangle\n3 circle\n4 triangle\n");
    int input = scanner.nextInt();
    switch(input)
    {
        case 1:
            System.out.println("enter side:");
            int side = scanner.nextInt();
            System.out.println("area of square:"+a.squareArea(side));
            break;

        case 2:
            System.out.println("enter length breadth:");
            int length1 = scanner.nextInt();
            int breadth1 = scanner.nextInt();
            System.out.println("area of rectangle:"+a.rectangleArea(length1, breadth1));
            break;

        case 3:
            System.out.println("enter radius:");
            int radius = scanner.nextInt();
            System.out.println("area of radius:"+a.circleArea(radius));
            break;

        case 4:
            System.out.println("enter length & breadth:");
            int length = scanner.nextInt();
            int breath = scanner.nextInt();
            System.out.println("area of triangle:"+a.triangleArea(length,breath));
            break;
    }
}
/*
Scanner scanner =  new Scanner(System.in);
AreaCalculator a = new AreaCalculator();

                System.out.println("find area of:\n1 square\n2 rectangle\n3 circle\n4 triangle\n");
int input = scanner.nextInt();
                switch(input)
        {
        case 1:
        System.out.println("enter side:");
int side = scanner.nextInt();
                                System.out.println("area of square:"+a.squareArea(side));
        break;
        case 2:
        System.out.println("enter length breadth:");
int length1 = scanner.nextInt();
int breadth1 = scanner.nextInt();
                                System.out.println("area of rectangle:"+a.rectangleArea(length1, breadth1));
        break;
        case 3:
        System.out.println("enter radius:");
int radius = scanner.nextInt();
                                System.out.println("area of radius:"+a.circleArea(radius));
        break;
        case 4:
        System.out.println("enter length & breadth:");
int length = scanner.nextInt();
int breath = scanner.nextInt();
                                System.out.println("area of triangle:"+a.triangleArea(length,breath));
        break;
        }

        */