static class Outerclass {
    int x = 10;

    class Innerclass {int y = 5;
    }
}
    public void main(String[] args)
    {
        Outerclass o = new Outerclass();
        Outerclass.Innerclass i = o.new Innerclass();
        System.out.println(i.y + o.x);
    }