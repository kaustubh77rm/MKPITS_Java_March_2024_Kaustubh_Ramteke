package shape;

public class Rectangle extends Shape
{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calArea()
    {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}