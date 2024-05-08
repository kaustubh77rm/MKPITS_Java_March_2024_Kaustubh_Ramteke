package geometricshapes;

public class Cube extends CalculateVolume{
    private int edge;

    public Cube(int edge)
    {
        this.edge=edge;
    }
    @Override
    public void volumeCal() {
        System.out.println("cube volume:"+(edge*edge*edge));
    }
}