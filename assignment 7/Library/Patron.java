package Library;

public class Patron
{
    private String name;
    private int memberId;

    public Patron(String name, int memberId)
    {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName()
    {
        return name;
    }

    public int getMemberId()
    {
        return memberId;
    }
}