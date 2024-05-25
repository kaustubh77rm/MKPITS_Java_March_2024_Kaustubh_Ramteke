package stud;
class Simple2{}
class Reflection2{
    void printName(Object obj){
        Class c=obj.getClass();
        System.out.println(c.getName());
    }
    public static void main(String args[]){
        Simple2 s=new Simple2();
        Reflection2 r=new Reflection2();
        r.printName(s);
    }
}