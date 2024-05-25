package stud;

public class GetSet
{
    private int marks;
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMarks(int marks)
    {
        this.marks=marks;
    }

    public int getMarks()
    {
        return marks;
    }
}