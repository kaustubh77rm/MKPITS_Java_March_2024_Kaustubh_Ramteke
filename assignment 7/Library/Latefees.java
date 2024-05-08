package Library;

public class Latefees
{
    private static final double FEE_PER_DAY = 20; // Example late fee per day

    public static double calculateLateFees(int daysLate)
    {
        return daysLate * FEE_PER_DAY;
    }
}