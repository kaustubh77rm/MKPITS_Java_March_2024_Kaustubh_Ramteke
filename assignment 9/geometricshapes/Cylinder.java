package geometricshapes;

public class Cylinder extends CalculateVolume{
    private int radius,height;
    public Cylinder(int radius, int height)
    {
        this.radius=radius;
        this.height=height;
    }
    @Override
    public void volumeCal() {
        System.out.println("cylinder volume:"+((22/7) * radius * radius * height));
    }
}
