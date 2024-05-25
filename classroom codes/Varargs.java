package stud;

public class Varargs {

    public void sum(int ... num)
    {
        int sum=0;
        for(int i:num)
        {
            sum=sum+i;
        }
        System.out.println(""+sum);
        }
}
/*
Varargs v = new Varargs();
v.sum(1,2,3,4,5);
*/