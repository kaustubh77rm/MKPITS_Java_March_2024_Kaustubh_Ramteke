package geometricshapes;

public class Sphere extends CalculateVolume{
    private int radius;

    public Sphere(int radius)
    {
        this.radius=radius;
    }
    @Override
    public void volumeCal() {
        System.out.println("sphere volume:"+((4/3)*(22/7)*radius));
    }
}
