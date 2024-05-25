package stud;

class Reflection3{
    public static void main(String args[]){
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Reflection3.class;
        System.out.println(c2.getName());
    }
}